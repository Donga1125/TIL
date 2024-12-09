package Algorithm.S2024.M12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 줄서는방법 {
    public static void main (String [] args){
        System.out.println(Arrays.toString(solution(3,5)));

    }
    public static int[] solution(int n, long k) {
        int[] answer = new int[n];
        //1부터 n까지 사용할 숫자 리스트
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        //k를 0-based 변환
        k--;
        //팩토리얼 계산
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        //순열 계산
        for (int i = 0; i < n; i++) {
            //현재 자리에 사용할 그룹크기
            fact /= (n - i);

            //현재 자리에 들어갈 숫자의 인덱스
            int index = (int) (k / fact);
            answer[i] = numbers.get(index);
            numbers.remove(index);

            //k 업데이트
            k %= fact;
        }
        return answer;
    }
}
