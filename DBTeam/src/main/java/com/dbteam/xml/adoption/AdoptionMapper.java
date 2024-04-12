package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

public interface AdoptionMapper {
    
    //추가
    int insertAdoption(AdoptionDTO adoption);

    int deleteAdoption(int adoptionNum);
}
