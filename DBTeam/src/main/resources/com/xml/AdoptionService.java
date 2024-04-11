package com.xml;

import com.dbteam.common.dtopackage.AdoptionDTO;
import org.apache.ibatis.session.SqlSession;


public class AdoptionService {

    private static AdoptionMapper adoptionMapper;

    public static boolean registAdoption(AdoptionDTO adoption) {

        SqlSession sqlSession = getSqlession();

        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
        int result = adoptionMapper.insertAdoption(adoption);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    private static SqlSession getSqlession() {
        SqlSession sqlSession = null;
        return sqlSession;
    }

}


