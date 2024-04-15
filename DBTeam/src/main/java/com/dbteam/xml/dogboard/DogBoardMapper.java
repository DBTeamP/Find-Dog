package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DogBoardMapper {

    /* 조회 */
    List<DogBoardDTO> selectAllDogBoard();

    /* 추가 */
    int insertDogBoard(DogBoardDTO dogboard);

    /* 수정 */

    /* 삭제 */
    int deleteDogBoard(@Param("dogBoardNum")int dogBoardNum, @Param("userNum")int userNum);

    /* 검색 */
//    List<DogBoardDTO> searchDogBoardName(SearchDogBoardName searchDogBoardName);
    List<DogBoardDTO> searchDogBoardByName(String dogBoardName);


}
