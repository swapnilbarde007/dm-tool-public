package com.ericsson.fdp.utilis;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class CustomDTODeserializer extends StdDeserializer<Object> {

    @Autowired
    private ObjectMapper objectMapper;

    public CustomDTODeserializer() {
        super(Object.class);
        this.objectMapper = new ObjectMapper();
    }


    public CustomDTODeserializer(ObjectMapper objectMapper) {
        super(Object.class);
        this.objectMapper = objectMapper;
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String className = node.get("@CLASS").asText();

        try {
            Class<?> clazz = Class.forName(className);
            return objectMapper.treeToValue(node, clazz);
        } catch (ClassNotFoundException e) {
            throw new IOException("Class not found: " + className, e);
        }
    }
}

