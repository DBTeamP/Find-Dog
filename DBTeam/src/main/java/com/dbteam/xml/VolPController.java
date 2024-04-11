package com.dbteam.xml;

import com.dbteam.common.dtopackage.VolPDTO;

import java.util.Map;

public class VolPController {

    private final VolPService volPService;
    private final PrintResult printResult;

    public VolPController() {
        volPService = new VolPService();
        printResult = new PrintResult();
    }



    public void insertVolP(Map<String,String> parameter){
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int volNum = Integer.parseInt(parameter.get("volNum"));
        int userRegionNum =Integer.parseInt( parameter.get("userRegionNum"));

        VolPDTO list = new VolPDTO();
        list.setUserNum(userNum);
        list.setVolNum(volNum);
        list.setUserRegionNum(userRegionNum);

        if(volPService.insertVolP(list)) {
            printResult.printSuccessMessage("insert");
        }

    }


    public void deleteVolP(Map<String, String> parameter) {
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int volNum = Integer.parseInt(parameter.get("volNum"));

        VolPDTO num = new VolPDTO();
        num.setUserNum(userNum);
        num.setVolNum(volNum);

        if(volPService.deleteVolP(num)){
            printResult.printSuccessMessage("delete");
        }
    }
}
