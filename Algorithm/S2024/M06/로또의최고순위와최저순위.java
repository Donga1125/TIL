package Algorithm.S2024.M06;

import java.util.Arrays;


public class 로또의최고순위와최저순위 {
    public static void main (String[] args){

        int [] a = {0, 0, 0, 0, 0, 0};
        int [] b = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solution(a,b)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int sum = 0;

        for (int i =0; i< lottos.length; i++){
            int number = lottos[i];
            for (int num : win_nums){
                if (num == number){
                    sum ++;
                }
            }
        }
        for (int num : lottos){
            if (num == 0){
                count ++;
            }
        }
        answer[0] = count+sum;
        answer[1] = sum;

        for (int j = 0; j < answer.length; j++) {
            switch (answer[j]) {
                case 6:
                    answer[j] = 1;
                    break;
                case 5:
                    answer[j] = 2;
                    break;
                case 4:
                    answer[j] = 3;
                    break;
                case 3:
                    answer[j] = 4;
                    break;
                case 2:
                    answer[j] = 5;
                    break;
                case 1:
                    answer[j] = 6;
                    break;
                case 0:
                    answer[j] = 6;
                    break;
            }
        }

        return answer;
    }
}
