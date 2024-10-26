package Algorithm.S2024.M10;

import java.util.Arrays;

public class 연속된부분수열의합 {
    public static void main (String[] args){
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 2, 2, 2, 2}, 6)));
    }

    public static int[] solution(int[] sequence, int k) {
        int start = 0, end = 0;
        int sum = sequence[0];
        int minLength = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (end < sequence.length) {
            if (sum == k) {
                // 현재 부분 수열의 길이
                int length = end - start + 1;
                // 조건에 맞는지 확인하고 갱신
                if (length < minLength) {
                    minLength = length;
                    answer[0] = start;
                    answer[1] = end;
                }
                // 다음 후보를 위해 sum을 줄이고 start를 이동
                sum -= sequence[start];
                start++;
            } else if (sum < k) {
                // sum이 k보다 작으면 end를 늘려서 부분합을 증가
                end++;
                if (end < sequence.length) sum += sequence[end];
            } else {
                // sum이 k보다 크면 start를 늘려서 부분합을 감소
                sum -= sequence[start];
                start++;
            }
        }
        return answer;
    }
}
