package com.bean;

/*
* 设备关联表
*
* */
public class EqCorrelation {
    private Integer eqCoId;

    private Integer eqParentId;

    private Integer eqChildId;

    @Override
    public String toString() {
        return "EqCorrelation{" +
                "eqCoId=" + eqCoId +
                ", eqParentId=" + eqParentId +
                ", eqChildId=" + eqChildId +
                '}';
    }

    public Integer getEqCoId() {
        return eqCoId;
    }

    public void setEqCoId(Integer eqCoId) {
        this.eqCoId = eqCoId;
    }

    public Integer getEqParentId() {
        return eqParentId;
    }

    public void setEqParentId(Integer eqParentId) {
        this.eqParentId = eqParentId;
    }

    public Integer getEqChildId() {
        return eqChildId;
    }

    public void setEqChildId(Integer eqChildId) {
        this.eqChildId = eqChildId;
    }
}