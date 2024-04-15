package com.dbteam.xml.volunteer;

import com.dbteam.common.dtopackage.VolDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlession;

public class VolService {

    private VolMapper volMapper;

    public boolean deleteVol(int num){
        SqlSession sqlSession = getSqlession();


        volMapper = sqlSession.getMapper(VolMapper.class);
        int result = volMapper.deleteVol(num);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean registVol(VolDTO vol){
        SqlSession sqlSession = getSqlession();

        volMapper = sqlSession.getMapper(VolMapper.class);
        int result = volMapper.insertVol(vol);

        if(result > 0){
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }
        sqlSession.close();
        System.out.println(result);
        return result > 0 ? true : false;
    }

    public List<VolDTO> selectVolByTxt(String volTxt) {
        SqlSession sqlSession = getSqlession();

        volMapper = sqlSession.getMapper(VolMapper.class);
        List<VolDTO> selectVolList = volMapper.selectVolByTxt(volTxt);

        sqlSession.close();

        return selectVolList;
    }

    public List<VolDTO> selectAllVol() {
        SqlSession sqlSession = getSqlession();

        volMapper = sqlSession.getMapper(VolMapper.class);
        List<VolDTO> volList = volMapper.selectAllVol();

        sqlSession.close();

        return volList;
    }

    public List<VolDTO> selectVolByUserId(int num) {

        SqlSession sqlSession = getSqlession();

        volMapper = sqlSession.getMapper(VolMapper.class);
        List<VolDTO> myVolList = volMapper.selectVolByUserId(num);

        sqlSession.close();

        return myVolList;

    }
}
