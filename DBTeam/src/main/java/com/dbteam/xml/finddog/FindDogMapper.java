package com.dbteam.xml.finddog;

import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.List;

public interface FindDogMapper {
    List<FindDogDTO> selectAllDog();
    int insertDog(FindDogDTO fdog);

    List<FindDogDTO> selectDogByName(String findName);


}
