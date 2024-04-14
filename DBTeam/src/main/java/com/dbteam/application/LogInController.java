package com.dbteam.application;

import com.dbteam.common.dtopackage.UsersDTO;
import com.dbteam.xml.login.LoginMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

import static com.dbteam.application.testRun.pageAdminMain;
import static com.dbteam.application.testRun.pageUserMain;
import static com.dbteam.common.Template.getSqlSession;

public class LogInController {

    private final LogInService logInService;
    private final PrintResult printResult;

    public LogInController(){
        logInService = new LogInService();
        printResult = new PrintResult();
    }

    // 회원가입 메서드
    public void registId(Map<String, String> parameter) {
        String userName = parameter.get("userName");
        String userId = parameter.get("userId");
        String userPhone = parameter.get("userPhone");
        int regionNum = Integer.parseInt(parameter.get("regionNum"));

        // 아이디가 이미 존재하는지 확인
        if (logInService.isUserIdExists(userId)) {
            // 이미 존재하는 아이디일 경우, 오류 메시지 출력
            System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 입력해주세요.");
        } else {
            // 아이디가 존재하지 않을 경우, 회원가입 진행
            UsersDTO users = new UsersDTO();
            users.setUserName(userName);
            users.setUserId(userId);
            users.setUserPhone(userPhone);
            users.setRegionNum(regionNum);

            if (logInService.insertUser(users)) {
                printResult.printSuccessMessage("insert");
            }
        }
    }
    public void logIn(Map<String, String> parameter) {
        String userId = parameter.get("userId");

        // 아이디와 비밀번호를 확인하여 로그인 처리
        if (logInService.checkCredentials(userId)) {
            // 로그인 성공 시 처리
            printResult.printSuccessMessage("login");

            // adminRights 값에 따라 페이지 이동
            if (logInService.isAdminUser(userId)) {
                pageAdminMain();
            } else {
                pageUserMain();
            }
        } else {
            // 로그인 실패 시 처리
            System.out.println("아이디 또는 비밀번호가 올바르지 않습니다. 다시 시도해주세요.");
        }
    }


}