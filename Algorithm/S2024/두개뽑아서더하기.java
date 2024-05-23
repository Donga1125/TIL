package Algorithm.S2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
     public static void main (String[]args){
         //numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return
         System.out.println(solution(new int[]{2,1,3,4,1}));
         System.out.println(solution(new int[]{5,0,2,7}));
     }

    public static int[] solution(int[] numbers) {
        Set<Integer> sums = new HashSet<>();

        for (int i =0; i<numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                sums.add(sum);
            }
        }
        //중복제거
        int [] answer = sums.stream().mapToInt(Integer::intValue).toArray();
        //정렬
        Arrays.sort(answer);
        return answer;
    }
}
