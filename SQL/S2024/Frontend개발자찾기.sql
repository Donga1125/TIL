-- DEVELOPERS 테이블에서 Front End 스킬을 가진 개발자의 정보를 조회하려 합니다.
-- 조건에 맞는 개발자의 ID, 이메일, 이름, 성을 조회하는 SQL 문을 작성해 주세요.
-- 결과는 ID를 기준으로 오름차순 정렬해 주세요.

SELECT DISTINCT
    D.ID,
    D.EMAIL,
    D.FIRST_NAME,
    D.LAST_NAME
FROM
    DEVELOPERS D
-- DEVELOPERS 테이블과 SKILLCODES 테이블을 JOIN하여 프론트 개발자 검색
JOIN
    SKILLCODES S
ON
    -- 개발자 스킬과 SKILLCODES 테이블의 코드를 비트 연산하여 프론트개발자를 확인
    (D.SKILL_CODE & S.CODE) != 0
-- SKILLCODES 테이블의 카테고리가 프론트인 것만 선택
WHERE
    S.CATEGORY = 'Front End'
-- ID를 기준으로 오름차순 정렬
ORDER BY
    D.ID ASC;
