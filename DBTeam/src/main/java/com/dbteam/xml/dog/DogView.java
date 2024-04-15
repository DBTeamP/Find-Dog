package com.dbteam.xml.dog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DogView {

    public static void pageDog(){
        Scanner sc = new Scanner(System.in);
        DogController dogController = new DogController();
        do{
            System.out.println("======= DOG =======");
            System.out.println("1. 유기견 보러가기");
            System.out.println("2. 유기견 정보 추가하기");
            System.out.println("3. 유기견 정보 삭제하기");
            System.out.println("4. 유기견 품종으로 검색하기");
            System.out.println("5. 이전 페이지로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: dogController.selectAllProfile();break;
                case 2: dogController.registDogProfile(inputDogProfile()); break;
                case 3: dogController.deleteDogProfile(inputDogCode()); break;
                case 4: dogController.searchDogByKind(); break;
                case 5: return;

            }
        } while(true);
    }

    //
    /* ========== DOG ========== */
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
        /* dogNum
         , dogName, dogKind, dogAge
         */
        System.out.print("강아지 이름을 입력하세요 : ");
        String dogName = sc.nextLine();
        System.out.print("강아지 품종을 입력하세요 : ");
        String dogKind = sc.nextLine();
        System.out.print("강아지 나이를 입력하세요 : ");
        String dogAge = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogName", dogName);
        parameter.put("dogKind", dogKind);
        parameter.put("dogAge", dogAge);

        return parameter;
    }

}
