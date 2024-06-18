package Algorithm.S2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {

    public static void main (String[]args){
        //명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때,
        //매일 발표된 명예의 전당의 최하위 점수를 return하는 solution
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i<score.length; i++){
            if (arr.size() < k){
                arr.add(score[i]);
                answer[i] = Collections.min(arr);
            }else {
                int min = Collections.min(arr);
                if (score[i] > min) { //명예의 전당 내 최소값보다 크면 값 변경
                    arr.remove(Integer.valueOf(min));
                    arr.add(score[i]);
                }
                answer[i] = Collections.min(arr);
            }
        }
        return answer;
    }
}
