package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ConstraintStepDTO {
    String createdBy;
    String modifiedBy;
    long stepId;
    String name;
    int orderValue;
    String operator;
    List<SubStepConstraintDTO> subStepDTOList;
    int chargingDiscountId;

    public ConstraintStepDTO() {
    }
}
