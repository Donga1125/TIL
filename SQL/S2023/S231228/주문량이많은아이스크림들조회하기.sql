-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.

SELECT FLAVOR
FROM (
    SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_SUM
    FROM (
        SELECT FLAVOR, TOTAL_ORDER
        FROM FIRST_HALF
        UNION ALL
        SELECT FLAVOR, TOTAL_ORDER
        FROM JULY
    ) AS combined
    GROUP BY FLAVOR
) AS flavor_totals
ORDER BY TOTAL_SUM DESC
LIMIT 3;
