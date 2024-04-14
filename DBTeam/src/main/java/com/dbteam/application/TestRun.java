package com.dbteam.application;



import com.dbteam.xml.volunteer_person.VolPController;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {
        welComeDog();
    }
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


        private static void volPPage(){

            Scanner sc = new Scanner(System.in);
            VolPController volPController = new VolPController();

             do {
            System.out.println("====Volunteer_person=====");
            System.out.println("1. 봉사 일정 추가 ");
            System.out.println("2. 봉사 일정 삭제");
            System.out.println("3. 각 봉사활동 신청 인원 수 체크 ");
            System.out.println("4. 이전 페이지로 이동 ");
            System.out.println("9. 프로그램 종료");
            System.out.println(" ");
            System.out.println("=============");
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
                    System.out.println("봉사활동 관리 프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 관리 번호입니다."); break;
              }

          } while (true);

         }




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
                System.out.println("봉사활동 이름을 적어주세요 ");
                String volName = sc.nextLine();

                Map<String,String> parameter = new HashMap<>();
                parameter.put("volName",volName);

                return parameter;
            }

}




