-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요.
-- 이때 결과는 시간대 순으로 정렬해야 합니다

WITH RECURSIVE cte AS (
    SELECT 0 AS num
    UNION ALL
    SELECT num + 1
    FROM cte
    WHERE num < 23
)

SELECT
    cte.num AS HOUR,
    IFNULL(a.입양횟수, 0) AS COUNT
FROM
    cte
LEFT JOIN (
    SELECT
        HOUR(DATETIME) AS 시간대,
        COUNT(*) AS 입양횟수
    FROM
        ANIMAL_OUTS
    GROUP BY
        시간대
    ORDER BY
        시간대
) a ON cte.num = a.시간대;
