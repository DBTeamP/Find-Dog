package com.dbteam.xml.finddog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FindDogController findDogController = new FindDogController();
        
        do{
            System.out.println("===== 강아지 찾기 =====");
            /* 조회 */   //System.out.println("조회");
            
            /* 추가 */
            System.out.println("1. 강아지 찾기 글 추가");
            
            /* 수정 */    //System.out.println("수정");
            
            /* 삭제 */
            System.out.println("2. 강아지 찾기 글 삭제");
            
            /* 종료 */
            System.out.println("9. 프로그램 종료");
            System.out.println("==============================");
            System.out.print("수행할 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                /* 조회 (select) */

                /* 추가 (insert) */
                case 1: findDogController.registFindDogBoard(inputFindDogBoard()); break;

                /* 수정 (update) */

                /* 삭제 (delete) */
                case 2: findDogController.deleteFindDogBoard(inputFindDogBoardCode()); break;

                /* 종료 */
                case 9: System.out.println("강아지 찾기 관리 프로그램을 종료합니다."); return;
                default: System.out.println("잘못된 관리 번호입니다."); break;
            }
            
        } while(true);
    }

    /* 조회 */
    /* 삭제*/
    private static Map<String, String> inputFindDogBoardCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("강아지 찾기 게시글 번호를 입력하세요 : ");
        String findNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("findNum", findNum);

        return parameter;
    }

    /* 추가 */
    private static Map<String, String> inputFindDogBoard(){
        Scanner sc = new Scanner(System.in);
        /*
            findNum
            , findName, findTxt, userNum, regionNum
         */
        System.out.print("강아지 찾기 게시글 제목을 입력하세요 : ");
        String findName = sc.nextLine();
        System.out.print("강아지 찾기 게시글 내용을 입력하세요 : ");
        String findTxt = sc.nextLine();
        System.out.print("강아지 찾기 유저번호를 입력하세요 : ");
        String userNum = sc.nextLine();
        System.out.print("강아지 찾기 지역번호를 입력하세요 : ");
        String regionNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("findName", findName);
        parameter.put("findTxt", findTxt);
        parameter.put("userNum", userNum);
        parameter.put("regionNum", regionNum);

        return parameter;
    }

    /* 수정 */


}
