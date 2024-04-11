package com.dbteam.xml.dog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application2 {     /* 실행 테스트용 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DogController dogController = new DogController();

        do {
            System.out.println("===== 유기견 관리 =====");
            /* 조회 (select) */   //System.out.println("조회");

            /* 추가 (insert) */
            System.out.println("1. 유기견 추가");

            /* 수정 (update)*/    //System.out.println("수정");

            /* 삭제 (delete) */
            System.out.println("2. 유기견 삭제");

            /* 종료 */
            System.out.println("9. 프로그램 종료");
            System.out.println("==============================");
            System.out.print("수행할 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                /* 조회 (select) */

                /* 추가 (insert) */
                case 1: dogController.registDogProfile(inputDogProfile()); break;

                /* 수정 (update) */

                /* 삭제 (delete) */
                case 2: dogController.deleteDogProfile(inputDogCode()); break;

                //
                case 9: System.out.println("유기견 프로필 관리 프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 관리 번호입니다."); break;
            }
        } while (true);

    }

    /* 조회 */
    /* 삭제*/
    private static Map<String, String> inputDogCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("강아지 번호를 입력하세요. : ");
        String dogNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogNum", dogNum);

        return parameter;
    }

    /* 추가 */
    private static Map<String, String> inputDogProfile() {
        Scanner sc = new Scanner(System.in);
        /*
            //dogNum, dogName, dogKind, dogAge, regionNum, managerNum
            //dogName, dogKind, dogAge
         */
        System.out.print("강아지 이름을 입력하세요 : ");
        String dogName = sc.nextLine();
        System.out.print("강아지 품종을 입력하세요 : ");
        String dogKind = sc.nextLine();
        System.out.print("강아지 나이를 입력하세요 : ");
        String dogAge = sc.nextLine();
        System.out.print("강아지의 지역번호를 입력하세요 : ");
        String regionNum = sc.nextLine();
        System.out.print("강아지의 관리자번호를 입력하세요 : ");
        String managerNum = sc.next();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogName", dogName);
        parameter.put("dogKind", dogKind);
        parameter.put("dogAge", dogAge);
        parameter.put("regionNum", regionNum);
        parameter.put("managerNum", managerNum);

        return parameter;
    }

    /* 변경 */

    /* 삭제 */

}
