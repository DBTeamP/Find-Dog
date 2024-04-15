package com.dbteam.common.dtopackage;

//userRegionNum 삭제
public class VolPDTO {
    private int userNum;
    private int volNum;

    public VolPDTO() {
    }

    public VolPDTO(int userNum, int volNum) {
        this.userNum = userNum;
        this.volNum = volNum;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public int getVolNum() {
        return volNum;
    }

    public void setVolNum(int volNum) {
        this.volNum = volNum;
    }

    @Override
    public String toString() {
        return "VolPDTO{" +
                "userNum=" + userNum +
                ", volNum=" + volNum +
                '}';
    }
}

