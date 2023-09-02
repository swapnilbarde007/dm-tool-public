package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getSubStepConstraintId() {
        return subStepConstraintId;
    }

    public void setSubStepConstraintId(long subStepConstraintId) {
        this.subStepConstraintId = subStepConstraintId;
    }

    public long getStepId() {
        return stepId;
    }

    public void setStepId(long stepId) {
        this.stepId = stepId;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public String getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(String possibleValues) {
        this.possibleValues = possibleValues;
    }

    public long getServiceProvSubStepId() {
        return serviceProvSubStepId;
    }

    public void setServiceProvSubStepId(long serviceProvSubStepId) {
        this.serviceProvSubStepId = serviceProvSubStepId;
    }

    public long getCommandParameterId() {
        return commandParameterId;
    }

    public void setCommandParameterId(long commandParameterId) {
        this.commandParameterId = commandParameterId;
    }

    public String getCommandParameterName() {
        return commandParameterName;
    }

    public void setCommandParameterName(String commandParameterName) {
        this.commandParameterName = commandParameterName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getFullyQualifiedPath() {
        return fullyQualifiedPath;
    }

    public void setFullyQualifiedPath(String fullyQualifiedPath) {
        this.fullyQualifiedPath = fullyQualifiedPath;
    }

    public long getCommandCircleParameterId() {
        return commandCircleParameterId;
    }

    public void setCommandCircleParameterId(long commandCircleParameterId) {
        this.commandCircleParameterId = commandCircleParameterId;
    }

    public long getCommandCircleId() {
        return commandCircleId;
    }

    public void setCommandCircleId(long commandCircleId) {
        this.commandCircleId = commandCircleId;
    }

    public String getCommandInterface() {
        return commandInterface;
    }

    public void setCommandInterface(String commandInterface) {
        this.commandInterface = commandInterface;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public long getErrorNotificationTemplateId() {
        return errorNotificationTemplateId;
    }

    public void setErrorNotificationTemplateId(long errorNotificationTemplateId) {
        this.errorNotificationTemplateId = errorNotificationTemplateId;
    }

    public String getErrorNotificationType() {
        return errorNotificationType;
    }

    public void setErrorNotificationType(String errorNotificationType) {
        this.errorNotificationType = errorNotificationType;
    }

    public String getErrorNotificationText() {
        return errorNotificationText;
    }

    public void setErrorNotificationText(String errorNotificationText) {
        this.errorNotificationText = errorNotificationText;
    }

    public String getErrorNotificationName() {
        return errorNotificationName;
    }

    public void setErrorNotificationName(String errorNotificationName) {
        this.errorNotificationName = errorNotificationName;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorSubType() {
        return errorSubType;
    }

    public void setErrorSubType(String errorSubType) {
        this.errorSubType = errorSubType;
    }

    public String[] getPossibleValuesList() {
        return possibleValuesList;
    }

    public void setPossibleValuesList(String[] possibleValuesList) {
        this.possibleValuesList = possibleValuesList;
    }
}
