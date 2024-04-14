package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.List;

public interface FindDogMapper {
    List<FindDogDTO> selectAllDog();
    int insertDog(FindDogDTO dog);
    FindDogDTO selectDogByName(String name);

}
