package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SubStepConstraintDTO {
    String createdBy;
    String modifiedBy;
    long subStepConstraintId;
    long stepId;
    int orderValue;
    String operator;
    int condition;
    int minValue;
    int maxValue;
    String possibleValues;
    long serviceProvSubStepId;
    long commandParameterId;
    String commandParameterName;
    String dataType;
    String commandName;
    String conditionName;
    String fullyQualifiedPath;
    long commandCircleParameterId;
    long commandCircleId;
    String commandInterface;
    String functionName;
    long errorNotificationTemplateId;
    String errorNotificationType;
    String errorNotificationText;
    String errorNotificationName;
    String errorType;
    String errorSubType;
    String[] possibleValuesList;

    public SubStepConstraintDTO() {
    }
}
