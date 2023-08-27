package com.ericsson.fdp.dao.template;

public class KeyValueEntry {

    private String key;
    private String value;

    public KeyValueEntry() {
    }

    public KeyValueEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "" +
                "'" + key + '\'' +
                "--> '" + value + '\'' +
                ' ';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
