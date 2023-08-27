package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
public class DynamicMenuAddInfoDTO {
    String createdBy;
    String modifiedBy;
    long dynamicMenuAddInfoId;
    long entityId;
    String[] entityType;
    Map<String,String> addInfoMap;

    public DynamicMenuAddInfoDTO() {
    }

    @Override
    public String toString() {
        return "addInfoMap=" + addInfoMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DynamicMenuAddInfoDTO)) return false;
        DynamicMenuAddInfoDTO that = (DynamicMenuAddInfoDTO) o;
        return  Objects.equals(getAddInfoMap(), that.getAddInfoMap());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getAddInfoMap());
        result = 31 * result;
        return result;
    }
}
