package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;

public interface DogMapper {

    /* 조회 */

    /* 추가 */
    int insertDogProfile(DogDTO dog);

    /* 수정 */

    /* 삭제 */
    int deleteDogProfile(int dogNum);

}
