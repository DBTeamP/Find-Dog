package com.dbteam.xml.finddog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDogView {
    public static void pageFindingDog() {
        Scanner sc = new Scanner(System.in);
        FindDogController findDogController = new FindDogController();
        do {
            System.out.println("======= FINDING DOG =======");
            System.out.println("1. 미아견 확인하기");
            System.out.println("2. 미아견 등록하기");
            System.out.println("3. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    findingDog();
                    break;
                case 2:
                    findDogController.registerDog(inputDog());
                    break;

                case 3:
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        } while (true);
    }
    //
    private static void findingDog() {
        Scanner sc = new Scanner(System.in);
        FindDogController findDogController = new FindDogController();

        do {
            System.out.println("======= FINDING DOG =======");
            System.out.println("1. 전체 목록 보기");
            System.out.println("2. 이름으로 찾기");
            System.out.println("3. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    findDogController.selectAllDog();
                    break;
                case 2:
                    findDogController.findSearchDog(inputFindName());
                    // view(지금여기) -> controller -> service에서 mapper-mapping -> controller -> view
                    break;
                case 3:
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        } while (true);
    }

    /**/
    private static Map<String, String> inputDog() {
        Scanner sc = new Scanner(System.in);
        System.out.print("강아지 이름을 입력하세요: ");
        String findName = sc.nextLine();
        System.out.print("강아지 정보를 입력하세요: ");
        String findTxt = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("findName", findName);
        parameter.put("findTxt", findTxt);

        return parameter;
    }

    private static Map<String, String> inputFindName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String findName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("findName", findName);

        return parameter;
    }


}
