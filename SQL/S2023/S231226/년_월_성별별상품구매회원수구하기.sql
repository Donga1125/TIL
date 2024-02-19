-- USER_INFO 테이블과 ONLINE_SALE 테이블에서 년, 월, 성별 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성해주세요.
-- 결과는 년, 월, 성별을 기준으로 오름차순 정렬해주세요. 이때, 성별 정보가 없는 경우 결과에서 제외해주세요.


SELECT
    EXTRACT(YEAR FROM o.SALES_DATE) AS YEAR,
    EXTRACT(MONTH FROM o.SALES_DATE) AS MONTH,
    u.GENDER,
    COUNT(DISTINCT o.USER_ID) AS USERS
FROM
    USER_INFO u
JOIN
    ONLINE_SALE o ON u.USER_ID = o.USER_ID
WHERE
    u.GENDER IS NOT NULL
GROUP BY
    YEAR,
    MONTH,
    u.GENDER
ORDER BY
    YEAR,
    MONTH,
    GENDER;
