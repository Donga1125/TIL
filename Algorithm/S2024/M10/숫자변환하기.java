package Algorithm.S2024.M10;

import java.util.LinkedList;
import java.util.Queue;

public class 숫자변환하기 {
    public static void main (String[] args){
        System.out.println(solution(10, 40, 5));
        System.out.println(solution(10, 40, 30));
        System.out.println(solution(2,5,4));

    }
    public static int solution(int x, int y, int n) {
        if (x == y) {
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];

        queue.add(new int[]{x, 0});  // 현재 값과 연산 횟수를 큐에 저장
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int count = current[1];

            // 연산 결과가 y에 도달하면 연산 횟수 반환
            if (value == y) return count;

            // 다음 가능한 값들을 계산
            int[] nextValues = {value + n, value * 2, value * 3};

            for (int nextValue : nextValues) {
                if (nextValue <= y && !visited[nextValue]) {  // y를 넘지 않고 방문하지 않은 값만
                    queue.add(new int[]{nextValue, count + 1});
                    visited[nextValue] = true;
                }
            }
        }

        return -1;
    }
}
