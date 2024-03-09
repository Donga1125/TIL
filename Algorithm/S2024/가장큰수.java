package Algorithm.S2024;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static String solution(int[] numbers) {
        // 숫자들을 문자열로 변환하여 비교하기 위해 문자열 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 비교 규칙에 따라 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 두 숫자를 합쳤을 때의 결과를 비교하여 큰 숫자가 먼저 오도록 정렬
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        // 0이 여러 개일 경우 예외 처리
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 정렬된 숫자를 이어붙여서 결과 생성
        StringBuilder answer = new StringBuilder();
        for (String num : strNumbers) {
            answer.append(num);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        System.out.println(solution(numbers1));

        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers2));
    }
}
