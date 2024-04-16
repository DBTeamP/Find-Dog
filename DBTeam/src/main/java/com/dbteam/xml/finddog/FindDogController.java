package com.dbteam.xml.finddog;

import com.dbteam.common.dtopackage.FindDogDTO;

import java.util.List;
import java.util.Map;

public class FindDogController {

    private PrintResult printResult;
    private FindDogService findDogService;

    public FindDogController() {
        printResult = new PrintResult();
        findDogService = new FindDogService();
    }

    public void selectAllDog() {
        List<FindDogDTO> fdogList = findDogService.selectAllDog();

        if (fdogList != null) {
            printResult.printDogList(fdogList);
        } else {
            printResult.printErrorMessage("error");
        }
    }

    public void registerDog(Map<String, String> parameter) {
        String findName = parameter.get("findName");
        String findTxt = parameter.get("findTxt");

        FindDogDTO fdog = new FindDogDTO();
        fdog.setFindName(findName);
        fdog.setFindTxt(findTxt);

        if (findDogService.registerDog(fdog)) {
            printResult.printSuccessMessage("등록에 성공하셨습니다");
        } else {
            printResult.printErrorMessage("error");
        }
    }

    public void findSearchDog(Map<String, String> parameter) {
        String findName = parameter.get("findName");
        List<FindDogDTO> dogList = findDogService.selectDogByName(findName);

        if (dogList != null) {
            printResult.printDogList(dogList);
        } else{
            System.out.println("error");
        }

    }

}
