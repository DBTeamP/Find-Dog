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
            String volName = parameter.get("volName");
        List<CountDTO> result = volPService.selectVolP(volName);

        if (result != null && !result.isEmpty()) {
            for (CountDTO dto : result)
            printResult.printSuccesscount("select",  dto);
        }else {
            System.out.println("조회 결과가 없습니다. 올바른 봉사활동 이름을 입력해주세요.");
        }
    }
}

