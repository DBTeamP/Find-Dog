package com.dbteam.xml.finddog;

import com.dbteam.common.dtopackage.FindDogDTO;
import org.apache.ibatis.session.SqlSession;

import static com.dbteam.common.Template.getSqlession;

public class FindDogService {

    private FindDogMapper findDogMapper;

    /* 조회 */

    /* 추가 */
    public boolean registFindDogBoard(FindDogDTO finddog) {
        SqlSession sqlSession = getSqlession();

        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
        int result = findDogMapper.insertFindDogBoard(finddog);

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
    public boolean deleteFindDogBoard(int findNum) {
        SqlSession sqlSession = getSqlession();

        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
        int result = findDogMapper.deleteFindDogBoard(findNum);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }


}
