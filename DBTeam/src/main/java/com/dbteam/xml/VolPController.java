package com.dbteam.xml;

import com.dbteam.common.dtopackage.CountDTO;
import com.dbteam.common.dtopackage.VolPDTO;

import java.util.List;
import java.util.Map;

public class VolPController {

    private final VolPService volPService;
    private final PrintResult printResult;

    public VolPController() {
        volPService = new VolPService();
        printResult = new PrintResult();
    }


    public void insertVolP(Map<String, String> parameter) {
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int volNum = Integer.parseInt(parameter.get("volNum"));


        VolPDTO list = new VolPDTO();
        list.setUserNum(userNum);
        list.setVolNum(volNum);


        if (volPService.insertVolP(list)) {
            printResult.printSuccessMessage("insert");
        }

    }


    public void deleteVolP(Map<String, String> parameter) {
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int volNum = Integer.parseInt(parameter.get("volNum"));

        VolPDTO num = new VolPDTO();
        num.setUserNum(userNum);
        num.setVolNum(volNum);

        if (volPService.deleteVolP(num)) {
            printResult.printSuccessMessage("delete");
        }
    }

    public void selectVolP(Map<String, String> parameter) {
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int volNum = Integer.parseInt(parameter.get("volNum"));

        List<CountDTO> result = volPService.selectVolP(userNum, volNum);
        if (result != null) {
            // 성공 코드와 결과 객체를 함께 printSuccesscount 메서드에 전달
            printResult.printSuccesscount("select",  result.get(0));

        }
    }
}

