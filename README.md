# FindDog project

 # -Program Logo-
  ![image](https://github.com/DBTeamP/DBProject/assets/129252557/0631f090-892e-4e4d-856a-2279dc5a8b9f)


## 프로젝트 주제 : 유기견관련 활동들을 관리하는 프로그램

## 1. 프로그램 기획

 ### 프로젝트 소개
  - 유기견을 보호하고 입양을 장려하는데 도움을 주는 프로그램.  
  - 사용자들이 보다 쉽게 정보를 얻고 소통할 수 있는 플랫폼을 제공하여 유기견에 대한 인식을 높인다.  
  - 유기견을 위한 보다 나은 환경을 조성하고, 많은 사람들이 유기견에 대한 관심을 가질 수 도록 도움을 준다.
 ### 프로젝트 선정 이유
 -  현재 사회 유기견 문제의 심각성 인식.
 -  많은 사람들이 유기견에 관한 구조,입양,봉사 등 이런 많은 활동을 접할 수 있는 게시판을 만들자 함.

 ### 팀원 소개
 
  |팀원이름|구현기능|역할|깃허브ID|
  |----|-----|-----|-----|
  |이재혁| DB 테이블 작성 , 봉사 페이지 옵션 구현  |팀장|[@ohdyo](https://github.com/ohdyo) |
  |오송은| 회원가입, 로그인 기능, 강아지 찾기 게시판 관리 |팀원|[@ddoddo1228](https://github.com/ddoddo1228)|
  |박세연| 강아지 찾기 게시판 관리,유기견 프로필 관리,유기견 게시판 관리 |팀원|[@se-3-yeon](https://github.com/se-3-yeon)|
  |박예나| 입양일지 관리 |팀원|[@a75372656](https://github.com/a75372656)|
  |진윤재| 봉사활동 게시판 관리,  각 봉사활동 신청 인원 수 체크|팀원|[@Realyunjae](https://github.com/Realyunjae)|

## 2.채택한 개발 기술과 브랜치 전략

  ##   개발 환경
- ### 1.프로그래밍 언어 및 프레임워크:
-  Java를 기반으로 MyBatis Framework를 활용하여 데이터베이스와의 상호작용을 관리.
- ### 2. 개발 도구
  - JDK 버전: JDK 17을 사용하여 Java 애플리케이션을 개발.
  - 빌드 도구: Gradle을 사용하여 프로젝트의 의존성 관리 및 빌드 과정을 자동화.

- ### 버전 및 이슈관리
  -  Github, Github Issues, Github Project
- ### 협업 툴
  - Discord, Notion, Github
  - <img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">
  - <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">
  - <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">


##   개발 방향
- 유기견 관련 활동들을 관리하는 프로그램인 "FindDog"은 유기견 보호 및 입양을 장려하고,
-  이에 대한 인식을 높이며, 유기견에 대한 관심을 유도하는 것을 목표로 합니다. 이를 위해 다음과 같은 개발 방향을 설정했습니다.
### 1.
### 2.정보의 접근성 향상
-  유기견에 관한 다양한 정보(보호, 입양, 봉사활동 등)를 쉽게 찾고 접근할 수 있도록 합니다.
### 3.커뮤니티 기능 강화
- 사용자 간의 소통을 장려하기 위한 커뮤니티 기능(게시판, 댓글, 메시지 등)을 강화합니다. 






## 브랜치전략
- 각자 맡은 기능에따라 브랜치를 생성하여
- 브랜치명은 feature/기능/(자기 깃허브 닉네임)
- feature/ : 기능단위로 독립적인 개발환경을 위해 사용.



## 3. 프로젝트 구조
 ### 흐름도 
  ![Untitled (2)](https://github.com/DBTeamP/DBProject/assets/82174047/d564d863-299a-4d79-86d2-120bfa6ac486)

 ### 논리 ERD
  ![Untitled](https://github.com/DBTeamP/DBProject/assets/129252557/e212de3f-3da1-4a47-909b-db8e3b45eaea)
 ### 물리 ERD
   ![Untitled (1)](https://github.com/DBTeamP/DBProject/assets/129252557/3c5fc3a0-03eb-4967-b486-35d4f1ea839a)
   
## 4. 프로그램 기능 및 동작 방식
#### 1.회원 관리 기능
-
#### 2.유기견 등록 및 관리
-
#### 3.입양 게시판
-
#### 4.유기견 봉사활동 관리
-
#### 5. 잃어버린 강아지 추가 및 검색
- 


## 5. 작업 관리
### 역할분담

#### 팀장 이재혁
- DB테이블 작성
- 4,5번 보호센터 봉사활동-봉사 페이지 구현
#### 팀원 오송은
- 유저, 관리자 추가, 회원가입, 로그인 기능
- 미아견 추가, 검색, 잃어버린 강아지 찾기 게시판 관리

#### 팀원 박세연
- 유기견 게시판 관리
- 유기견 프로필 관리
- 강아지 찾기 추가,삭제,검색기능
#### 팀원 박예나
- 입양일지 조회, 추가, 삭제기능 
#### 팀원 진윤재
- 보호센터 봉사활동  추가 삭제 기능
-  봉사 신청 인원수 조회

###  작업관리

- GitHub issue, 학교에서 진행상황 공유
- 격일로 여는 짧은 회의를 통해 notion 에 회의내용을 기록함.
- notion 에 역할 분담, ERD, 물리 ERD 공유
- 매일 학교에서 짧은 회의를 통해 notion 에 회의내용을 기록함.
  
### 개발 기간
-  개발 기간 : 2024-04-09 ~ 2024-04-15
  
## 6.프로젝트 후기

#### 팀장 이재혁

#### 팀원 오송은

#### 팀원 박세연

#### 팀원 박예나

#### 팀원 진윤재



