package com.dbteam.xml.dogboard;

import com.dbteam.xml.dog.DogController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DogBoardView {

    public static void pageDogBoard(){
        Scanner sc = new Scanner(System.in);
        DogBoardController dogBoardController = new DogBoardController();

        do{
            System.out.println("======= DOG BOARD =======");
            System.out.println("1. 유기견 게시판 보러가기");
            System.out.println("2. 유기견 게시판 내용 추가하기");
            System.out.println("3. 유기견 게시판 내용 삭제하기");
            System.out.println("4. 유기견 제목으로 검색하기");
            System.out.println("5. 이전 페이지로 이동");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1: dogBoardController.selectAllDogBoard(); break;
                case 2: dogBoardController.registDogBoard(inputDogBoard()); break;
                case 3: dogBoardController.deleteDogBoard(inputDogBoardCode()); break;
                case 4: dogBoardController.searchDogBoardByName(); break;
                case 5: return;

            }
        }while(true);
    }

    //
    /* ========== DOGBOARD ========== */
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
           dogBoardName, dogBoardTxt, dogNum */
        System.out.print("게시글 제목을 입력하세요 : ");
        String dogBoardName = sc.nextLine();
        System.out.print("게시글 내용을 입력하세요 : ");
        String dogBoardTxt = sc.nextLine();
        System.out.print("강아지 번호를 입력하세요 : ");
        String dogNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("dogBoardName", dogBoardName);
        parameter.put("dogBoardTxt", dogBoardTxt);
        parameter.put("dogNum", dogNum);

        return parameter;
    }


}
