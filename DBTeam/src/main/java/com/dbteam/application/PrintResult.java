package com.dbteam.application;

import com.dbteam.common.dtopackage.UsersDTO;

import java.util.List;

public class PrintResult {
    public void printSuccessMessage(String successCode){
        String successMessage = "";
        switch(successCode){
            case "insert": successMessage = "로그 유저 등록에 성공했어요"; break;
        }
        System.out.println(successMessage);
    }
}
