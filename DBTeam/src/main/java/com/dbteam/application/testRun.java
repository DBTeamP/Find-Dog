package com.dbteam.application;


import com.dbteam.xml.adoption.AdoptionView;
import com.dbteam.xml.dog.DogView;
import com.dbteam.xml.dogboard.DogBoardView;
import com.dbteam.xml.finddog.FindDogView;
import com.dbteam.xml.login.LogInController;
import com.dbteam.xml.login.LoginView;
import com.dbteam.xml.volunteer.VolView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testRun {
//    private static FindDogMapper findDogMapper; // 필드 선언 위치 변경
//
//    static {
//        SqlSession sqlSession = getSqlSession();
//        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
//    }

    public static void main(String[] args) {
        welComeDog();

    }

    private static void welComeDog() {
        Scanner sc = new Scanner(System.in);
        LogInController logInController = new LogInController(); // LogInController 객체 생성
        LoginView loginView = new LoginView();

        do {
            System.out.println("====== FINDING DOG =======");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.print("번호를 입력해주세요 : ");

            int no = sc.nextInt();
            switch (no) {
                case 1:
                    logInController.registId(loginView.insertUser());
                    break;
                case 2:
                    loginView.logInPage();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }

//    private static Map<String, String> insertUser() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("아이디를 입력해주세요: ");
//        String userId = sc.next();
//        System.out.print("이름을 입력해주세요: ");
//        String userName = sc.next();
//        System.out.print("전화번호를 입력해주세요: ");
//        String userPhone = sc.next();
//        System.out.print("지역번호를 입력해주세요: ");
//        int regionNum = sc.nextInt();
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("userId", userId);
//        parameter.put("userName", userName);
//        parameter.put("userPhone", userPhone);
//        parameter.put("regionNum", String.valueOf(regionNum));
//
//        return parameter;
//    }



}

