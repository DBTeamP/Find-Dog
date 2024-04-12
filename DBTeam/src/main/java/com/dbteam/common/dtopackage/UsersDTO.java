
package com.dbteam.common.dtopackage;

// adminRights 변수 추가(String형)
public class UsersDTO {
    private int userNum;
    private String userName;
    private String userId;
    private String userPhone;
    private int regionNum;
    private String adminRights;

    public UsersDTO() {
    }

    public UsersDTO(int userNum, String userName, String userId, String userPhone, int regionNum, String adminRights) {
        this.userNum = userNum;
        this.userName = userName;
        this.userId = userId;
        this.userPhone = userPhone;
        this.regionNum = regionNum;
        this.adminRights = adminRights;
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

    public String getAdminRights() {
        return adminRights;
    }

    public void setAdminRights(String adminRights) {
        this.adminRights = adminRights;
    }

    @Override
    public String toString() {
        return "UsersDTO{" +
                "userNum=" + userNum +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", regionNum=" + regionNum +
                ", adminRights='" + adminRights + '\'' +
                '}';
    }
}
