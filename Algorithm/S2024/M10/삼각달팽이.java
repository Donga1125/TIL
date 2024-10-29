package Algorithm.S2024.M10;

import java.util.Arrays;

public class 삼각달팽이 {
    public static void main (String[]args){
        System.out.println(Arrays.toString(solution(4)));
        System.out.println(Arrays.toString(solution(5)));
        System.out.println(Arrays.toString(solution(6)));
    }

    public static int[] solution(int n) {
        int[][] triangle = new int[n][];

        // 삼각형 초기화 - i번째 행은 i+1개의 칸을 가짐
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }

        int num = 1; // 채울 숫자
        int row = 0, col = 0; // 시작 위치
        int direction = 0; // 방향 (0: 아래, 1: 오른쪽, 2: 위쪽 대각선)

        while (num <= n * (n + 1) / 2) { // 총 n(n+1)/2개를 채우면 완료
            triangle[row][col] = num++;

            // 다음 위치 계산
            int nextRow = row;
            int nextCol = col;

            if (direction == 0) { // 아래로 이동
                nextRow++;
            } else if (direction == 1) { // 오른쪽으로 이동
                nextCol++;
            } else if (direction == 2) { // 위쪽 대각선으로 이동
                nextRow--;
                nextCol--;
            }

            // 경계를 넘어가거나 이미 채워진 위치면 방향 전환
            if (nextRow >= n || nextCol > nextRow || triangle[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 3; // 다음 방향으로 전환

                // 다음 방향에 맞게 row와 col 업데이트
                if (direction == 0) {
                    row++;
                } else if (direction == 1) {
                    col++;
                } else {
                    row--;
                    col--;
                }
            } else { // 경계에 걸리지 않으면 이동
                row = nextRow;
                col = nextCol;
            }
        }

        // 결과
        int[] answer = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }
}
