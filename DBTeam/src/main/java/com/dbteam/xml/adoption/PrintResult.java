package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.List;

public class PrintResult {
    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "입양일지 등록을 성공하였습니다."; break;
            case "delete" : successMessage = "입양일지 삭제를 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "insert" : errorMessage = "입양일지 등록에 실패하였습니다."; break;
            case "delete" : errorMessage = "입양일지 삭제에 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }


    public void printAdoptionList(List<AdoptionDTO> adoptionList) {
        System.out.println("============ 전체 입양일지 리스트 ==============");

        for (AdoptionDTO adoption : adoptionList) {
            System.out.println(adoption);
        }

    }
}

