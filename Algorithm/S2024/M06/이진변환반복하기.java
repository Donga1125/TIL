package Algorithm.S2024.M06;

import java.util.Arrays;

public class 이진변환반복하기 {

    public static void main (String [] args){

        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int count = 0;
        int removed = 0;

        while (!s.equals("1")) {
            count++;

            // 0을 제거하고 남은 문자열의 길이 계산
            int lengthBefore = s.length();
            s = s.replace("0", "");
            int lengthAfter = s.length();

            removed += (lengthBefore - lengthAfter);

            // 남은 문자열의 길이를 2진수로 변환
            s = Integer.toBinaryString(lengthAfter);
        }

        return new int[] {count, removed};
    }
}
