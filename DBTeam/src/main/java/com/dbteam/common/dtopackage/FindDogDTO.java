package com.dbteam.common.dtopackage;

// regionNum 삭제
public class FindDogDTO {
    private int findNum;
    private String findName;
    private String findTxt;
    private int userNum;

    public FindDogDTO() {
    }

    public FindDogDTO(int findNum, String findName, String findTxt, int userNum) {
        this.findNum = findNum;
        this.findName = findName;
        this.findTxt = findTxt;
        this.userNum = userNum;
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

    @Override
    public String toString() {
        return "FindDogDTO{" +
                "findNum=" + findNum +
                ", findName='" + findName + '\'' +
                ", findTxt='" + findTxt + '\'' +
                ", userNum=" + userNum +
                '}';
    }
}

