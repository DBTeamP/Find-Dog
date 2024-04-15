package com.dbteam.common.dtopackage;

public class CountDTO {
    private int volNum;
    private String volName;
    private int volCount;

    public CountDTO(){

    }

    public CountDTO(int volNum, String volName, int volCount) {
        this.volNum = volNum;
        this.volName = volName;
        this.volCount = volCount;
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

    public int getVolCount() {
        return volCount;
    }

    public void setVolCount(int volCount) {
        this.volCount = volCount;
    }

    @Override
    public String toString() {
        return "CountDTO{" +
                ", volName='" + volName + '\'' +
                ", volCount=" + volCount +
                '}';
    }

}
