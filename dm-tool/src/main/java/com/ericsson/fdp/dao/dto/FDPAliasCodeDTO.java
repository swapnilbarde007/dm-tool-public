package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class FDPAliasCodeDTO {

    String createdBy;
    String modifiedBy;
    long aliasCodeId;
    long entityId;
    String channelName;
    String code;
    String alias;
    String version;
    String createdOn;
    String modifiedOn;
    int circleId;

    public FDPAliasCodeDTO() {
    }

    @Override
    public String toString() {
        return "code='" + code + '\'' +
                ", alias='" + alias + '\'';
    }
}
