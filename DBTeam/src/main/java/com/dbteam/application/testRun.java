package com.dbteam.application;

import com.dbteam.common.dtopackage.UsersDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testRun {

    public static void main(String[] args) {
        welComeDog();
    }
    private static UsersDTO user;
    private static void welComeDog(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("====== FINDING DOG =======");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.print("번호를 입력해주세요 : ");

            int no = sc.nextInt();
            switch (no) {
                case 1: break;
                case 2: logInPage(); break;
                case 3: return;
            }
        }while(true);
    }

    private static void logInPage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== LOGIN ======");
        System.out.println("1. 보호 단체 로그인");
        System.out.println("2. 일반 유저 로그인");
        System.out.println("3. 이전 페이지로 이동");
        System.out.print("번호를 입력해주세요 : ");
        int no = sc.nextInt();
        switch (no) {
            case 1: pageAdminMain(); break;
            case 2: pageUserMain(); break;
            case 3: return;
        }
    }
    private static void pageUserMain(){
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

    private static void pageAdminMain(){
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
        VolController volController = new VolController();

        do{
            System.out.println("====== VOLUNTEER ======");
            System.out.println("1. 봉사 일정 추가");
            System.out.println("2. 봉사 게시글 보기");
            System.out.println("3. 봉사글 상세 보기");
            System.out.println("4. 봉사 일정 삭제");
            System.out.println("5. 각 게시글 별 인원 확인");
            System.out.println("6. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1:
                    // 권환 확인
                    if(volController.checkRights(user) == true) {
                        volController.registMenu(inputVol());
                        break;
                    } else {
                        System.out.println("권한이 없습니다.");
                    }
                case 2: volController.selectAllMenu(); break;
                case 3: volController.selectVolByTxt(inputVolTxt()); break;
                case 4:
                    if(volController.checkRights(user) == true) {
                        volController.deleteVol(inputVolNum());
                    } else{
                        System.out.println("권한이 없습니다.");
                    }
                    break;
                case 5: break;
                case 6: return;
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

    private static Map<String, String> inputVolTxt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("봉사 제목을 입력하세요 : ");
        String volTxt = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("volTxt",volTxt);

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
        System.out.print("봉사활동 진행 단체의 번호를 입력하세요 : ");
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
