package Algorithm.S2024.M06;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

    public static void main (String[]args){
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }

    public static int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int sum1 =0;
        int sum2 =0;
        int sum3= 0;

        for (int i = 0; i < answers.length; i++) {
            if (num1[i % num1.length] == answers[i]) {
                sum1++;
            }
            if (num2[i % num2.length] == answers[i]) {
                sum2++;
            }
            if (num3[i % num3.length] == answers[i]) {
                sum3++;
            }
        }
        int [] arr1 = {sum1,sum2,sum3};
        int max = Arrays.stream(arr1).max().getAsInt();
        int count =1;
        for (int i =0; i<arr1.length; i++) {
            if (arr1[i] == max){
                list.add(count);
            }
            count++;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
