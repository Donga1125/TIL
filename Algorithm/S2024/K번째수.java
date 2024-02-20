package Algorithm.S2024;
import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int[] command = commands[i];
                int startIdx = command[0] - 1;
                int endIdx = command[1];
                int targetIdx = command[2] - 1;

                ArrayList<Integer> subList = new ArrayList<>();
                for (int j = startIdx; j < endIdx; j++) {
                    subList.add(array[j]);
                }
                Collections.sort(subList);
                answer[i] = subList.get(targetIdx);
            }

            return answer;
        }
    }

}
