package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;

import java.util.List;
import java.util.Map;

public class DogBoardController {

    private final DogBoardService dogBoardService;
    private final PrintResult printResult;

    public DogBoardController(){
        dogBoardService = new DogBoardService();
        printResult = new PrintResult();
    }

    /* 조회 */
    public void selectAllDogBoard() {
        List<DogBoardDTO> dogBoardList = dogBoardService.selectAllDogBoard();

        if(dogBoardList != null){
            printResult.printDogBoardList(dogBoardList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    /* 추가 */
    public void registDogBoard(Map<String, String> parameter) {
       /* dogBoardNum,
       dogBoardName, dogBoardTxt, dogNum, regionNum, managerNum */

        //int dogBoardNum = Integer.parseInt(parameter.get("dogBoardNum"));
        String dogBoardName = parameter.get("dogBoardName");
        String dogBoardTxt = parameter.get("dogBoardTxt");
        int dogNum = Integer.parseInt(parameter.get("dogNum"));
//        int regionNum = Integer.parseInt(parameter.get("regionNum"));
//        int managerNum = Integer.parseInt(parameter.get("managerNum"));

        DogBoardDTO dogboard = new DogBoardDTO();
        //dogboard.setDogBoardNum(dogBoardNum);
        dogboard.setDogBoardName(dogBoardName);
        dogboard.setDogBoardTxt(dogBoardTxt);
        dogboard.setDogNum(dogNum);
//        dogboard.setRegionNum(regionNum);
//        dogboard.setManagerNum(managerNum);

        if (dogBoardService.registDogBoard(dogboard)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    /* 수정 */

    /* 삭제 */
    public void deleteDogBoard(Map<String, String> parameter) {
        int dogBoardNum = Integer.parseInt(parameter.get("dogBoardNum"));

        if (dogBoardService.deleteDogBoard(dogBoardNum)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }


}
