package com.dbteam.xml.finddog;

import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.Map;

public class FindDogController {

    private final FindDogService findDogService;
    private final PrintResult printResult;

    public FindDogController(){
        findDogService = new FindDogService();
        printResult = new PrintResult();
    }

    /* 조회 */

    /* 추가 */
    public void registFindDogBoard(Map<String, String> parameter) {
        //int findNum = Integer.parseInt(parameter.get("findNum"));
        String findName = parameter.get("findName");
        String findTxt = parameter.get("findTxt");
        int userNum = Integer.parseInt(parameter.get("userNum"));
        int regionNum = Integer.parseInt(parameter.get("regionNum"));

        FindDogDTO finddog = new FindDogDTO();
        //finddog.setFindNum(findNum);
        finddog.setFindName(findName);
        finddog.setFindTxt(findTxt);
        finddog.setUserNum(userNum);
        finddog.setRegionNum(regionNum);

        if (findDogService.registFindDogBoard(finddog)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    /* 수정 */

    /* 삭제 */
    public void deleteFindDogBoard(Map<String, String> parameter) {
        int findNum = Integer.parseInt(parameter.get("findNum"));

        if (findDogService.deleteFindDogBoard(findNum)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }

}
