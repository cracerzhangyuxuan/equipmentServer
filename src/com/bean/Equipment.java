package com.bean;

import java.util.Date;

public class Equipment {
    private Integer eqId;

    private String eqName;

    private String eqNumber;

    private Integer categoryId;

    private String introduce;

    private Integer amount;

    private Integer loan;

    private Integer numberUse;

    private Date eqDate;

    private String eqAdmin;

    private String images;

    public Integer getEqId() {
        return eqId;
    }

    public void setEqId(Integer eqId) {
        this.eqId = eqId;
    }

    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName == null ? null : eqName.trim();
    }

    public String getEqNumber() {
        return eqNumber;
    }

    public void setEqNumber(String eqNumber) {
        this.eqNumber = eqNumber == null ? null : eqNumber.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getLoan() {
        return loan;
    }

    public void setLoan(Integer loan) {
        this.loan = loan;
    }

    public Integer getNumberUse() {
        return numberUse;
    }

    public void setNumberUse(Integer numberUse) {
        this.numberUse = numberUse;
    }

    public Date getEqDate() {
        return eqDate;
    }

    public void setEqDate(Date eqDate) {
        this.eqDate = eqDate;
    }

    public String getEqAdmin() {
        return eqAdmin;
    }

    public void setEqAdmin(String eqAdmin) {
        this.eqAdmin = eqAdmin == null ? null : eqAdmin.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}