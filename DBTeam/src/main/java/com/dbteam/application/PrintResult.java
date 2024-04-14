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

    public void printDog(FindDogDTO dog) {
        System.out.println("Dog Information:");
        System.out.println("Name: " + dog.getFindName());

        // 필요한 다른 정보 출력
    }
}