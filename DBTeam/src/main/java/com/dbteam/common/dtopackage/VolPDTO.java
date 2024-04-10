package com.dbteam.common.dtopackage;

public class VolPDTO {
    private int userNum;
    private int volNum;
    private int UserRegionNum;

    public VolPDTO() {
    }

    public VolPDTO(int userNum, int volNum, int userRegionNum) {
        this.userNum = userNum;
        this.volNum = volNum;
        UserRegionNum = userRegionNum;
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

    public int getUserRegionNum() {
        return UserRegionNum;
    }

    public void setUserRegionNum(int userRegionNum) {
        UserRegionNum = userRegionNum;
    }

    @Override
    public String toString() {
        return "VolPDTO{" +
                "userNum=" + userNum +
                ", volNum=" + volNum +
                ", UserRegionNum=" + UserRegionNum +
                '}';
    }
}
