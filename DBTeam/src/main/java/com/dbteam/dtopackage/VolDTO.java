package com.dbteam.dtopackage;

import java.util.Date;

public class VolDTO {
    private int volNum;
    private String volName;
    private String volTxt;
    private java.util.Date volDate;
    private int regionNum;
    private int managerNum;

    public VolDTO() {
    }

    public VolDTO(int volNum, String volName, String volTxt, Date volDate, int regionNum, int managerNum) {
        this.volNum = volNum;
        this.volName = volName;
        this.volTxt = volTxt;
        this.volDate = volDate;
        this.regionNum = regionNum;
        this.managerNum = managerNum;
    }

    public int getVolNum() {
        return volNum;
    }

    public void setVolNum(int volNum) {
        this.volNum = volNum;
    }

    public String getVolName() {
        return volName;
    }

    public void setVolName(String volName) {
        this.volName = volName;
    }

    public String getVolTxt() {
        return volTxt;
    }

    public void setVolTxt(String volTxt) {
        this.volTxt = volTxt;
    }

    public Date getVolDate() {
        return volDate;
    }

    public void setVolDate(Date volDate) {
        this.volDate = volDate;
    }

    public int getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(int regionNum) {
        this.regionNum = regionNum;
    }

    public int getManagerNum() {
        return managerNum;
    }

    public void setManagerNum(int managerNum) {
        this.managerNum = managerNum;
    }

    @Override
    public String toString() {
        return "VolDTO{" +
                "volNum=" + volNum +
                ", volName='" + volName + '\'' +
                ", volTxt='" + volTxt + '\'' +
                ", volDate=" + volDate +
                ", regionNum=" + regionNum +
                ", managerNum=" + managerNum +
                '}';
    }
}
