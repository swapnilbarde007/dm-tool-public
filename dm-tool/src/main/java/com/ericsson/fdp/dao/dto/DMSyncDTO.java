package com.ericsson.fdp.dao.dto;

import com.ericsson.fdp.utilis.CustomDTODeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class DMSyncDTO {
    ConstraintNodeDTO baseNodeDTO;

    public DMSyncDTO() {

    }

    public DMSyncDTO(ConstraintNodeDTO baseNodeDTO) {
        this.baseNodeDTO = baseNodeDTO;
    }


}
