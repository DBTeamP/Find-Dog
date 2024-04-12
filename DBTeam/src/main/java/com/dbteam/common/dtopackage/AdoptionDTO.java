
package com.dbteam.common.dtopackage;

// regionNum 컬럼 삭제
public class AdoptionDTO {
    private int adoptionNum;
    private String adoptionName;
    private String adoptionTxt;
    private int userNum;

    public AdoptionDTO() {
    }

    public AdoptionDTO(int adoptionNum, String adoptionName, String adoptionTxt, int userNum) {
        this.adoptionNum = adoptionNum;
        this.adoptionName = adoptionName;
        this.adoptionTxt = adoptionTxt;
        this.userNum = userNum;
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

    @Override
    public String toString() {
        return "AdoptionDTO{" +
                "adoptionNum=" + adoptionNum +
                ", adoptionName='" + adoptionName + '\'' +
                ", adoptionTxt='" + adoptionTxt + '\'' +
                ", userNum=" + userNum +
                '}';
    }
}
