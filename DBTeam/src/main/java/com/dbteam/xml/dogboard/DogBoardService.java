package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;
import com.dbteam.xml.dog.DogController;
import com.dbteam.xml.dog.DogService;
import com.dbteam.xml.login.LoginView;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.dbteam.common.Template.getSqlSession;

public class DogBoardService {

    private DogBoardMapper dogBoardMapper;

    /* 조회 */
    public List<DogBoardDTO> selectAllDogBoard() {
        SqlSession sqlSession = getSqlSession();

        dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
        List<DogBoardDTO> dogBoardList = dogBoardMapper.selectAllDogBoard();

        sqlSession.close();

        return dogBoardList;
    }

    /* 추가 */
    public boolean registDogBoard(DogBoardDTO dogboard) {
        SqlSession sqlSession = getSqlSession();

        dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
        DogService dogService = new DogService();
        int result = 0;

        if(dogService.isDogExist(dogboard.getDogNum())){
             result = dogBoardMapper.insertDogBoard(dogboard);
        }

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    /* 수정 */

    /* 삭제 */
    public boolean deleteDogBoard(int dogBoardNum) {
        SqlSession sqlSession = getSqlSession();

        int userNum = LoginView.getUserNum();
        
        dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
        int result = dogBoardMapper.deleteDogBoard(dogBoardNum, userNum);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }

    /* 검색 */
//    public void searchDogBoardName(SearchDogBoardName searchDogBoardName) {
//        SqlSession sqlSession = getSqlSession();
//        dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
//
//        List<DogBoardDTO> dogBoardList = dogBoardMapper.searchDogBoardName(searchDogBoardName);
//
//        sqlSession.close();
//
//        if (dogBoardList != null && dogBoardList.size() > 0){
//            for (DogBoardDTO dogBoard : dogBoardList){
//                System.out.println(dogBoard);
//            }
//        } else {
//            System.out.println("검색결과가 존재하지 않습니다.");
//        }
//
//    }
    /* 검색 */
    public List<DogBoardDTO> searchDogBoardByName(String dogBoardName){
        SqlSession sqlSession = getSqlSession();

        try {
            dogBoardMapper = sqlSession.getMapper(DogBoardMapper.class);
            return dogBoardMapper.searchDogBoardByName(dogBoardName);
        } finally {
            sqlSession.close();
        }

    }

}
