package Algorithm.S2024;
import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int result = solution(citations);
        System.out.println("H-Index: " + result);
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations); // 배열을 오름차순으로 정렬

        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            int citationCount = citations.length - i; // 현재 논문의 인용 횟수 이상을 인용한 논문의 수
            if (citations[i] >= citationCount) { // 현재 논문의 인용 횟수가 이상일 경우
                hIndex = citationCount; // H-Index 업데이트
                break; // H-Index가 최대값이므로 반복 종료
            }
        }

        return hIndex;
    }
}