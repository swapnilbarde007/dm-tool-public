package com.ericsson.fdp.dao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

public class ProductNodeDTO extends NoConstraintNodeDTO{
    ConstraintNodeDTO constraintNodeDTO;
    String entityValue;

    public ConstraintNodeDTO getConstraintNodeDTO() {
        return constraintNodeDTO;
    }

    public void setConstraintNodeDTO(ConstraintNodeDTO constraintNodeDTO) {
        this.constraintNodeDTO = constraintNodeDTO;
    }

    public String getEntityValue() {
        return entityValue;
    }

    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue;
    }

    public ProductNodeDTO() {
    }

    @Override
    public String toString() {
        return "ProductNodeDTO{" +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", visibility=" + visibility +
                ", aliasCode='" + aliasCode + '\'' +
                ", name='" + name + '\'' +
                ", defaultOption='" + defaultOption + '\'' +
                ", channelName='" + channelName + '\'' +
                ", isActive=" + isActive +
                ", priority=" + priority +
                ", level=" + level +
                ", status=" + status +
                ", parentId=" + parentId +
                ", circle='" + circle + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", policy='" + policy + '\'' +
                ", childList=" + childList +
                ", addInfo=" + addInfo +
                ", aliasCodeDTO=" + aliasCodeDTO +
                ", loanSuccessNotificationId=" + loanSuccessNotificationId +
                ", codNotificationId=" + codNotificationId +
                ", loanFailureNotificationId=" + loanFailureNotificationId +
                ", codSuccessNotificationId=" + codSuccessNotificationId +
                ", rootNodeUSSDCode='" + rootNodeUSSDCode + '\'' +
                ", rootNodeName='" + rootNodeName + '\'' +
                ", mainMenuPriority=" + mainMenuPriority +
                ", mainMenuHeader='" + mainMenuHeader + '\'' +
                ", subMenuPriority=" + subMenuPriority +
                ", subMenuHeader='" + subMenuHeader + '\'' +
                ", subSubMenuPriority=" + subSubMenuPriority +
                ", subSubMenuHeader='" + subSubMenuHeader + '\'' +
                ", subSubSubMenuHeader='" + subSubSubMenuHeader + '\'' +
                ", subSubSubMenuPriority=" + subSubSubMenuPriority +
                ", parentCode='" + parentCode + '\'' +
                ", productDisplayName='" + productDisplayName + '\'' +
                ", productDispalyNameOnWEB='" + productDispalyNameOnWEB + '\'' +
                ", productDisplayNameOnUSSD='" + productDisplayNameOnUSSD + '\'' +
                ", action='" + action + '\'' +
                ", productId=" + productId +
                ", dmChannelType='" + dmChannelType + '\'' +
                ", mainMenuUSSDCode='" + mainMenuUSSDCode + '\'' +
                ", subMenuUSSDCode='" + subMenuUSSDCode + '\'' +
                ", subSubMenuUSSDCode='" + subSubMenuUSSDCode + '\'' +
                ", subSubSubMenuUSSDCode='" + subSubSubMenuUSSDCode + '\'' +
                ", menuType='" + menuType + '\'' +
                ", defaultOptionH='" + defaultOptionH + '\'' +
                ", defaultOptionArabic='" + defaultOptionArabic + '\'' +
                ", defaultOptionOtherLanguage='" + defaultOptionOtherLanguage + '\'' +
                ", directExecutionNodem=" + directExecutionNodem +
                ", autoExecute=" + autoExecute +
                ", rootNodeId=" + rootNodeId +
                ", whitelisted=" + whitelisted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o)){
            if (this == o) return true;
            if (!(o instanceof ProductNodeDTO)) return false;
            if (!super.equals(o)) return false;

            ProductNodeDTO that = (ProductNodeDTO) o;

            if (getConstraintNodeDTO() != null ? !getConstraintNodeDTO().equals(that.getConstraintNodeDTO()) : that.getConstraintNodeDTO() != null)
                return false;
            return getEntityValue() != null ? getEntityValue().equals(that.getEntityValue()) : that.getEntityValue() == null;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getConstraintNodeDTO() != null ? getConstraintNodeDTO().hashCode() : 0);
        result = 31 * result + (getEntityValue() != null ? getEntityValue().hashCode() : 0);
        return result;
    }
}
