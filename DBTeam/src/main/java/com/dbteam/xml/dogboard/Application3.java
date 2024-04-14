package com.dbteam.xml.dogboard;

import com.dbteam.xml.dog.DogMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application3 { /* 실행 테스트용 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DogBoardController dogBoardController = new DogBoardController();
//        DogBoardService dogBoardService = new DogBoardService();

        do{
            System.out.println("===== 유기견 게시판 관리 (DOG BOARD) =====");
            /* 조회 */
            System.out.println("1. 유기견 게시판 조회");

            /* 추가 */
            System.out.println("2. 유기견 게시판 추가");

            /* 수정 */    //System.out.println("수정");

            /* 삭제 */
            System.out.println("3. 유기견 게시판 삭제");

            /* 검색 */
            System.out.println("4. 유기견 게시판 제목으로 검색");

            /* 종료 */
            System.out.println("9. 프로그램 종료");
            System.out.println("==============================");
            System.out.print("수행할 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                /* 조회 */
                case 1: dogBoardController.selectAllDogBoard(); break;

                /* 추가 */
                case 2: dogBoardController.registDogBoard(inputDogBoard()); break;

                /* 수정 */

                /* 삭제 */
                case 3: dogBoardController.deleteDogBoard(inputDogBoardCode()); break;

                /* 검색 */
//                case 4: dogBoardService.searchDogBoardName(inputSearchDogBoardName()); break;
                case 4: dogBoardController.searchDogBoardByName(); break;

                /* 종료 */
                case 9: System.out.println("유기견 게시판 관리 프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 관리 번호입니다."); break;
            }
        } while(true);

    }

    /* 조회 */
    /* 삭제 */
    private static Map<String, String> inputDogBoardCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("게시글 번호를 입력하세요 : ");
        String dogBoardNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogBoardNum", dogBoardNum);

        return parameter;
    }

    /* 추가 */
    private static Map<String, String> inputDogBoard() {
        Scanner sc = new Scanner(System.in);
        /* dogBoardNum,
           dogBoardName, dogBoardTxt, dogNum,
           //regionNum, managerNum */
        System.out.print("게시글 제목을 입력하세요 : ");
        String dogBoardName = sc.nextLine();
        System.out.print("게시글 내용을 입력하세요 : ");
        String dogBoardTxt = sc.nextLine();
        System.out.print("강아지 번호를 입력하세요 : ");
        String dogNum = sc.nextLine();
//        System.out.print("지역 번호를 입력하세요 : ");
//        String regionNum = sc.nextLine();
//        System.out.print("관리자번호를 입력하세요 : ");
//        String managerNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogBoardName", dogBoardName);
        parameter.put("dogBoardTxt", dogBoardTxt);
        parameter.put("dogNum", dogNum);
//        parameter.put("regionNum", regionNum);
//        parameter.put("managerNum", managerNum);

        return parameter;
    }

    /* 수정 */

    /* */

    /* 검색 */
//    private static SearchDogBoardName inputSearchDogBoardName() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("검색할 게시글의 제목을 입력하세요(단어 검색 가능) : ");
//        String value = sc.nextLine();
//
//        return new SearchDogBoardName(value);
//
//    }


}
