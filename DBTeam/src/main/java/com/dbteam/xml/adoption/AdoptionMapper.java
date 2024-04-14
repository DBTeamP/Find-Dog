package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.List;

public interface AdoptionMapper {
    
    //추가
    int insertAdoption(AdoptionDTO adoption);

    //삭제
    int deleteAdoption(int adoptionNum);

    List<AdoptionDTO> selectAllMenu();

    List<AdoptionDTO> searchAdoptionName(SearchAdoptionName searchAdoptionName);
}
