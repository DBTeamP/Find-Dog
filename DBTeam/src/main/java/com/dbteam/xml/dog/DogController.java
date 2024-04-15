package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DogController {

    private final DogService dogService;
    private final PrintResult printResult;

    public DogController() {
        dogService = new DogService();
        printResult = new PrintResult();
    }

    /* 조회 */
    public void selectAllProfile() {
        List<DogDTO> dogList = dogService.selectAllProfile();

        if(dogList != null){
            printResult.printDogList(dogList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    /* 추가 */
    public void registDogProfile(Map<String, String> parameter){

        //int dogNum = Integer.parseInt(parameter.get("dogNum"));
        String dogName = parameter.get("dogName");
        String dogKind = parameter.get("dogKind");
        int dogAge = Integer.parseInt(parameter.get("dogAge"));

        DogDTO dog = new DogDTO();
        //dog.setDogNum(dogNum);
        dog.setDogName(dogName);
        dog.setDogKind(dogKind);
        dog.setDogAge(dogAge);


        if (dogService.registDogProfile(dog)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    /* 수정 */

    /* 삭제 */
    public void deleteDogProfile(Map<String, String> parameter) {

        int dogNum = Integer.parseInt(parameter.get("dogNum"));

        if (dogService.deleteDogProfile(dogNum)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }

    /* 검색 */
    public void searchDogByKind() {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 품종을 입력하세요: ");
        String dogKind = sc.nextLine();

        List<DogDTO> dogList = dogService.searchDogByKind(dogKind);

        if(dogList != null && !dogList.isEmpty()) {
            printResult.printDogList(dogList);
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


}
