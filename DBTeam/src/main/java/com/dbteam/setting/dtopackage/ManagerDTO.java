package com.dbteam.setting.dtopackage;

public class ManagerDTO {
    private int managerNum;
    private String managerId;
    private String managerName;
    private String managerPhone;
    private int regionNum; // 외래키

    public ManagerDTO() {
    }

    public ManagerDTO(int managerNum, String managerId, String managerName, String managerPhone, int regionNum) {
        this.managerNum = managerNum;
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerPhone = managerPhone;
        this.regionNum = regionNum;
    }

    public int getManagerNum() {
        return managerNum;
    }

    public void setManagerNum(int managerNum) {
        this.managerNum = managerNum;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public int getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(int regionNum) {
        this.regionNum = regionNum;
    }

    @Override
    public String toString() {
        return "ManagerDTO{" +
                "managerNum=" + managerNum +
                ", managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", managerPhone='" + managerPhone + '\'' +
                ", regionNum=" + regionNum +
                '}';
    }
}
