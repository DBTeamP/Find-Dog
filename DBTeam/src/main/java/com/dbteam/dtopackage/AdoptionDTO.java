package com.dbteam.dtopackage;

public class AdoptionDTO {
    private int adoptionNum;
    private String adoptionName;
    private String adoptionTxt;
    private int userNum;
    private int regionNum;

    public AdoptionDTO() {
    }

    public AdoptionDTO(int adoptionNum, String adoptionName, String adoptionTxt, int userNum, int regionNum) {
        this.adoptionNum = adoptionNum;
        this.adoptionName = adoptionName;
        this.adoptionTxt = adoptionTxt;
        this.userNum = userNum;
        this.regionNum = regionNum;
    }

    public int getAdoptionNum() {
        return adoptionNum;
    }

    public void setAdoptionNum(int adoptionNum) {
        this.adoptionNum = adoptionNum;
    }

    public String getAdoptionName() {
        return adoptionName;
    }

    public void setAdoptionName(String adoptionName) {
        this.adoptionName = adoptionName;
    }

    public String getAdoptionTxt() {
        return adoptionTxt;
    }

    public void setAdoptionTxt(String adoptionTxt) {
        this.adoptionTxt = adoptionTxt;
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
        return "AdoptionDTO{" +
                "adoptionNum=" + adoptionNum +
                ", adoptionName='" + adoptionName + '\'' +
                ", adoptionTxt='" + adoptionTxt + '\'' +
                ", userNum=" + userNum +
                ", regionNum=" + regionNum +
                '}';
    }
}
