package Algorithm.S2024.M01_05;

import java.util.HashMap;

public class 의상 {
    //의상의 종류별로 몇 개의 의상이 있는지를 세어야함
    //각 종류별 의상을 입거나 입지 않는 경우를 모두 곱해주면 가능한 조합의 수를 구할 수 있음
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));

    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();

        // 각 의상의 종류별 개수 세기
        for (String[] cloth : clothes) {
            String category = cloth[1];
            clothesMap.put(category, clothesMap.getOrDefault(category, 0) + 1);
        }

        // 각 종류별 의상을 입거나 입지 않는 경우를 곱하여 모두 고려
        for (int count : clothesMap.values()) {
            answer *= (count + 1);
        }

        // 모든 종류의 의상을 입지 않는 경우는 제외하므로 1을 빼줌
        return answer - 1;
    }
}
