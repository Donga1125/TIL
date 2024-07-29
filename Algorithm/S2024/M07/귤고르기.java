package Algorithm.S2024.M07;

import java.util.*;

public class 귤고르기 {
    public static void main (String [] args){
        int [] arr1 = {1, 3, 2, 5, 4, 5, 2, 3};
        int [] arr2 = {1, 1, 1, 1, 2, 2, 2, 3};

        System.out.println(solution(6, arr1));
        System.out.println(solution(4, arr1));
        System.out.println(solution(2, arr2));
    }

    public static int solution(int k, int[] tangerine) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int size : tangerine) {
            frequencyMap.put(size, frequencyMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        Collections.sort(frequencies, Collections.reverseOrder());

        int selectedCount = 0;
        int sizeCount = 0;
        for (int freq : frequencies) {
            selectedCount += freq;
            sizeCount++;
            if (selectedCount >= k) {
                return sizeCount;
            }
        }

        return sizeCount;
    }
}
