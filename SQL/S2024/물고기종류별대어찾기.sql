-- 물고기 종류 별로 가장 큰 물고기의 ID, 물고기 이름, 길이를 출력하는 SQL 문을 작성해주세요.
-- 물고기의 ID 컬럼명은 ID, 이름 컬럼명은 FISH_NAME, 길이 컬럼명은 LENGTH로 해주세요.
-- 결과는 물고기의 ID에 대해 오름차순 정렬해주세요.
-- 단, 물고기 종류별 가장 큰 물고기는 1마리만 있으며 10cm 이하의 물고기가 가장 큰 경우는 없습니다.
SELECT
    F.ID AS ID,
    FN.FISH_NAME AS FISH_NAME,
    F.LENGTH AS LENGTH
FROM
    (SELECT
        FI.FISH_TYPE,
        MAX(FI.LENGTH) AS MAX_LENGTH
    FROM
        FISH_INFO FI
    WHERE
        FI.LENGTH > 10
    GROUP BY
        FI.FISH_TYPE) AS MAX_FISH
JOIN FISH_INFO F ON MAX_FISH.FISH_TYPE = F.FISH_TYPE AND MAX_FISH.MAX_LENGTH = F.LENGTH
JOIN FISH_NAME_INFO FN ON F.FISH_TYPE = FN.FISH_TYPE
ORDER BY
    F.ID;