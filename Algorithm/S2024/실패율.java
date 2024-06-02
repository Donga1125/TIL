package Algorithm.S2024;
import java.util.*;

public class 실패율 {

    public static void main (String [] args){
        System.out.println(solution(5,new int []{2, 1, 2, 6, 2, 4, 3, 3}));
    }
    public static int[] solution(int N, int[] stages) {
        // 각 스테이지에 도달한 사용자 수와 클리어하지 못한 사용자 수를 저장할 배열
        int[] reached = new int[N + 2];
        int[] notCleared = new int[N + 2];

        // 각 스테이지에 도달한 사용자 수와 클리어하지 못한 사용자 수를 계산
        for (int stage : stages) {
            reached[stage]++;
            if (stage <= N) {
                notCleared[stage]++;
            }
        }

        // 각 스테이지에 도달한 누적 사용자 수를 계산
        int totalUsers = stages.length;
        for (int i = 1; i <= N; i++) {
            int temp = reached[i];
            reached[i] = totalUsers;
            totalUsers -= temp;
        }

        // 실패율 계산 및 저장
        double[] failureRates = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            if (reached[i] == 0) {
                failureRates[i] = 0;
            } else {
                failureRates[i] = (double) notCleared[i] / reached[i];
            }
        }

        // 실패율을 기준으로 스테이지 번호를 정렬
        Integer[] stageNumbers = new Integer[N];
        for (int i = 0; i < N; i++) {
            stageNumbers[i] = i + 1;
        }

        Arrays.sort(stageNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (failureRates[a] == failureRates[b]) {
                    return a - b;
                } else {
                    return Double.compare(failureRates[b], failureRates[a]);
                }
            }
        });

        // 결과 배열로 변환
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageNumbers[i];
        }

        return answer;
    }
}
