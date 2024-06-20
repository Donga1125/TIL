package Algorithm.S2024.M01_05;

import java.util.Arrays;

public class 예산 {
    public static void main (String[]args){
        //d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
        //최대한 많은 부서의 물품을 구매
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); //오름차순으로 정렬

        for (int i =0; i<d.length; i++){
            if (budget < d[i]){
                break;
            }
            budget -= d[i];
            answer ++;
        }
        return answer;
    }
}
