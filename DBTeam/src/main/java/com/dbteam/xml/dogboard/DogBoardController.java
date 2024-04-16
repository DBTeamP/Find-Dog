package com.dbteam.xml.dogboard;

import com.dbteam.common.dtopackage.DogBoardDTO;
import com.dbteam.xml.login.LoginView;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
       dogBoardName, dogBoardTxt, dogNum */

        //int dogBoardNum = Integer.parseInt(parameter.get("dogBoardNum"));
        String dogBoardName = parameter.get("dogBoardName");
        String dogBoardTxt = parameter.get("dogBoardTxt");
        int dogNum = Integer.parseInt(parameter.get("dogNum"));

        DogBoardDTO dogboard = new DogBoardDTO();
        //dogboard.setDogBoardNum(dogBoardNum);
        dogboard.setDogBoardName(dogBoardName);
        dogboard.setDogBoardTxt(dogBoardTxt);
        dogboard.setDogNum(dogNum);

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

    /* 검색 */
    public void searchDogBoardByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 게시글의 제목을 입력하세요(단어 검색 가능) : ");
        String dogBoardName = sc.nextLine();

        List<DogBoardDTO> dogBoardList = dogBoardService.searchDogBoardByName(dogBoardName);

        if(dogBoardList != null && !dogBoardList.isEmpty()){
            printResult.printDogBoardList(dogBoardList);
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

}
