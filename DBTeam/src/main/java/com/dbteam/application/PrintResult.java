package com.dbteam.application;

import com.dbteam.common.dtopackage.VolDTO;

import java.util.List;

public class PrintResult {
    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
            case "insert" : successMessage = "봉사활동 추가에 성공했습니다.";
                System.out.println(successMessage);
                break;
            case "delete" : successMessage = "봉사활동 삭제를 성공하셨습니다.";
                System.out.println(successMessage);
                break;
            case "select" : successMessage = "봉사활동 검색에 성공하셨습니다.";
                System.out.println(successMessage);
                break;
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

    public void printVol(List<VolDTO> selectVolList) {
        System.out.println("========== 봉사 검색 결과 ===========");
        if(selectVolList != null){
        for(VolDTO selectVol : selectVolList) {
            System.out.println(selectVol);
            }
        }
    }

    public void printVolList(List<VolDTO> volList) {
        System.out.println("======== 봉사 리스트 =========");
        for(VolDTO vol : volList){
            System.out.println(vol);
        }
    }
}
