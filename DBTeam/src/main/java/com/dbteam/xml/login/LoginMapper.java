package com.dbteam.xml.login;

import com.dbteam.common.dtopackage.UsersDTO;

import java.util.List;

public interface LoginMapper {
    int insertUser(UsersDTO user);


    UsersDTO logIn(String userId);

    List<UsersDTO> logInAdmin(String userId);

    List<UsersDTO> logInUser(String userId);

}
