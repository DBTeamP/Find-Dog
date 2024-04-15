package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdoptionController {
    private final AdoptionService adoptionService;
    private final PrintResult printResult;

    public AdoptionController(){
        adoptionService = new AdoptionService();
        printResult = new PrintResult();
    }

    //추가
    public void registAdoption(Map<String, String> parameter) {

        String adoptionName = parameter.get("adoptionName");
        String adoptionTxt = parameter.get("adoptionTxt");
        int userNum = Integer.parseInt(parameter.get("userNum"));

        AdoptionDTO adoption = new AdoptionDTO();
        adoption.setAdoptionName(adoptionName);
        adoption.setAdoptionTxt(adoptionTxt);
        adoption.setUserNum(userNum);

        if(adoptionService.registAdoption(adoption)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    //삭제
    public void deleteAdoption(Map<String, String> parameter) {
        int adoptionNum = Integer.parseInt(parameter.get("adoptionNum"));

        if (adoptionService.deleteAdoption(adoptionNum)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }

    // 조회
    public void selectAllMenu() {

        List<AdoptionDTO> adoptionList = adoptionService.selectAllMenu();

        if(adoptionList != null ){
            printResult.printAdoptionList(adoptionList);
        } else {
            printResult.printErrorMessage("selectList");
        }


    }
    // 검색
    public void searchAdoptionByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("검색할 제목을 입력하세요 : ");
        String adoptionName = scanner.nextLine();

        List<AdoptionDTO> adoptionList = adoptionService.searchAdoptionByName(adoptionName);

        if (adoptionList != null && !adoptionList.isEmpty()) {
            printResult.printAdoptionList(adoptionList);
        }else {
            System.out.println("검색 결과가 없습니다.");
        }

    }
}