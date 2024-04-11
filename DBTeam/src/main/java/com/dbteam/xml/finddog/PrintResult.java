package com.dbteam.xml.finddog;

public class PrintResult {

    /* 성공 시 출력 메세지 */
    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "신규 게시글 등록을 성공하였습니다."; break;
            case "update" : successMessage = "게시글 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "게시글 삭제를 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }

    /* 실패 시 출력 메세지 */
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "전체 게시글 목록 조회에 실패하였습니다."; break;
            case "selectOne" : errorMessage = "선택한 게시글 조회에 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 게시글 등록에 실패하였습니다."; break;
            case "update" : errorMessage = "게시글 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "게시글 삭제에 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

}
