package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlession;

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
        SqlSession sqlSession = getSqlession();

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
        SqlSession sqlSession = getSqlession();

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

        SqlSession sqlSession = getSqlession();

        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
        List<AdoptionDTO> adoptionList = adoptionMapper.selectAllMenu();

        sqlSession.close();

        return adoptionList;
    }


    public void searchAdoption(SearchCriteria searchCriteria) {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlession();
            AdoptionMapper mapper = sqlSession.getMapper(AdoptionMapper.class);

            List<AdoptionDTO> adoptionList;
            adoptionList = mapper.searchAdoption(searchCriteria);

            if (adoptionList != null && !adoptionList.isEmpty()) {
                for (AdoptionDTO adoption : adoptionList) {
                    System.out.println(adoption);
                }
            } else {
                System.out.println("검색 결과가 존재하지 않습니다.");
            }
        } catch (Exception e) {
            System.err.println("검색 과정에서 오류가 발생했습니다: " + e.getMessage());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}


