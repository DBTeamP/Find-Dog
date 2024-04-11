package com.dbteam.xml;

public class PrintResult {


    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode){
            case "insert" : successMessage = "신규 봉사 회원이 등록 완료되었습니다 .";break;
            case  "delete" : successMessage ="회원 삭제를 완료했습니다 ."; break;
        }
        System.out.println(successMessage);

    }
}
