package Algorithm.S2024.M10;

import java.util.Arrays;

public class 두개이하로다른비트 {
    public static void main (String [] args){
        System.out.println(Arrays.toString(solution(new long[]{2,7})));

    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long number = numbers[i];

            if (number % 2 == 0) {
                // 짝수일 때는 무조건 +1
                answer[i] = number + 1;
            } else {
                // 홀수일 때는 가장 낮은 0을 찾아서 비트를 바꿈
                long lowestZero = (number + 1) & ~number;
                answer[i] = number + (lowestZero / 2);
            }
        }

        return answer;
    }

}
