package com.dbteam.xml.dog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application2 {     /* 실행 테스트용 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DogController dogController = new DogController();

        do {
            System.out.println("===== 유기견 프로필 관리 =====");
            //System.out.println("1. 전체 프로필 조회");

            /* insert 기능 */
            System.out.println("1. 신규 프로필 추가(insert)");


            System.out.println("==============================");
            System.out.print("메뉴 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                //case 1: dogController.selectAllProfile(); break;
                /* insert 기능*/
                case 1: dogController.registDogProfile(inputDogProfile()); break;

                //
                case 9: System.out.println("메뉴 관리 프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 관리 번호입니다."); break;
            }


        } while (true);





    }

    private static Map<String, String> inputDogProfile() {
        Scanner sc = new Scanner(System.in);
        /* dogNum, dogName, dogKind, dogAge, regionNum, managerNum
        //dogName, dogKind, dogAge
         */
        System.out.println("강아지 이름을 입력하세요 : ");
        String dogName = sc.nextLine();
        System.out.println("강아지 품종을 입력하세요 : ");
        String dogKind = sc.nextLine();
        System.out.println("강아지 나이를 입력하세요 : ");
        String dogAge = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogName", dogName);
        parameter.put("dogKind", dogKind);
        parameter.put("dogAge", dogAge);

        return parameter;



    }
}
