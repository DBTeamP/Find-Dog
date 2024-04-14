package com.dbteam.application;

import com.dbteam.common.dtopackage.FindDogDTO;
import com.dbteam.xml.dog.FindDogMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.dbteam.common.Template.getSqlSession;

public class FindDogService {

    private FindDogMapper findDogMapper;

    public List<FindDogDTO> selectAllDog() {
        try (SqlSession sqlSession = getSqlSession()) {
            findDogMapper = sqlSession.getMapper(FindDogMapper.class);
            return findDogMapper.selectAllDog();
        }
    }

    public FindDogDTO selectDogByName(String dogName) {
        try (SqlSession sqlSession = getSqlSession()) {
            findDogMapper = sqlSession.getMapper(FindDogMapper.class);
            return findDogMapper.selectDogByName(dogName);
        }
    }
    public boolean registerDog(FindDogDTO dog) {
        try (SqlSession sqlSession = getSqlSession()) {
            findDogMapper = sqlSession.getMapper(FindDogMapper.class);
            int result = findDogMapper.insertDog(dog); // 여기서 수정
            if (result > 0) {
                sqlSession.commit();
                return true;
            } else {
                sqlSession.rollback();
                return false;
            }
        }
    }

}
