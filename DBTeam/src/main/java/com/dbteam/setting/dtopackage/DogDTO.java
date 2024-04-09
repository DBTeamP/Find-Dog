package com.dbteam.setting.dtopackage;

public class DogDTO {
    private int dogNum;
    private String dogName;
    private String dogKind;
    private int dogAge;
    private int regionNum;
    private int managerNum;

    public DogDTO() {
    }

    public DogDTO(int dogNum, String dogName, String dogKind, int dogAge, int regionNum, int managerNum) {
        this.dogNum = dogNum;
        this.dogName = dogName;
        this.dogKind = dogKind;
        this.dogAge = dogAge;
        this.regionNum = regionNum;
        this.managerNum = managerNum;
    }

    public int getDogNum() {
        return dogNum;
    }

    public void setDogNum(int dogNum) {
        this.dogNum = dogNum;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogKind() {
        return dogKind;
    }

    public void setDogKind(String dogKind) {
        this.dogKind = dogKind;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
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
        return "DogDTO{" +
                "dogNum=" + dogNum +
                ", dogName='" + dogName + '\'' +
                ", dogKind='" + dogKind + '\'' +
                ", dogAge=" + dogAge +
                ", regionNum=" + regionNum +
                ", managerNum=" + managerNum +
                '}';
    }
}
