package Algorithm.S2024;
import java.util.Stack;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 결과를 저장할 배열

        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장할 스택

        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고 현재 가격이 가격이 떨어진 가격이라면
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                // 스택에서 이전 가격의 인덱스를 꺼낸다.
                int prevIndex = stack.pop();
                // 현재 시간과 이전 가격 사이의 시간 차이를 계산하여 결과 배열에 저장
                answer[prevIndex] = i - prevIndex;
            }
            // 현재 시간을 스택에 추가
            stack.push(i);
        }

        // 스택에 남은 인덱스들은 가격이 떨어지지 않은 경우이므로
        // 해당 인덱스들의 결과 값을 계산해준다.
        while (!stack.isEmpty()) {
            int prevIndex = stack.pop();
            answer[prevIndex] = prices.length - prevIndex - 1;
        }

        return answer;
    }

    // 테스트를 위한 메인 메소드
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] result = solution(prices);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
