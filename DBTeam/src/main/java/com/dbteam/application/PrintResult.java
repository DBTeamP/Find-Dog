package com.dbteam.application;

public class PrintResult {
    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
            case "insert" : successMessage = "봉사활동 추가에 성공했습니다.";
                System.out.println(successMessage);
                ;break;
            case "delete" : successMessage = "봉사활동 삭제를 성공하셨습니다.";
                System.out.println(successMessage);
                break;
        }
    }
}
