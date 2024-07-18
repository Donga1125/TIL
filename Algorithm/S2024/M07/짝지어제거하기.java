package Algorithm.S2024.M07;

import java.util.Stack;

public class 짝지어제거하기 {
    public static void main (String[] args){

        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // 스택이 비어 있지 않고, 현재 문자가 스택의 top과 동일한 경우
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        // 스택이 비어 있으면 모든 문자가 제거되었음을 의미
        return stack.isEmpty() ? 1 : 0;
    }
}
