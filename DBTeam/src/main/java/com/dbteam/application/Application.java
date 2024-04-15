package com.dbteam.application;

import com.dbteam.xml.login.LogInController;
import com.dbteam.xml.login.LoginView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        welComeDog();
    }

    private static void welComeDog() {
        Scanner sc = new Scanner(System.in);
        LogInController logInController = new LogInController(); // LogInController 객체 생성
        LoginView loginView = new LoginView();

        do {
            System.out.println("====== FINDING DOG =======");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 종료");
            System.out.print("번호를 입력해주세요 : ");

            int no = sc.nextInt();
            switch (no) {
                case 1:
                    logInController.registId(loginView.insertUser());
                    break;
                case 2:
                    loginView.logInPage();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
