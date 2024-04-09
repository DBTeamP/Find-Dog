package com.dbteam.setting.dtopackage;

public class RegionDTO {
    private int regionNum;
    private String region_name;

    public RegionDTO() {
    }

    public RegionDTO(int regionNum, String region_name) {
        this.regionNum = regionNum;
        this.region_name = region_name;
    }

    public int getRegionNum() {
        return regionNum;
    }

    public void setRegionNum(int regionNum) {
        this.regionNum = regionNum;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    @Override
    public String toString() {
        return "RegionDTO{" +
                "regionNum=" + regionNum +
                ", region_name='" + region_name + '\'' +
                '}';
    }
}
