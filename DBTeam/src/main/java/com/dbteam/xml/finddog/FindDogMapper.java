package com.dbteam.xml.finddog;

import com.dbteam.common.dtopackage.FindDogDTO;

public interface FindDogMapper {

    /* 조회 */

    /* 추가 */
    int insertFindDogBoard(FindDogDTO finddog);

    /* 수정 */

    /* 삭제 */
    int deleteFindDogBoard(int findNum);


}
