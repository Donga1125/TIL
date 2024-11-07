package Algorithm.S2024.M11;

import java.util.*;

public class 메뉴리뉴얼 {
    public static void main (String [] args){
        System.out.println(Arrays.toString(solution(new String [] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2,3,4})));

    }


    public static String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();

        for (int c : course) {
            Map<String, Integer> combinationCount = new HashMap<>();

            // 각 주문에 대해 정렬하고, 해당 길이(c)의 조합을 구함
            for (String order : orders) {
                char[] sortedOrder = order.toCharArray();
                Arrays.sort(sortedOrder);

                // 조합 생성 후 카운트 증가
                combinationCount = addCombinations(combinationCount, sortedOrder, c);
            }

            // 최빈값 찾음
            int maxCount = combinationCount.values().stream().max(Integer::compare).orElse(0);

            // 최빈값이 2 이상인 조합들만 리스트에 추가
            for (Map.Entry<String, Integer> entry : combinationCount.entrySet()) {
                if (entry.getValue() == maxCount && maxCount > 1) {
                    answerList.add(entry.getKey());
                }
            }
        }

        // 사전순으로 정렬 후 배열로 변환
        Collections.sort(answerList);
        return answerList.toArray(new String[0]);
    }

    // 조합을 구하여 맵에 추가하는 메서드
    private static Map<String, Integer> addCombinations(Map<String, Integer> map, char[] order, int length) {
        combine(order, new StringBuilder(), 0, length, map);
        return map;
    }

    // 백트래킹으로 조합 생성 및 카운트 증가
    private static void combine(char[] order, StringBuilder current, int start, int length, Map<String, Integer> map) {
        if (current.length() == length) {
            String combination = current.toString();
            map.put(combination, map.getOrDefault(combination, 0) + 1);
            return;
        }

        for (int i = start; i < order.length; i++) {
            current.append(order[i]);
            combine(order, current, i + 1, length, map);
            current.deleteCharAt(current.length() - 1);  // 마지막 문자 제거
        }
    }
}
