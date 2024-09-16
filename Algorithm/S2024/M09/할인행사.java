package Algorithm.S2024.M09;

import java.util.HashMap;
import java.util.Map;

public class 할인행사 {

    public static void main (String[]args){
        String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
        int [] num1 = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want1, num1,discount));

    }
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> need = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            need.put(want[i], number[i]);
        }
        Map<String, Integer> current = new HashMap<>();
        int windowSize = 10; // 회원 자격 기간은 10일

        // 할인 목록 탐색
        for (int i = 0; i <= discount.length - windowSize; i++) {
            if (i == 0) {
                for (int j = 0; j < windowSize; j++) {
                    String item = discount[j];
                    current.put(item, current.getOrDefault(item, 0) + 1);
                }
            } else {
                // 이전 아이템 제거
                String prevItem = discount[i - 1];
                current.put(prevItem, current.get(prevItem) - 1);
                if (current.get(prevItem) == 0) {
                    current.remove(prevItem);
                }
                // 새로운 아이템 추가
                String newItem = discount[i + windowSize - 1];
                current.put(newItem, current.getOrDefault(newItem, 0) + 1);
            }
            
            if (isMatch(need, current)) {
                answer++;
            }
        }

        return answer;
    }

    // 필요한 제품 목록과 현재 윈도우의 제품 목록이 일치하는지 확인하는 함수
    private static boolean isMatch(Map<String, Integer> need, Map<String, Integer> current) {
        for (String key : need.keySet()) {
            if (!current.containsKey(key) || !current.get(key).equals(need.get(key))) {
                return false;
            }
        }
        return true;
    }
}
