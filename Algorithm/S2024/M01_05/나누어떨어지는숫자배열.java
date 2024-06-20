package Algorithm.S2024.M01_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main (String[]args){
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> divisibleNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                divisibleNumbers.add(num);
            }
        }

        if (divisibleNumbers.isEmpty()) {
            return new int[]{-1};
        } else {
            // ArrayList를 배열로 변환하고 오름차순으로 정렬
            int[] result = divisibleNumbers.stream().mapToInt(i -> i).toArray();
            Arrays.sort(result);
            return result;
        }
    }
}
