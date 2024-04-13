package com.dbteam.common.dtopackage;

// regionNum & managerNum 삭제
public class DogBoardDTO {
    private int dogBoardNum;
    private String dogBoardName;
    private String dogBoardTxt;
    private int dogNum;

    public DogBoardDTO() {
    }

    public DogBoardDTO(int dogBoardNum, String dogBoardName, String dogBoardTxt, int dogNum) {
        this.dogBoardNum = dogBoardNum;
        this.dogBoardName = dogBoardName;
        this.dogBoardTxt = dogBoardTxt;
        this.dogNum = dogNum;
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

    @Override
    public String toString() {
        return "DogBoardDTO{" +
                "dogBoardNum=" + dogBoardNum +
                ", dogBoardName='" + dogBoardName + '\'' +
                ", dogBoardTxt='" + dogBoardTxt + '\'' +
                ", dogNum=" + dogNum +
                '}';
    }
}