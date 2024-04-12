package com.dbteam.application;

import com.dbteam.common.dtopackage.UsersDTO;
import com.dbteam.xml.login.LoginMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

import static com.dbteam.common.Template.getSqlSession;

public class LogInService {
    private LoginMapper loginMapper;

    public boolean insertUser(UsersDTO user) {
        SqlSession sqlSession = getSqlSession();
        loginMapper = sqlSession.getMapper(LoginMapper.class);
        int result = loginMapper.insertUser(user);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return result > 0;
    }

    // 아이디가 이미 존재하는지 확인하는 메서드 추가
    public boolean isUserIdExists(String userId) {
        SqlSession sqlSession = getSqlSession();
        loginMapper = sqlSession.getMapper(LoginMapper.class);
        UsersDTO user = loginMapper.logIn(userId);
        sqlSession.close();

        return user != null;
    }

    // 사용자의 아이디를 확인하는 메서드 추가 (비밀번호 미사용)
    public boolean checkCredentials(String userId) {
        SqlSession sqlSession = getSqlSession();
        loginMapper = sqlSession.getMapper(LoginMapper.class);
        UsersDTO user = loginMapper.logIn(userId);

        // 사용자가 존재하는지 확인
        boolean isAuthenticated = user != null;

        sqlSession.close();
        return isAuthenticated;
    }

    public boolean isAdminUser(String userId) {
        SqlSession sqlSession = getSqlSession();
        loginMapper = sqlSession.getMapper(LoginMapper.class);
        UsersDTO user = loginMapper.logIn(userId);

        // 사용자가 존재하고, adminRights가 Y인지 확인
        boolean isAdmin = user != null && user.getAdminRights().equalsIgnoreCase("Y");

        sqlSession.close();
        return isAdmin;
    }

}