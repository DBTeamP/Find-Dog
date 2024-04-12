package com.dbteam.xml.login;

import com.dbteam.common.dtopackage.UsersDTO;

public interface LoginMapper {
    int insertUser(UsersDTO user);


    UsersDTO logIn(String userId);
}
