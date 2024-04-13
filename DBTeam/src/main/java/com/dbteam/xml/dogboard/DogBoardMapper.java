package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;

import java.util.List;

public interface DogBoardMapper {

    /* 조회 */
    List<DogBoardDTO> selectAllDogBoard();

    /* 추가 */
    int insertDogBoard(DogBoardDTO dogboard);

    /* 수정 */

    /* 삭제 */
    int deleteDogBoard(int dogBoardNum);

    /* 검색 */
    List<DogBoardDTO> searchDogBoardName(SearchDogBoardName searchDogBoardName);

}
