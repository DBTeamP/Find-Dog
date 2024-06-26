package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlSession;
import static com.dbteam.common.Template.getSqlSession;

public class AdoptionService {

    /*
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
*/
    private AdoptionMapper adoptionMapper;

    //추가
    public boolean registAdoption(AdoptionDTO adoption) {
        SqlSession sqlSession = getSqlSession();

        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
        int result = adoptionMapper.insertAdoption(adoption);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;


    }

    //삭제
    public boolean deleteAdoption(int adoptionNum) {
        SqlSession sqlSession = getSqlSession();

        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
        int result = adoptionMapper.deleteAdoption(adoptionNum);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    //조회
    public List<AdoptionDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
        List<AdoptionDTO> adoptionList = adoptionMapper.selectAllMenu();

        sqlSession.close();

        return adoptionList;
    }

    // 검색
//    public void searchAdoptionName(SearchAdoptionName searchAdoptionName) {
//        SqlSession sqlSession = getSqlession();
//        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
//
//        List<AdoptionDTO> adoptionNameList = adoptionMapper.searchAdoptionName(searchAdoptionName);
//
//        sqlSession.close();
//
//        if (adoptionNameList != null && adoptionNameList.size() > 0) {
//            for (AdoptionDTO adoption : adoptionNameList) {
//                System.out.println(adoption);
//            }
//        } else {
//            System.out.println("검색 결과가 존재하지 않습니다.");
//        }

    public List<AdoptionDTO> searchAdoptionByName(String adoptionName) {
        SqlSession sqlSession = getSqlSession();

        try {
            adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
            return adoptionMapper.searchAdoptionByName(adoptionName);
        } finally {
            sqlSession.close();
    }


    }


    }



