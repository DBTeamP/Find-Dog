package com.dbteam.xml.dog;

import com.dbteam.application.FindSearchDog;
import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.List;

public interface FindDogMapper {
    List<FindDogDTO> selectAllDog();
    int insertDog(FindDogDTO fdog);

    List<FindDogDTO> selectDogByName(String findName);


    // List<FindDogDTO> findsearchDog(FindSearchDog findsearchDog);
}