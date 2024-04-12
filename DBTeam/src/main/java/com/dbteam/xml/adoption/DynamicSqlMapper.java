package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.List;

public interface DynamicSqlMapper {
    List<AdoptionDTO> searchAdoption(SearchCriteria searchCriteria);
}
