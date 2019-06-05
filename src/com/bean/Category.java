package com.bean;

import java.util.Date;

public class Category {
    private Integer cgId;

    private String cgName;

    private Date cgDate;

    private String cgAdmin;

    @Override
    public String toString() {
        return "Category{" +
                "cgId=" + cgId +
                ", cgName='" + cgName + '\'' +
                ", cgDate=" + cgDate +
                ", cgAdmin='" + cgAdmin + '\'' +
                '}';
    }

    public Integer getCgId() {
        return cgId;
    }

    public void setCgId(Integer cgId) {
        this.cgId = cgId;
    }

    public String getCgName() {
        return cgName;
    }

    public void setCgName(String cgName) {
        this.cgName = cgName == null ? null : cgName.trim();
    }

    public Date getCgDate() {
        return cgDate;
    }

    public void setCgDate(Date cgDate) {
        this.cgDate = cgDate;
    }

    public String getCgAdmin() {
        return cgAdmin;
    }

    public void setCgAdmin(String cgAdmin) {
        this.cgAdmin = cgAdmin == null ? null : cgAdmin.trim();
    }

}