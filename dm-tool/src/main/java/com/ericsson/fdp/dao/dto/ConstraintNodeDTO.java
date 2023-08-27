package com.ericsson.fdp.dao.dto;


import lombok.ToString;

import java.util.List;
import java.util.Objects;

@ToString
public class ConstraintNodeDTO extends ProductNodeDTO implements Cloneable {

    protected List<ConstraintStepDTO> stepList;

    public ConstraintNodeDTO() {
    }

    public List<ConstraintStepDTO> getStepList() {
        return stepList;
    }

    public void setStepList(List<ConstraintStepDTO> stepList) {
        this.stepList = stepList;
    }

    @Override
    public ConstraintNodeDTO clone() throws CloneNotSupportedException {
        return (ConstraintNodeDTO) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o)){
            if (this == o) return true;
            if (!(o instanceof ConstraintNodeDTO)) return false;
            ConstraintNodeDTO that = (ConstraintNodeDTO) o;
            return Objects.equals(getStepList(), that.getStepList());
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(getStepList());
    }
}
