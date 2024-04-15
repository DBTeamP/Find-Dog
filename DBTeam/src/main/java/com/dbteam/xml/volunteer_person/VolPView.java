package com.dbteam.xml.volunteer_person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VolPView {

    public static void volPPage(){

        Scanner sc = new Scanner(System.in);
        VolPController volPController = new VolPController();

        do {
            System.out.println("====Volunteer_person=====");
            System.out.println("1. 봉사 일정 추가 ");
            System.out.println("2. 봉사 일정 삭제");
            System.out.println("3. 각 봉사활동 신청 인원 수 체크 ");
            System.out.println("4. 이전 페이지로 이동 ");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    volPController.insertVolP(inputVolP());
                    break;
                case 2:
                    volPController.deleteVolP(inputVolPcode());
                    break;
                case 3:
                    volPController.selectVolP(inputVolName());
                    break;
                case 4:
                    return;
                case 9:
                    System.out.println("봉사활동 관리 프로그램을 종료합니다. "); return;
                default: System.out.println("잘못된 관리 번호입니다. "); break;
            }

        } while (true);

    }

    //
    private static Map<String, String> inputVolP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 번호를 입력하세요 : ");
        String userNum = sc.nextLine();
        System.out.print("봉사 번호를 입력하세요 : ");
        String volNum = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("userNum", userNum);
        parameter.put("volNum", volNum);


        return parameter;
    }


    private static Map<String , String> inputVolPcode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 번호를 입력하세요 : ");
        String userNum = sc.nextLine();
        System.out.print("봉사 번호를 입력하세요 : ");
        String volNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("userNum", userNum);
        parameter.put("volNum", volNum);

        return parameter;

    }


    private static Map<String, String> inputVolName() {
        Scanner sc =new Scanner(System.in);
        System.out.println("봉사활동 이름을 적어주세요 : ");
        String volName = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("volName",volName);

        return parameter;
    }

}


