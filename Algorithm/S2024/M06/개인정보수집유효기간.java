package Algorithm.S2024.M06;

import java.util.*;

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        //모든 달은 28일까지 있다고 가정
        String today = "2022.05.19";
        String [] terms = {"A 6", "B 12", "C 3"};
        String [] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(solution(today,terms,privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int todayDate = convertDate(today);
        List<Integer> result = new ArrayList<>();

        //약관 별 유효기간 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms){
            String[] parts = term.split(" ");
            String termType = parts[0];
            int termMonth = Integer.parseInt(parts[1]);
            termMap.put(termType, termMonth);
        }

        //개인정보 수집 일자와 날짜를 처리
        for (int i =0; i< privacies.length; i++){
            String [] parts = privacies[i].split(" ");
            String privacyDate = parts[0];
            String privacyTerm = parts[1];

            int privacyDays = convertDate(privacyDate);
            int termMonths = termMap.get(privacyTerm);
            int expiryDate = addMonth(privacyDays, termMonths);


            //만료일이 오늘보다 이전인지 확인
            if (expiryDate <= todayDate) {
                result.add(i + 1);
            }


        }

        // 결과를 배열로 변환하여 반환
        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();
        return resultArray;
    }

    private static int convertDate (String date){
        String [] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return year*12*28 + month*28 + day;
    }

    private static int addMonth (int days, int months){
        return days+ months*28 ;
    }

}
