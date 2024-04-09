package com.dbteam.dtopackage;

public class UsersDTO {
    private int userNum;
    private String userName;
    private String userId;
    private String userPhone;
    private int regionNum;

    public UsersDTO() {
    }

    public UsersDTO(int userNum, String userId, String userName, String userPhone, int regionNum) {
        this.userNum = userNum;
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.regionNum = regionNum;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(int regionNum) {
        this.regionNum = regionNum;
    }

    @Override
    public String toString() {
        return "UsersDTO{" +
                "userNum=" + userNum +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", regionNum=" + regionNum +
                '}';
    }
}
