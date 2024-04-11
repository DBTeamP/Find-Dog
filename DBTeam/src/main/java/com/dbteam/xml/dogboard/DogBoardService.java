package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;
import org.apache.ibatis.session.SqlSession;

import static com.dbteam.common.Template.getSqlession;

public class DogBoardService {

    private DogBoardMapper dogBoardMapper;

    /* 조회 */

    /* 추가 */
    public boolean registDogBoard(DogBoardDTO dogboard) {
        SqlSession sqlSession = getSqlession();

        dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
        int result = dogBoardMapper.insertDogBoard(dogboard);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }

    /* 수정 */

    /* 삭제 */
    public boolean deleteDogBoard(int dogBoardNum) {
        SqlSession sqlSession = getSqlession();

        dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
        int result = dogBoardMapper.deleteDogBoard(dogBoardNum);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }

}
