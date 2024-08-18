package Algorithm.S2024.M08;

import java.util.HashSet;
import java.util.Set;

public class 롤케이크자르기 {
    public static void main (String[] args){
        System.out.println(solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));

    }
    public static int solution(int[] topping) {
        int n = topping.length;
        Set<Integer> leftSet = new HashSet<>();
        Set<Integer> rightSet = new HashSet<>();
        int[] rightCount = new int[n];

        // 오른쪽 부분 세트 초기화
        for (int i = n - 1; i >= 0; i--) {
            rightSet.add(topping[i]);
            rightCount[i] = rightSet.size();
        }

        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            leftSet.add(topping[i]);
            if (leftSet.size() == rightCount[i + 1]) {
                result++;
            }
        }

        return result;
    }
}
