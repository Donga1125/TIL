package Algorithm.S2024;

import java.util.Stack;

//전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴
public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        //전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴
        System.out.println(solution("01033334444"));
    }

    public static String solution(String phone_number) {
        Stack<Character> stack = new Stack<>();
        int n = phone_number.length();
        int m = n-5;
        String answer = "";

        for (int i = n-1; i>=0; i--){//뒤 4자리만 그대로 출력하려고
            if (i <= m) stack.push('*');
            else stack.push(phone_number.charAt(i));
        }
        while (n > 0){//스택에 담아둔거 출력
            answer += stack.pop();
            n --;
        }
        return answer;
    }
}
