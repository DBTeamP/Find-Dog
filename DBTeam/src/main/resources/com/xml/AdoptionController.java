package com.xml;

import com.dbteam.common.dtopackage.AdoptionDTO;

import java.util.Map;

public class AdoptionController {

    private static PrintResult printResult;

    public static void registAdoption(Map<String, String> parameter) {

        String adoptionName = parameter.get("adoptionName");
        String adoptionTxt = parameter.get("adoptionTxt");
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int regionNum = Integer.parseInt(parameter.get("regionNum"));

        AdoptionDTO adoption = new AdoptionDTO();
        adoption.setAdoptionName(adoptionName);
        adoption.setAdoptionTxt(adoptionTxt);
        adoption.setUserNum(userNum);
        adoption.setRegionNum(regionNum);

        if (AdoptionService.registAdoption(adoption)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");

        }
    }
}