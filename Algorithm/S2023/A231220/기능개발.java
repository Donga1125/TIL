package Algorithm.S2023.A231220;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class 기능개발 {
    public static void main(String[] args) {

        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        int[] result1 = solution(progresses1, speeds1);
        System.out.println(Arrays.toString(result1)); // [2, 1]

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] result2 = solution(progresses2, speeds2);
        System.out.println(Arrays.toString(result2)); // [1, 3, 2]
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        // 각 작업의 배포일 계산 및 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingDays = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            queue.offer(remainingDays);
        }

        // 배포 작업 수 계산
        while (!queue.isEmpty()) {
            int count = 1;
            int front = queue.poll();

            // 현재 작업보다 뒤에 있는 작업 중 더 빠르게 완료된 작업들 확인
            while (!queue.isEmpty() && front >= queue.peek()) {
                count++;
                queue.poll();
            }

            answerList.add(count);
        }

        // ArrayList를 int 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}


