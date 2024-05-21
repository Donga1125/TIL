-- 분화된 연도(YEAR), 분화된 연도별 대장균 크기의 편차(YEAR_DEV), 대장균 개체의 ID(ID) 를 출력하는 SQL 문을 작성해주세요.
-- 분화된 연도별 대장균 크기의 편차는 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기로 구하며 결과는 연도에 대해 오름차순으로 정렬하고 같은 연도에 대해서는 대장균 크기의 편차에 대해 오름차순으로 정렬해주세요.
-- date_format으로 변환하면 string형이되서 select결과는 맞는데 답은 틀리게 나옵니다. year쓰셔야합니다. --> 라고 함

WITH MaxColonySize AS (
    SELECT EXTRACT(YEAR FROM DIFFERENTIATION_DATE) AS YEAR,
           MAX(SIZE_OF_COLONY) AS MAX_COLONY_SIZE
      FROM ECOLI_DATA
     GROUP BY EXTRACT(YEAR FROM DIFFERENTIATION_DATE)
),
YearlyDeviation AS (
    SELECT E.ID,
           EXTRACT(YEAR FROM E.DIFFERENTIATION_DATE) AS YEAR,
           MC.MAX_COLONY_SIZE - E.SIZE_OF_COLONY AS YEAR_DEV
      FROM ECOLI_DATA E
           JOIN MaxColonySize MC
             ON EXTRACT(YEAR FROM E.DIFFERENTIATION_DATE) = MC.YEAR
),
FinalResult AS (
    SELECT YD.YEAR,
           YD.YEAR_DEV,
           YD.ID
      FROM YearlyDeviation YD
     ORDER BY YD.YEAR, YD.YEAR_DEV
)
SELECT *
  FROM FinalResult;
