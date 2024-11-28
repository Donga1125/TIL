package Algorithm.S2024.M11;

import java.util.Stack;

public class 택배상자 {
    public static void main (String [] args){
        System.out.println(solution(new int[]{4, 3, 1, 2, 5}));
        System.out.println(solution(new int[]{5, 4, 3, 2, 1}));

    }

    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> subBelt = new Stack<>();
        int index = 0;

        for (int i = 1; i <= order.length; i++) {
            //지금상자를 트럭에 실어야 하는 순서인지 확인
            if (i == order[index]) {
                answer++;
                index++;
            } else {
                //보조 컨테이너 벨트에 상자 저장
                subBelt.push(i);
            }

            //보조 컨테이너 벨트에서 상자 꺼내서 트럭에 실을 수 있는지 확인
            while (!subBelt.isEmpty() && subBelt.peek() == order[index]) {
                subBelt.pop();
                answer++;
                index++;
            }
        }

        return answer;
    }

}
