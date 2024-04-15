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

    // 전체 찾기
    public void selectAllDog() {
        List<FindDogDTO> fdogList = findDogService.selectAllDog();


        if (fdogList != null) {
            printResult.printDogList(fdogList);
        } else {
            printResult.printErrorMessage("");
        }
    }

    public void registerDog(Map<String, String> parameter) {
        String findName = parameter.get("findName");
        String findTxt = parameter.get("findTxt");

        FindDogDTO fdog = new FindDogDTO();
        fdog.setFindName(findName);
        fdog.setFindTxt(findTxt);

        //여기 나중에 반드시 출력문구 느세요 지금 귀차늠 ㅋ넵
        if (findDogService.registerDog(fdog)) {
            printResult.printSuccessMessage("");
        } else {
            printResult.printErrorMessage("");
        }
    }

    public void findSearchDog(Map<String, String> parameter) {
        String findName = parameter.get("findName");
        List<FindDogDTO> dogList = findDogService.selectDogByName(findName);

        if (dogList != null) {
            printResult.printDogList(dogList);
        } else{
            // 여기 나중에 printErrorMessage 클래스 만들어서 위에랑 비슷하게 해야함
            System.out.println("error");
        }

    }

}
