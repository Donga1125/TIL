-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서
-- 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.

WITH AvailableCars AS (
    SELECT
        CRCC.CAR_ID,
        CRCC.CAR_TYPE,
        CRCC.DAILY_FEE
    FROM
        CAR_RENTAL_COMPANY_CAR CRCC
    WHERE
        CRCC.CAR_TYPE IN ('세단', 'SUV')
        AND CRCC.CAR_ID NOT IN (
            SELECT DISTINCT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE END_DATE >= '2022-11-01'
        )
), DiscountedCars AS (
    SELECT
        AC.CAR_ID,
        AC.CAR_TYPE,
        AC.DAILY_FEE,
        COALESCE(CRCDP.DISCOUNT_RATE, 0) AS DISCOUNT_RATE
    FROM
        AvailableCars AC
        LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN CRCDP ON AC.CAR_TYPE = CRCDP.CAR_TYPE
            AND CRCDP.DURATION_TYPE = '30일 이상'
)

SELECT
    DC.CAR_ID,
    DC.CAR_TYPE,
    ROUND(DC.DAILY_FEE * (1 - DC.DISCOUNT_RATE / 100) * 30) AS FEE
FROM
    DiscountedCars DC
WHERE
    ROUND(DC.DAILY_FEE * (1 - DC.DISCOUNT_RATE / 100) * 30) BETWEEN 500000 AND 2000000
ORDER BY
    FEE DESC,
    DC.CAR_TYPE ASC,
    DC.CAR_ID DESC;
