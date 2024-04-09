package com.dbteam.setting.dtopackage;

public class FindDogDTO {
    private int findNum;
    private String findName;
    private String findTxt;
    private int userNum;
    private int regionNum;

    public FindDogDTO() {
    }

    public FindDogDTO(int findNum, String findName, String findTxt, int userNum, int regionNum) {
        this.findNum = findNum;
        this.findName = findName;
        this.findTxt = findTxt;
        this.userNum = userNum;
        this.regionNum = regionNum;
    }

    public int getFindNum() {
        return findNum;
    }

    public void setFindNum(int findNum) {
        this.findNum = findNum;
    }

    public String getFindName() {
        return findName;
    }

    public void setFindName(String findName) {
        this.findName = findName;
    }

    public String getFindTxt() {
        return findTxt;
    }

    public void setFindTxt(String findTxt) {
        this.findTxt = findTxt;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public int getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(int regionNum) {
        this.regionNum = regionNum;
    }

    @Override
    public String toString() {
        return "FindDogDTO{" +
                "findNum=" + findNum +
                ", findName='" + findName + '\'' +
                ", findTxt='" + findTxt + '\'' +
                ", userNum=" + userNum +
                ", regionNum=" + regionNum +
                '}';
    }
}
