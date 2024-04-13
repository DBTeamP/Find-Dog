package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;

import java.util.List;

public interface DogMapper {

    /* 조회 */
    List<DogDTO> selectAllProfile();

    /* 추가 */
    int insertDogProfile(DogDTO dog);

    /* 수정 */

    /* 삭제 */
    int deleteDogProfile(int dogNum);

    /* 검색*/
    List<DogDTO> searchDogKind(SearchDogKind searchDogKind);

}
