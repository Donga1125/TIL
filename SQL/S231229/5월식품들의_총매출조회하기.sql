-- FOOD_PRODUCT와 FOOD_ORDER 테이블에서 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요.
--  이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬해주세요.


WITH MonthlySales AS (
    SELECT
        FP.PRODUCT_ID,
        FP.PRODUCT_NAME,
        SUM(FP.PRICE * FO.AMOUNT) AS TOTAL_SALES
    FROM
        FOOD_PRODUCT FP
        JOIN FOOD_ORDER FO ON FP.PRODUCT_ID = FO.PRODUCT_ID
    WHERE
        EXTRACT(YEAR_MONTH FROM FO.PRODUCE_DATE) = '202205'
    GROUP BY
        FP.PRODUCT_ID, FP.PRODUCT_NAME
)

SELECT
    MS.PRODUCT_ID,
    MS.PRODUCT_NAME,
    MS.TOTAL_SALES
FROM
    MonthlySales MS
ORDER BY
    MS.TOTAL_SALES DESC,
    MS.PRODUCT_ID ASC;
