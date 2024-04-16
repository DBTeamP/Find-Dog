package com.dbteam.xml.login;

import com.dbteam.common.dtopackage.UsersDTO;

import java.util.List;

public interface LoginMapper {
    int insertUser(UsersDTO user);
    UsersDTO logIn(String userId);
    UsersDTO logInAdmin(String userId);
    UsersDTO logInUser(String userId);

}
