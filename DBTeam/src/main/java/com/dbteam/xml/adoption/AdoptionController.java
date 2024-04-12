package com.dbteam.xml.adoption;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.List;
import java.util.Map;

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
}