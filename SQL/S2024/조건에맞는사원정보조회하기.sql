-- HR_DEPARTMENT, HR_EMPLOYEES, HR_GRADE 테이블에서 2022년도 한해 평가 점수가 가장 높은 사원 정보를 조회하려 합니다.
-- 2022년도 평가 점수가 가장 높은 사원들의 점수, 사번, 성명, 직책, 이메일을 조회하는 SQL문을 작성해주세요.
-- 2022년도의 평가 점수는 상,하반기 점수의 합을 의미하고, 평가 점수를 나타내는 컬럼의 이름은 SCORE로 해주세요.
SELECT
    MAX(total_score) AS SCORE,
    emp.EMP_NO,
    emp.EMP_NAME,
    emp.POSITION,
    emp.EMAIL
FROM
    (SELECT
        SUM(grd.SCORE) AS total_score, --각 사원 평가점수 합계 계산
        emp.EMP_NO --사번 선택
    FROM
        HR_GRADE grd
    JOIN
        HR_EMPLOYEES emp ON grd.EMP_NO = emp.EMP_NO
    WHERE
        grd.YEAR = 2022
    GROUP BY
        emp.EMP_NO) AS total_scores --각 사원의 평가 점수 합계를 포함하는 임시테이블 생성
JOIN
    HR_EMPLOYEES emp ON total_scores.EMP_NO = emp.EMP_NO
GROUP BY
    emp.EMP_NO, emp.EMP_NAME, emp.POSITION, emp.EMAIL
ORDER BY
    SCORE DESC
LIMIT 1;
