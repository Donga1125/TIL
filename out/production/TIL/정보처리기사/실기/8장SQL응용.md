## Section 102. SQL - DDL

1. DDL (Data Define Language : 데이터 정의어)
- DDL 은 DB를 구축하거나 수정할 목적으로 사용하는 언어
- 번역한 결과가 데이터 사전(Data Dictionary)에 특별한 파일에 여러 개의 테이블로 저장된다.
- DDL 유형
    - CREATE : SCEMA, DOMAIN, TABLE, VIEW, INDEX를 정의함.
    - ALTER : TABLE에 대한 정의를 변경하는 데 사용함.
    - DROP :  SCEMA, DOMAIN, TABLE, VIEW, INDEX를 삭제함.


## Section 103. SQL - DCL

- 데이터의 보안, 무결성, 회복, 병행 제어 등을 정의하는 데 사용하는 언어
- DCL은 데이터베이스 관리자(DBA)가 데이터 관리를 목적으로 사용한다.
- DCL 종류
  - COMMIT : 명령에 의해 수행된 결과를 실제 물리적 디스크로 저장하고, 데이터베이스 조작 작업이 정상적으로 완료되었음을 관리자에게 알려줌
  - ROLLBACK : 데이터베이스 조작 작업이 비정상적으로 종료되었을 때 원래의 상태로 복구함.
  - GRANT : 데이터베이스 사용자에게 사용 권한을 부여함.
  - REVOKE : 데이터베이스 사용자의 사용 권한을 취소함.