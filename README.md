# [스터디 과제] URL Parsing 후 Data 가공하기

* URL을 Request에 담아서 전달하면 해당 URL 안에 있는 모든 HTML 소스를 긁어온다.
  * 어떤 URL이든 상관 없다.
  * ex) 
    * request: setUrl("https://www.naver.com")
    * response: "<Title>NAVER</Title> ..." 등

* 노출 유형
  * 노출 유형 Type에 따라 결과를 출력한다.
  * HTML 태그 제외 Type은 모든 HTML 태그를 제거한다.
  * TEXT 전체 출력 Type인 HTML 태그를 포함한 모든 Text를 출력한다.

* 영어, 숫자만 출력
  * 결과 데이터는 영어와 숫자로만 구성된 데이터만 출력

* 오름차순 정렬
  * ex) 영어: AaBbCcDd ...Zz
  * ex) 숫자: 012345678
  
* 교차 출력
  * 출력 순서는 영어숫자영어숫자로 영어가 먼저 출력
  * 더 이상 출력할 수 있는 문자가 없을 경우 정렬된 남은 문자열 그대로 출력  
  
* 출력 묶음 단위
  * 사용자가 입력한 자연수의 묶음 단위를 기준으로 몫과 나머지를 구하여 노출
  * ex) 'A0a1B2b3' 묶음 단위 3인 경우
    * 몫: 'A0a1B2'
    * 나머지: 'b3'


# 과제 중점

* git issue로 등록하여 issue별로 commit하기
* 기능별로 테스트코드 작성
* 노출 유형이 추가되는 경우를 생각하기 (요구사항 추가)
* 라이브러리 선택 이유 정리하기
* Swagger로 테스트
* 스프링 DI 방법, @Transactional 활용 등



  
