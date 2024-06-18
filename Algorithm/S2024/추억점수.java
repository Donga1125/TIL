package Algorithm.S2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 추억점수 {
    public static void main (String[] args){
        String [] name = {"may", "kein", "kain", "radi"};
        int [] yearning = {5, 10, 1, 3};
        String [][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> targetList = new ArrayList<>(Arrays.asList(name));

        for (int i =0; i< photo.length; i++){
            int sum = 0;
            for (int j =0; j <photo[i].length; j++){
                int num = targetList.indexOf(photo[i][j]);
                if (num != -1){
                    sum += yearning[num];
                }

            }
            answer[i] = sum;
        }
        return answer;
    }
}
