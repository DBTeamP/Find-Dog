package com.dbteam.xml;

import com.dbteam.common.dtopackage.CountDTO;
import com.dbteam.common.dtopackage.VolPDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlession;

public class VolPService {

    private VolPMapper volpmapper;

    public boolean insertVolP(VolPDTO list) {

        SqlSession sqlSession = getSqlession();

        volpmapper = sqlSession.getMapper(com.dbteam.xml.VolPMapper.class);
        int result = volpmapper.insertVolP(list);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteVolP(VolPDTO num) {
        SqlSession sqlSession = getSqlession();

        volpmapper = sqlSession.getMapper(com.dbteam.xml.VolPMapper.class);
        int result = volpmapper.deleteVolP(num);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }


    public List<CountDTO> selectVolP(int userNum, int volNum) {
        try (SqlSession sqlSession = getSqlession()) {
            VolPMapper volPMapper = sqlSession.getMapper(VolPMapper.class);
            return volPMapper.selectVolP(userNum, volNum);
        }

    }
}