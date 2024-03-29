## Section 102. SQL - DDL

**DDL (Data Define Language : 데이터 정의어)**

- DDL은 DB를 구축하거나 수정할 목적으로 사용하는 언어
- 번역한 결과가 데이터 사전(Data Dictionary)에 특별한 파일에 여러 개의 테이블로 저장된다.
- DDL의 유형
  - **CREATE :** SCEMA, DOMAIN, TABLE, VIEW, INDEX를 정의함.
    - CREATE TABLE 학생 (이름 VARCHAR(15) NOT NULL, 학번 CHAR(8), 생년월일 DATE, PRIMARY KEY(학번), FOREIGN KEY(전공) REFERENCES 학과(학과코드)  ON UPDATE CASCADE, CONSTRAINT 생년월일제약 CHECK(생년월일≥’1980-01-01’));
  - **ALTER :** TABLE에 대한 정의를 변경하는 데 사용함.
    - ALTER TABLE 테이블명 ADD 속성명 데이터타입 [DEFAULT’기본값’];
    - ADD - 새로운 속성(열)을 추가할 때 사용, ALTER - 특정 속성의 Default 값을 변경할 때 사용,
      DROP COLUMN - 특정 속성을 삭제할 때 사용
  - **DROP :**  SCEMA, DOMAIN, TABLE, VIEW, INDEX를 삭제함.
    - DROP TABLE 학생 CASCADE;

## Section 103. SQL - DCL

**DCL (Data Control language : 데이터 제어어)**

- 데이터의 보안, 무결성, 회복, 병행 제어 등을 정의하는 데 사용하는 언어
- DCL은 데이터베이스 관리자(DBA)가 데이터 관리를 목적으로 사용한다.
- DCL의 종류
  - COMMIT : 명령에 의해 수행된 결과를 실제 물리적 디스크로 저장하고, 데이터베이스 조작 작업이 정상적으로 완료되었음을 관리자에게 알려줌
  - ROLLBACK : 데이터베이스 조작 작업이 비정상적으로 종료되었을 때 원래의 상태로 복구함.
  - GRANT : 데이터베이스 사용자에게 사용 권한을 부여함.
    - GRANT RESOURCE TO 정동아;
  - REVOKE : 데이터베이스 사용자의 사용 권한을 취소함.
- COMMIT : 트랜잭션 처리가 정상적으로 완료된 후 트랜잭션이 수행한 내용을 데이터베이스에 반영하는 명령어
- ROLLBACK : 변경되었으나 아직 COMMIT 되지 않은 모든 내용들을 취소하고 데이터베이스를 이전 상태로 되돌리는 명령어
  - ROLLBACK TO P1;

## Section 104 ~ 106. SQL - DML

**DML (Data Manipulation Language : 데이터 조작어)**

- 데이터베이스 사용자가 저장된 데이터를 실질적으로 관리하는데 사용되는 언어
- 데이터베이스 사용자와 데이터베이스 관리 시스템 간의 인터페이스를 제공한다.
- DML의 유형
  - SELECT : 테이블에서 튜플을 검색함
  - INSERT : 테이블에 새로운 튜플을 삽입함
    - INSERT INTO 테이블명(속성명1, 속성명2) VALUES (데이터1, 데이터2…);
  - DELETE : 테이블에서 튜플을 삭제함
    - DELETE FROM 테이블명 WHERE 조건;
    - 모든 레코드를 삭제할 때는 WHERE 절 생략
  - UPDATE : 테이블에서 튜플의 내용을 갱신함
    - UPDATE 테이블명 SET 속성명 = 데이터 WHERE 조건;

## Section 107. DML - JOIN

- JOIN 은 2개의 릴레이션에서 연관된 튜플들을 결합하여, 하나의 새로운 릴레이션을 반환한다.
- JOIN은 일반적으로 FROM 절에 기술하지만, 릴레이션이 사용되는 곳 어디에나 사용 가능하다.
- INNER JOIN
  - 조건이 없는 INNER JOIN을 수행하면 CROSS JOIN 과 동일한 결과를 얻을 수 있다.
  - EQUI JOIN 과 NON-EQUI JOIN으로 구분된다.
    - EQUI JOIN
      - JOIN 대상 테이블에서 공통 속성을 기준으로 = 비교에 의해 같은 값을 가지는 행을 연결하여 결과를 생성하는 JOIN 방법
      - JOIN 조건이 = 일때 동일한 속성이 두 번 나타나게 되는데, 이 중 중복된 속성을 제거하여 같은 속성을 한 번만 표기하는 방법을 NATURAL JOIN 이라고 한다.
      - EQUI JOIN에서 연결 고리가 되는 공통 속성을 JOIN 속성이라고 한다.
    - NON-EQUI JOIN
      - JOIN 조건에 = 가 아닌 나머지 비교 연산자 (>, <, <>, ≥, ≤)를 사용하는 방법이다.
- OUTER JOIN
  - 릴레이션에서 JOIN 조건에 만족하지 않는 튜플도 결과로 출력하기 위한 JOIN 방법으로, LEFT OUTER JOIN, RIGHT OUTER JOIN, FULL OUTER JOIN 이 있다.
    - LEFT OUTER JOIN : INNER JOIN 결과를 구한 후, 우측 항 릴레이션의 어떤 튜플과도 맞지 않는 좌측 항의 릴레이션에 있는 튜플들에 NULL 값을 붙여서 INNER JOIN의 결과에 추가한다.
    - RIGHT OUTER JOIN : INNER JOIN의 결과를 구한 후, 좌측 항 릴레이션의 어떤 튜플과도 맞지 않는 우측 항의 릴레이션에 있는 튜플들에 NULL 값을 붙여서 INNER JOIN의 결과에 추가한다.
    - FULL OUTER JOIN : LEFT OUTER JOIN + RIGHT OUTER JOIN. INNER JOIN 의 결과를 구한 후, 좌측 항의 릴레이션의 튜플들에 대해 우측 항의 릴레이션의 어떤 튜블과도 맞지 않는 튜플들에 NULL 값을 붙여서 INNER JOIN의 결과에 추가한다. 그리고 유사하게 우측 항의 릴레이션의 튜플들에 대해 좌측 항의 릴레이션의 어떤 튜플과도 맞지 않는 튜플들에 대해 NULL 값을 붙여서 INNER JOIN의 결과에 추가한다.

## Section 108. 트리거 Trigger

- Trigger 는 데이터베이스 시스템에서 데이터의 삽입, 갱신, 삭제 등의 이벤트가 발생할 때 관련 작업이 자동으로 수행되게 하는 절차형 SQL 이다.
- 트리거는 데이터베이스에 저장되며, 데이터 변경 및 무결성 유지, 로그 메시지 출력 등의 목적으로 사용된다.
- 트리거의 구문에는 DCL을 사용할 수 없으며, DCL이 포함된 프로시저나 함수를 호출하는 경우에도 오류가 발생한다.