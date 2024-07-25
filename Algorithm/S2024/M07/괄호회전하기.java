package Algorithm.S2024.M07;

import java.util.Stack;

public class 괄호회전하기 {
    public static void main (String [] args){
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
    }

    public static int solution(String s) {
        int validRotations = 0;
        int n = s.length();

        // Check all possible rotations
        for (int i = 0; i < n; i++) {
            if (isValidParentheses(s)) {
                validRotations++;
            }
            // Rotate the string by one character
            s = s.substring(1) + s.charAt(0);
        }

        return validRotations;
    }

    private static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        // Check if the string is a valid parentheses string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses were matched correctly
        return stack.isEmpty();
    }
}
