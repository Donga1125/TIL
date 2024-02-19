-- MEMBER_PROFILE와 REST_REVIEW 테이블에서 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회하는 SQL문을 작성해주세요.
-- 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력되도록 작성해주시고, 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬해주세요.

SELECT
    mp.MEMBER_NAME,
    rr.REVIEW_TEXT,
    DATE_FORMAT(rr.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM
    MEMBER_PROFILE mp
JOIN
    REST_REVIEW rr ON mp.MEMBER_ID = rr.MEMBER_ID
JOIN (
    SELECT
        MEMBER_ID
    FROM
        REST_REVIEW
    GROUP BY
        MEMBER_ID
    ORDER BY
        COUNT(*) DESC
    LIMIT 1
) AS top_reviewers ON rr.MEMBER_ID = top_reviewers.MEMBER_ID
ORDER BY
    rr.REVIEW_DATE,
    rr.REVIEW_TEXT;
