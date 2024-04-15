
package com.dbteam.xml.login;

import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.List;

public class PrintResult {
    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
            case "insert" : successMessage = "회원가입에 성공했습니다.";
                System.out.println(successMessage);
                break;
            case "delete" : successMessage = "회원 삭제를 성공하셨습니다.";
                System.out.println(successMessage);
                break;
            case "select" : successMessage = "회원 검색에 성공하셨습니다.";
                System.out.println(successMessage);
                break;
        }
    }
    public void printDogList(List<FindDogDTO> findDogDTOList) {
        System.out.println("========== 조회한 리스트 ==========");

        for (FindDogDTO findDogDTO : findDogDTOList) {
            System.out.println(findDogDTO);
        }
    }
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "search" : errorMessage = "검색에 실패했습니다.";
                System.out.println(errorMessage);
                break;
            case "searchByUserId" : errorMessage = "존재하지 않은 id 입니다.";
                System.out.println(errorMessage);
                break;
        }

    }
//
//    public void printVol(List<VolDTO> selectVolList) {
//        System.out.println("========== 봉사 검색 결과 ===========");
//        if(selectVolList != null){
//        for(VolDTO selectVol : selectVolList) {
//            System.out.println(selectVol);
//            }
//        }
//    }
//
//    public void printVolList(List<VolDTO> volList) {
//        System.out.println("======== 봉사 리스트 =========");
//        for(VolDTO vol : volList){
//            System.out.println(vol);
//        }
//    }
}
