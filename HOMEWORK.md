# 2022-02-09 HOMEWORK
- url design 공부하고 포스팅하기 (참고 : https://bcho.tistory.com/914)
- mysql study
  - 같은 쿼리를 짜도 누가 짜느냐에 따라 성능이 굉장히 차이가 남.
  - 누구는 60초 걸리고, 누구는 0.00001초 걸리고. -> 이 차이를 만드는 사람이 보통 연봉 1.2억 -> DBA -> 돈 많은 대기업에만 있음.
  - -> 중소기업에선 서버개발자가 다한다. 
  - 조회 select
  - 추가 insert 
  - 수정 update
  - 삭제 delete 
  - mysql 설치 
  - root 계정으로  로그인 (CUI환경)
  - http://www.tcpschool.com/mysql/mysql_basic_select 의 7단원까지 스터디 포스팅
  - ORM 무시 개무시 
- TODO: index 재정렬

===========
2022.02.16
varchar - 가변 / varchar(100) / 길이가 10 짜리 문자열을 저장하면 ? 나머지 90을 비워둬요. 무조건 100이하 / 그러면 가변이니까 110을 저장하면 ? 초과된 10은 잘려요.
char - 고정  / char(100) / 길이가 10 짜리 문자열을 저장하면 ? 나머지 90을 채워요. 무조건 100
**varchar / char 차이를 스터디하고 포스팅 해주세요.**
1. 조회 select
2. 추가 insert
3. 수정 update
4. 삭제 delete
=> 이 기능들을 서버에 적용하기!
.properties 파일 말고 ! .yml or .yaml 파일을 사용해보세요! 
https://limjunho.github.io/2021/08/11/spring-mysql.html

================
2022.02.23
1. application/json 을 사용한 통신 개발
2. github에 이 프로젝트를 푸시하고, url을 저한테 전달해주세요. 
   1. branch 전략화 
      1. main(=master) / develop / feature
   
