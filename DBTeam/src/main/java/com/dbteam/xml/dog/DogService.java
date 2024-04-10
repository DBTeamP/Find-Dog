package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;
import org.apache.ibatis.session.SqlSession;

import static com.dbteam.common.Template.getSqlession;


public class DogService {

    private DogMapper dogMapper;

    //추가
            //강아지 프로필 추가할 수 있는 메소드
    public boolean registDogProfile(DogDTO dog){

        SqlSession sqlSession = getSqlession();

        dogMapper = sqlSession.getMapper(DogMapper.class);
        int result = dogMapper.insertDogProfile(dog);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;



    }


}
