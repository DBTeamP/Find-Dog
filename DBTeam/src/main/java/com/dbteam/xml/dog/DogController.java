package com.dbteam.xml.dog;

import com.dbteam.common.dtopackage.DogDTO;

import java.util.List;
import java.util.Map;

public class DogController {

    private final DogService dogService;
    private final PrintResult printResult;

    public DogController() {
        dogService = new DogService();
        printResult = new PrintResult();
    }

    /* 조회 */

    /* 추가 */
    public void registDogProfile(Map<String, String> parameter){

        //int dogNum = Integer.parseInt(parameter.get("dogNum"));
        String dogName = parameter.get("dogName");
        String dogKind = parameter.get("dogKind");
        int dogAge = Integer.parseInt(parameter.get("dogAge"));
        int regionNum = Integer.parseInt(parameter.get("regionNum"));
        int managerNum = Integer.parseInt(parameter.get("managerNum"));

        DogDTO dog = new DogDTO();
        //dog.setDogNum(dogNum);
        dog.setDogName(dogName);
        dog.setDogKind(dogKind);
        dog.setDogAge(dogAge);
        dog.setRegionNum(regionNum);
        dog.setManagerNum(managerNum);

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

}
