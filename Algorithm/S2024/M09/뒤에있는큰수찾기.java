package Algorithm.S2024.M09;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
    public static void main (String[] args){
        System.out.println(Arrays.toString(solution(new int[]{2, 3, 3, 5})));
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 5, 3, 6, 2})));

    }
    public static int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        // 배열을 뒤에서부터 탐색
        for (int i = n - 1; i >= 0; i--) {
            int currentNumber = numbers[i];

            // 현재 숫자보다 작은 숫자들은 스택에서 제거
            while (!stack.isEmpty() && stack.peek() <= currentNumber) {
                stack.pop();
            }

            // 현재 숫자보다 큰 숫자가 스택에 있으면 그게 뒷 큰수
            answer[i] = stack.isEmpty() ? -1 : stack.peek();

            // 현재 숫자를 스택에 추가
            stack.push(currentNumber);
        }

        return answer;
    }
}
