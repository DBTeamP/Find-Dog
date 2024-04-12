
package com.dbteam.common.dtopackage;

public class RegionDTO {
    private int regionNum;
    private String regionName;

    public RegionDTO() {
    }

    public RegionDTO(int regionNum, String regionName) {
        this.regionNum = regionNum;
        this.regionName = regionName;
    }

    public int getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(int regionNum) {
        this.regionNum = regionNum;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "RegionDTO{" +
                "regionNum=" + regionNum +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}
