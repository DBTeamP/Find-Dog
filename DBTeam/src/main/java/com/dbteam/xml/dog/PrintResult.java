package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;

import java.util.List;

public class PrintResult {

//    public void printDogProfileList(List<DogDTO> menuList) {
//
//    }

    /* 성공 시 출력 메세지 */
    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "신규 프로필 등록을 성공하였습니다."; break;
            case "update" : successMessage = "프로필 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "프로필 삭제를 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }

    /* 실패 시 출력 메세지 */
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "전체 프로필 목록 조회에 실패하였습니다."; break;
            case "selectOne" : errorMessage = "선택한 프로필 조회에 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 프로필 등록에 실패하였습니다."; break;
            case "update" : errorMessage = "프로필 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "프로필 삭제에 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    /* 조회 */
    public void printDogList(List<DogDTO> dogList) {
        System.out.println("========== 조회한 메뉴 리스트 ==========");

        for (DogDTO dog : dogList){
            System.out.println(dog);
        }
        /*
            for(int i = 0; i < dogList.size(); i++) {
                System.out.println(dogList.get(i));
            }
        */
    }

}
