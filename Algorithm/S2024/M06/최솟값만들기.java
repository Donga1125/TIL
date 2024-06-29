package Algorithm.S2024.M06;

import java.util.Arrays;

public class 최솟값만들기 {

    public static void main (String[] args){

        int[] A = {1, 4, 2};
        int [] B = {5, 4, 4};
        System.out.println(solution(A, B));

    }
    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }
        
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}
