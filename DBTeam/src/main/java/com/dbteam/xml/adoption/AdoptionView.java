package com.dbteam.xml.adoption;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdoptionView {
    public static void pageAdoption(){
        Scanner sc = new Scanner(System.in);
        AdoptionController adoptionController = new AdoptionController();

        do{
            System.out.println("======= FINDING DOG ADOPTION =======");
            System.out.println("1. 입양일지 전체 조회 ");
            System.out.println("2. 입양 일지 추가하기");
            System.out.println("3. 입양 일지 삭제하기");
            System.out.println("4. 제목으로 일지 검색");
            System.out.println("5. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: adoptionController.selectAllMenu();break;
                case 2: adoptionController.registAdoption(inputAdoption());break;
                case 3: adoptionController.deleteAdoption(inputAdoptionCode());break;
                case 4: adoptionController.searchAdoptionByName();break;
                case 5: return;

            }
        }while(true);
    }
    //
    /*========== Adoption ==========*/
    //추가
    private static Map<String, String> inputAdoption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("일지 제목을 입력하세요 : ");
        String adoptionName = sc.nextLine();
        System.out.print("일지 내용을 입력하세요 : ");
        String adoptionTxt = sc.nextLine();
        System.out.print("유저 번호를 입력하세요 : ");
        String userNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("adoptionName", adoptionName);
        parameter.put("adoptionTxt", adoptionTxt);
        parameter.put("userNum", userNum);

        return parameter;
    }

    //삭제
    private static Map<String,String> inputAdoptionCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("입양일지 번호를 입력하세요 : ");
        String adoptionNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("adoptionNum", adoptionNum);

        return parameter;

    }

}
