package com.dbteam.application;


import com.dbteam.xml.adoption.AdoptionController;

import com.dbteam.common.dtopackage.UsersDTO;
import com.dbteam.xml.dog.FindDogMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.dbteam.common.Template.getSqlSession;

public class testRun {
    private static FindDogMapper findDogMapper; // 필드 선언 위치 변경

    static {
        SqlSession sqlSession = getSqlSession();
        findDogMapper = sqlSession.getMapper(FindDogMapper.class);
    }

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
                    logInController.registId(insertUser());
                    break;
                case 2:
                    logInPage();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }

    private static Map<String, String> insertUser() {
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

    private static Map<String, String> logInPage() {
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
                logInController.logInSer(logIn());
                break;
            case 2:
                logInController.logInSer(logIn());
                break;

            case 3:
                return null;
        }
        return null;
    }

    private static Map<String, String> logIn() {
        LogInController logInController = new LogInController();
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요: ");
        String userId = sc.next();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("userId", userId);
        logInController.logInSer(parameter);
        return parameter;
    }

    static void pageUserMain() {
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
                case 1:
                    pageAdoption();
                    break;
                case 2:
                    pageFindingDog();
                    break;
                case 3:
                    volPage();
                    break;
                case 4:
                    pageDogBoard();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private static void pageAdoption(){
        Scanner sc = new Scanner(System.in);
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
                case 1: break;
                case 2: break;
                case 3: return;
                case 4: return;
                case 5: return;

            }
        }while(true);
    }

    private static void pageFindingDog() {
        Scanner sc = new Scanner(System.in);
        FindDogController findDogController = new FindDogController();
        do {
            System.out.println("======= FINDING DOG =======");
            System.out.println("1. 미아견 확인하기");
            System.out.println("2. 미아견 등록하기");
            System.out.println("3. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    findingDog();
                    break;
                case 2:
                    findDogController.registerDog(inputDog());
                    break;

                case 3:
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        } while (true);
    }

    private static Map<String, String> inputDog() {
        Scanner sc = new Scanner(System.in);
        System.out.print("강아지 이름을 입력하세요: ");
        String findName = sc.nextLine();
        System.out.print("강아지 정보를 입력하세요: ");
        String findTxt = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("findName", findName);
        parameter.put("findTxt", findTxt);

        return parameter;
    }


    private static void findingDog() {
        Scanner sc = new Scanner(System.in);
        FindDogController findDogController = new FindDogController();

        do {
            System.out.println("======= FINDING DOG =======");
            System.out.println("1. 전체 목록 보기");
            System.out.println("2. 이름으로 찾기");
            System.out.println("3. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    findDogController.selectAllDog();
                    break;
                case 2:
                    findDogController.findSearchDog(inputFindName());
                    // view(지금여기) -> controller -> service에서 mapper-mapping -> controller -> view
                    break;
                case 3:
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        } while (true);
    }

    private static Map<String, String> inputFindName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String findName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("findName", findName);

        return parameter;
    }

    private static FindSearchDog ffindsearchDog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 강아지의 이름을 입력하세요 : ");
        String value = sc.nextLine();

        return new FindSearchDog(value);

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
        //권한에 따른 추가 삭제 제한 조정해야함
        //유저 고유 번호를 받아 값을 입력받아야함
        //userDTO 관련 지워서 로그인쪽이랑 다시 연동시켜야함
        Scanner sc = new Scanner(System.in);
        VolController volController = new VolController();
//        MenuController menuController = new MenuController();
        UsersDTO user = new UsersDTO();
        user.setUserNum(1);

        do{
            System.out.println("====== VOLUNTEER ======");
            System.out.println("1. 봉사 일정 추가");
            System.out.println("2. 봉사 게시글 보기");
            System.out.println("3. 봉사글 상세 보기");
            System.out.println("4. 봉사 일정 삭제");
            System.out.println("5. 각 게시글 별 인원 확인");
            System.out.println("6. 내가 작성한 글 보기");
            System.out.println("7. 이전 화면으로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){

                case 1:
                    // 권환 확인 (분기 처리)
                    if(user.getAdminRights() == "Y") {
                        volController.registMenu(inputVol());
                        break;
                    } else {
                        System.out.println("권한이 없습니다.");
                    }
                case 2: volController.selectAllMenu(); break;
                case 3: volController.selectVolByTxt(inputVolTxt()); break;
                case 4:
                    if(user.getAdminRights() == "N") {
                        volController.deleteVol(inputVolNum());
                    } else{
                        System.out.println("권한이 없습니다.");
                    }
                    break;
                case 5: break;
                case 6: volController.searchByUserNum(user.getUserNum()); break;
                case 7: return;

            }
        } while(true);
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

