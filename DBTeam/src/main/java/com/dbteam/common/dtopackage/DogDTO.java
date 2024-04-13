package com.dbteam.common.dtopackage;

// regionNum & managerNum 삭제
// adminNum(userNum의 외래키) 추가
public class DogDTO {
    private int dogNum;
    private String dogName;
    private String dogKind;
    private int dogAge;
    private int adminNum;

    public DogDTO() {
    }

    public DogDTO(int dogNum, String dogName, String dogKind, int dogAge, int adminNum) {
        this.dogNum = dogNum;
        this.dogName = dogName;
        this.dogKind = dogKind;
        this.dogAge = dogAge;
        this.adminNum = adminNum;
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

    public int getAdminNum() {
        return adminNum;
    }

    public void setAdminNum(int adminNum) {
        this.adminNum = adminNum;
    }

    @Override
    public String toString() {
        return "DogDTO{" +
                "dogNum=" + dogNum +
                ", dogName='" + dogName + '\'' +
                ", dogKind='" + dogKind + '\'' +
                ", dogAge=" + dogAge +
                ", adminNum=" + adminNum +
                '}';
    }
}
