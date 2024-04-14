    package com.dbteam.application;

    import com.dbteam.common.dtopackage.FindDogDTO;

    import java.util.List;
    import java.util.Map;

    public class FindDogController {

        private final PrintResult printResult;
        private final FindDogService findDogService;

        public FindDogController() {
            printResult = new PrintResult();
            findDogService = new FindDogService();
        }

        public void selectAllDog(Map<String, String> parameter) {
            List<FindDogDTO> dogList = findDogService.selectAllDog();

            if (dogList != null) {
                printResult.printDogList(dogList);
            } else {
                System.out.println("error");
            }
        }
        public void selectDogByName(Map<String, String> parameter) {
            String dogName = parameter.get("name");
            FindDogDTO dog = findDogService.selectDogByName(dogName);

            if (dog != null) {
                printResult.printDog(dog);
            } else {
                System.out.println("error");
            }
        }


        public void registerDog(Map<String, String> parameter) {
            String name = parameter.get("FindName");

            FindDogDTO dog = new FindDogDTO();
            dog.setFindName(name);

            if (findDogService.registerDog(dog)) {
                printResult.printDogSuccessMessage("insert");
            } else {
                System.out.println("error");
            }
        }
    }
