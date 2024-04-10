package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;

public interface DogMapper {
    
    /* insert 기능*/
    int insertDogProfile(DogDTO dog);
}
