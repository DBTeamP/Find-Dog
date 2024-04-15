package com.dbteam.xml.login;

import com.dbteam.xml.adoption.AdoptionView;
import com.dbteam.xml.dog.DogView;
import com.dbteam.xml.dogboard.DogBoardView;
import com.dbteam.xml.finddog.FindDogView;
import com.dbteam.xml.volunteer.VolView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginView {

    private static String rights = "N"; //일단 Y로 초기호할게요
    public static Map<String, String> logInPage() {
        Scanner sc = new Scanner(System.in);
        LogInController logInController = new LogInController(); // LogInController 객체 생성
        System.out.println("====== LOGIN ======");
        System.out.println("1. 보호 단체 로그인");
        System.out.println("2. 일반 유저 로그인");
        System.out.println("3. 이전 페이지로 이동");
        System.out.print("번호를 입력해주세요 : ");
        int no = sc.nextInt();
        switch (no) {
            case 1:
                if(logInController.lonInAdmin(logIn()) == "Y"){
                    rights = "Y";
                    pageAdminMain();
                }
                break;
            case 2:
                if(logInController.logInUser(logIn()) == "N"){
                    rights = "N";
                    pageUserMain();
                }
                break;

            case 3:
                return null;
        }
        return null;
    }

    //
    private static Map<String, String> logIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요: ");
        String userId = sc.next();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);

        return parameter;
    }

    //
    static void pageAdminMain(){
        Scanner sc = new Scanner(System.in);
        DogView dogView = new DogView();
        DogBoardView dogBoardView =  new DogBoardView();
        VolView volView = new VolView();

        do{
            System.out.println("======= FINDING GROUP MAIN =======");
            System.out.println("1. 봉사 게시판 관리하기");
            System.out.println("2. 유기견 정보 관리하기");
            System.out.println("3. 유기견 게시판 관리하기");
            System.out.println("4. 이전으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: volView.volPage(rights);break;
                case 2: dogView.pageDog(); break;
                case 3: dogBoardView.pageDogBoard();break;
                case 4: return;
            }
        }while(true);
    }

    //
    static void pageUserMain() {
        Scanner sc = new Scanner(System.in);
        DogBoardView dogBoardView =  new DogBoardView();
        AdoptionView adoptionView = new AdoptionView();
        VolView volView = new VolView();
        FindDogView findDogView = new FindDogView();
        do {
            System.out.println("======= FINDING DOG MAIN =======");
            System.out.println("1. 입양 일지 구경하기");
            System.out.println("2. 잃어버린 강아지 찾아보기");
            System.out.println("3. 봉사 게시판 찾아보기");
            System.out.println("4. 유기견 게시판 찾아보기");
            System.out.println("5. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    adoptionView.pageAdoption();
                    break;
                case 2:
                    findDogView.pageFindingDog();
                    break;
                case 3:
                    volView.volPage(rights);
                    break;
                case 4:
                    dogBoardView.pageDogBoard();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    public static Map<String, String> insertUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요: ");
        String userId = sc.next();
        System.out.print("이름을 입력해주세요: ");
        String userName = sc.next();
        System.out.print("전화번호를 입력해주세요: ");
        String userPhone = sc.next();
        System.out.print("지역번호를 입력해주세요: ");
        int regionNum = sc.nextInt();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        parameter.put("userName", userName);
        parameter.put("userPhone", userPhone);
        parameter.put("regionNum", String.valueOf(regionNum));

        return parameter;
    }

}
