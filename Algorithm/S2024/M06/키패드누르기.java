package Algorithm.S2024.M06;

import java.util.Arrays;

public class 키패드누르기 {
    public static void main (String[] args){

        int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hands = "right";
        System.out.println(solution(numbers,hands));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] keypad = {
                {3, 1}, // 0
                {0, 0}, // 1
                {0, 1}, // 2
                {0, 2}, // 3
                {1, 0}, // 4
                {1, 1}, // 5
                {1, 2}, // 6
                {2, 0}, // 7
                {2, 1}, // 8
                {2, 2}  // 9
        };

        // 초기 위치 설정
        int[] leftPos = {3, 0}; // '*'
        int[] rightPos = {3, 2}; // '#'

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                // 왼쪽 열 숫자
                answer.append("L");
                leftPos = keypad[number];
            } else if (number == 3 || number == 6 || number == 9) {
                // 오른쪽 열 숫자
                answer.append("R");
                rightPos = keypad[number];
            } else {
                // 가운데 열 숫자
                int[] targetPos = keypad[number];
                int leftDist = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                int rightDist = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    leftPos = targetPos;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    rightPos = targetPos;
                } else {
                    // 거리가 같을 경우 주 손잡이 사용
                    if (hand.equals("left")) {
                        answer.append("L");
                        leftPos = targetPos;
                    } else {
                        answer.append("R");
                        rightPos = targetPos;
                    }
                }
            }
        }

        return answer.toString();
    }
}
