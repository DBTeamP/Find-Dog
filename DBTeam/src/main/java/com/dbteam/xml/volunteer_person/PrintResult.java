package com.dbteam.xml.volunteer_person;

public class PrintResult {


    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert":
                successMessage = "봉사 일정 등록 완료되었습니다 .";
                break;
            case "delete":
                successMessage = "봉사 일정 삭제를 완료했습니다 .";
                break;
        }
        System.out.println(successMessage);

    }

    public void printSuccesscount(String successCode,com.dbteam.common.dtopackage.CountDTO result) {
        String successMessage = "";

        switch (successCode) {
            case "select":
                successMessage = "조회가 완료되었습니다.";
                break;
        }
        if (result != null) {
            String Message = String.format("%s 봉사 게시판 인원 수: %d명", result.getVolName(), result.getVolCount());
            System.out.println(successMessage + "   " + Message);
        }

    }

}


