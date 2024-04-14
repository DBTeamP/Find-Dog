package com.dbteam.application;

import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.List;

public class PrintResult {
    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "로그 유저 등록에 성공했어요";
                break;
        }
        System.out.println(successMessage);
    }

    public void printDogList(List<FindDogDTO> findDogDTOList) {
        System.out.println("========== 조회한 리스트 ==========");

        for (FindDogDTO findDogDTO : findDogDTOList) {
            System.out.println(findDogDTO);
        }
    }

    public void printDogSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "등록에 성공했어요";
                break;
        }
        System.out.println(successMessage);
    }
    /* 실패 시 출력 메세지 */
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "insertDog" : errorMessage = "실패."; break;
            case "findDogByName" : errorMessage = "실패."; break;

        }

        System.out.println(errorMessage);
    }

}