package com.dbteam.xml.finddog;

import com.dbteam.common.dtopackage.FindDogDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlSession;

public class FindDogService {

    private static FindDogMapper findDogMapper;

    public List<FindDogDTO> selectAllDog() {
        SqlSession sqlSession = getSqlSession();

        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
        List<FindDogDTO> fdogList = findDogMapper.selectAllDog();

        sqlSession.close();

        return fdogList;

    }


    public boolean registerDog(FindDogDTO fdog){

        SqlSession sqlSession = getSqlSession();

        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
        int result = findDogMapper.insertDog(fdog);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }

    public List<FindDogDTO> selectDogByName(String findName) {
        SqlSession sqlSession = getSqlSession();

        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
        List<FindDogDTO> dogList = findDogMapper.selectDogByName(findName);

        sqlSession.close();

        return dogList;
    }
}
