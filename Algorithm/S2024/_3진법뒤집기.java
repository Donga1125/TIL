package Algorithm.S2024;
import java.util.Stack;


public class _3진법뒤집기 {

    public static void main (String [] args){
        //n을 3진법 상에서 앞뒤로 뒤집은 후, 다시 10진법으로 표현한 수를 return
        System.out.println(solution(45));
        System.out.println(solution(125));
    }
    public static int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        while (n > 0 ){ //3진법으로 변환
            int m = n % 3;
            stack.push(m);
            n = n/3 ;
        }
        int i =1;
        while (!stack.isEmpty()){ //꺼내서 10진법으로 변환
            int m = stack.pop() * i;
            answer += m;
            i = i *3;
        }

        return answer;
    }
}
