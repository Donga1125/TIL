package Algorithm.S2024.M08;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    //HashSet은 중복된 값을 자동으로 제거
    public static void main (String[] args){
        System.out.println(solution(new int[]{7,9,1,1,4}));
    }

    public static int solution(int[] elements) {
        Set<Integer> result = new HashSet<>();
        int n = elements.length;

        for (int length = 1; length<= n; length ++ ){
            for (int start = 0; start< n; start++ ){
                int sum = 0;
                for (int i =0; i<length; i++){
                    sum += elements[(start+i) %n];
                }
                result.add(sum);
            }
        }

        return result.size();
    }

}
