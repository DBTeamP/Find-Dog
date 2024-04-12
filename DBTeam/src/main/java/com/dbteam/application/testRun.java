package com.dbteam.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testRun {
    public static void main(String[] args) {
        welComeDog();
    }

    private static void welComeDog() {
        Scanner sc = new Scanner(System.in);
        LogInController logInController = new LogInController(); // LogInController 객체 생성
        do {
            System.out.println("====== FINDING DOG =======");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.print("번호를 입력해주세요 : ");

            int no = sc.nextInt();
            switch (no) {
                case 1:
                    logInController.registId(insertUser(sc)); // LogInController 객체를 insertUser 메서드에 전달
                    break;
                case 2:
                    logInPage(sc, logInController); // LogInController 객체를 logInPage 메서드에 전달
                    break;
                case 3:
                    return;
            }
        } while (true);
    }

    private static Map<String, String> insertUser(Scanner sc) {
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

    private static void logInPage(Scanner sc, LogInController logInController) {
        System.out.println("====== LOGIN ======");
        System.out.println("1. 보호 단체 로그인");
        System.out.println("2. 일반 유저 로그인");
        System.out.println("3. 이전 페이지로 이동");
        System.out.print("번호를 입력해주세요 : ");
        int no = sc.nextInt();
        switch (no) {
            case 1:
                break;
            case 2:
                logIn(sc, logInController); // LogInController 객체를 logIn 메서드에 전달
                break;
            case 3:
                return;
        }
    }

    private static void logIn(Scanner sc, LogInController logInController) {
        System.out.println("아이디를 입력해주세요: ");
        String userId = sc.next();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        logInController.logIn(parameter);
    }



    static void pageUserMain(){
        Scanner sc = new Scanner(System.in);
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
                case 1: pageAdoption(); break;
                case 2: pageFindingDog(); break;
                case 3: volPage();break;
                case 4: pageDogBoard();break;
                case 5: return;
            }
        }while(true);
    }

    private static void pageAdoption(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("======= FINDING DOG ADOPTION =======");
            System.out.println("1. 일지 내용 구경하기 ");
            System.out.println("2. 일지 추가하기");
            System.out.println("3. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: break;
                case 2: break;
                case 3: return;
            }
        }while(true);
    }

    private static void pageFindingDog(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("======= FINDING DOG =======");
            System.out.println("1. 미아견 확인하기");
            System.out.println("2. 미아견 등록하기");
            System.out.println("3. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: break;
                case 2: break;
                case 3: return;
            }
        }while(true);
    }

    static void pageAdminMain(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("======= FINDING GROUP MAIN =======");
            System.out.println("1. 봉사 게시판 관리하기");
            System.out.println("2. 유기견 정보 관리하기");
            System.out.println("3. 유기견 게시판 관리하기");
            System.out.println("4. 이전으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: volPage();break;
                case 2: pageDog(); break;
                case 3: pageDogBoard();break;
                case 4: return;
            }
        }while(true);
    }

    private static void pageDog(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("======= DOG =======");
            System.out.println("1. 유기견 보러가기");
            System.out.println("2. 유기견 정보 추가하기");
            System.out.println("3. 유기견 정보 삭제하기");
            System.out.println("4. 이전 페이지로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: return;
            }
        } while(true);
    }

    private static void pageDogBoard(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("======= DOG BOARD =======");
            System.out.println("1. 유기견 게시판 보러가기");
            System.out.println("2. 유기견 게시판 내용 추가하기");
            System.out.println("3. 유기견 게시판 내용 삭제하기");
            System.out.println("4. 이전 페이지로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: return;
            }
        }while(true);
    }
    private static void volPage(){
        Scanner sc = new Scanner(System.in);
//        MenuController menuController = new MenuController();

        do{
            System.out.println("====== VOLUNTEER ======");
            System.out.println("1. 봉사 일정 추가");
            System.out.println("2. 봉사 게시글 보기");
            System.out.println("3. 봉사 일정 삭제");
            System.out.println("4. 각 게시글 별 인원 확인");
            System.out.println("5. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){
//                case 1: menuController.registMenu(inputVol()); break;
                case 2: break;
//                case 3: menuController.deleteVol(inputVolNum()); break;
                case 4: break;
                case 5: return;
            }
        }while(true);
    }

    private static Map<String, String> inputVolNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("봉사 번호를 입력하세요 : ");
        String num = sc.nextLine();

        Map<String, String > parameter = new HashMap<>();
        parameter.put("num",num);

        return parameter;
    }

    private static Map<String, String> inputVol(){
        Scanner sc = new Scanner(System.in);
        System.out.print("봉사활동 제목을 입력하세요 : ");
        String volName = sc.nextLine();
        System.out.print("봉사활동 내용을 입력하세요 : ");
        String volTxt = sc.nextLine();
        System.out.print("봉사활동 날짜를 입력하세요(yyyy-mm-dd) : ");
        String volDate = sc.nextLine();
        System.out.print("봉사활동 지역을 입력하세요 : ");
        String regionNum=sc.nextLine();
        System.out.println("봉사활동 진행 단체의 번호를 입력하세요 : ");
        String managerNum=sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("volName", volName);
        parameter.put("volTxt", volTxt);
        parameter.put("volDate", volDate);
        parameter.put("regionNum",regionNum);
        parameter.put("managerNum",managerNum);

        return parameter;
    }
}
