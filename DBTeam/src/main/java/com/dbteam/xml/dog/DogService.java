package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlession;


public class DogService {

    private DogMapper dogMapper;

    /* 조회 */
    public List<DogDTO> selectAllProfile() {
        SqlSession sqlSession = getSqlession();

        dogMapper = sqlSession.getMapper(DogMapper.class);
        List<DogDTO> dogList = dogMapper.selectAllProfile();

        sqlSession.close();

        return dogList;

    }

    /* 추가 */     /*강아지 프로필 추가할 수 있는 메소드*/
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

    /* 수정 */

    /* 삭제 */
    public boolean deleteDogProfile(int dogNum) {
        SqlSession sqlSession = getSqlession();

        dogMapper = sqlSession.getMapper(DogMapper.class);
        int result = dogMapper.deleteDogProfile(dogNum);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }

    /* 검색 */
    public void searchDogKind(SearchDogKind searchDogKind) {
        SqlSession sqlSession = getSqlession();
        dogMapper = sqlSession.getMapper(DogMapper.class);

        List<DogDTO> dogkindList = dogMapper.searchDogKind(searchDogKind);

        sqlSession.close();

        if (dogkindList != null && dogkindList.size() > 0){
            for (DogDTO dog : dogkindList){
                System.out.println(dog);
            }
        }else {
            System.out.println("검색결과가 존재하지 않습니다.");
        }

    }


}
