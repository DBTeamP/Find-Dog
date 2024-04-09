package com.dbteam.dtopackage;

public class DogBoardDTO {
    private int dogBoardNum;
    private String dogBoardName;
    private String dogBoardTxt;
    private int dogNum;
    private int regionNum;
    private int managerNum;

    public DogBoardDTO() {
    }

    public DogBoardDTO(int dogBoardNum, String dogBoardName, String dogBoardTxt, int dogNum, int regionNum, int managerNum) {
        this.dogBoardNum = dogBoardNum;
        this.dogBoardName = dogBoardName;
        this.dogBoardTxt = dogBoardTxt;
        this.dogNum = dogNum;
        this.regionNum = regionNum;
        this.managerNum = managerNum;
    }

    public int getDogBoardNum() {
        return dogBoardNum;
    }

    public void setDogBoardNum(int dogBoardNum) {
        this.dogBoardNum = dogBoardNum;
    }

    public String getDogBoardName() {
        return dogBoardName;
    }

    public void setDogBoardName(String dogBoardName) {
        this.dogBoardName = dogBoardName;
    }

    public String getDogBoardTxt() {
        return dogBoardTxt;
    }

    public void setDogBoardTxt(String dogBoardTxt) {
        this.dogBoardTxt = dogBoardTxt;
    }

    public int getDogNum() {
        return dogNum;
    }

    public void setDogNum(int dogNum) {
        this.dogNum = dogNum;
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
        return "DogBoardDTO{" +
                "dogBoardNum=" + dogBoardNum +
                ", dogBoardName='" + dogBoardName + '\'' +
                ", dogBoardTxt='" + dogBoardTxt + '\'' +
                ", dogNum=" + dogNum +
                ", regionNum=" + regionNum +
                ", managerNum=" + managerNum +
                '}';
    }
}
