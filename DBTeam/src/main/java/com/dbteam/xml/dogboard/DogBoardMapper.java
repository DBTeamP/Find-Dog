package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;

public interface DogBoardMapper {

    /* 조회 */

    /* 추가 */
    int insertDogBoard(DogBoardDTO dogboard);

    /* 수정 */

    /* 삭제 */
    int deleteDogBoard(int dogBoardNum);

}
