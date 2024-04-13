package com.dbteam.xml;

import com.dbteam.common.dtopackage.CountDTO;
import com.dbteam.common.dtopackage.VolPDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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


    public List<CountDTO> selectVolP(List<String> volNameList) {
        SqlSession sqlSession = getSqlession();
        try {
            VolPMapper volPMapper = sqlSession.getMapper(VolPMapper.class);
            Map<String, Object>params = new HashMap<>();
            params.put("volNameList", volNameList);
            List<CountDTO> results = volPMapper.selectVolP(volNameList);
            return results;
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}