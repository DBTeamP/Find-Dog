package com.dbteam.xml.volunteer;

import com.dbteam.common.dtopackage.UsersDTO;
import com.dbteam.xml.volunteer_person.VolPView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VolView {
    public static void volPage(){
        //권한에 따른 추가 삭제 제한 조정해야함
        //유저 고유 번호를 받아 값을 입력받아야함
        //userDTO 관련 지워서 로그인쪽이랑 다시 연동시켜야함
        Scanner sc = new Scanner(System.in);
        VolController volController = new VolController();
        VolPView volPView = new VolPView();

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
                case 5: volPView.volPPage(); break;
                case 6: volController.searchByUserNum(user.getUserNum()); break;
                case 7: return;

            }
        } while(true);
    }
    //
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

    private static Map<String, String> inputVolTxt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("봉사 제목을 입력하세요 : ");
        String volTxt = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("volTxt",volTxt);

        return parameter;
    }

    private static Map<String, String> inputVolNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("봉사 번호를 입력하세요 : ");
        String num = sc.nextLine();

        Map<String, String > parameter = new HashMap<>();
        parameter.put("num",num);

        return parameter;
    }

}
