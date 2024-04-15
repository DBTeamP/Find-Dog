package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.List;

public interface AdoptionMapper {

    //추가
    int insertAdoption(AdoptionDTO adoption);

    //삭제
    int deleteAdoption(int adoptionNum);

    //전체 조회
    List<AdoptionDTO> selectAllMenu();

    //검색
    // List<AdoptionDTO> selectAdoptionByName(String adoptionName);

    List<AdoptionDTO> searchAdoptionByName(String adoptionName);
}

