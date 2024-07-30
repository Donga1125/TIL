package Algorithm.S2024.M07;

import java.util.Arrays;

public class n2배열자르기 {
    public static void main (String[] args){
        System.out.println(Arrays.toString(solution(3,2,5)));
        System.out.println(Arrays.toString(solution(4,7,14)));
    }

    public static int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            long index = left + i;
            int row = (int) (index / n);
            int col = (int) (index % n);
            answer[i] = Math.max(row, col) + 1;
        }

        return answer;
    }
}
