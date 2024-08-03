package Algorithm.S2024.M08;

import java.util.Arrays;

public class 땅파먹기 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.println(solution(land));
    }

    public static int solution(int[][] land) {
        int n = land.length;

        // DP 방식으로 최대 점수 계산
        for (int i = 1; i < n; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }

        // 마지막 행에서 최대 점수 반환
        return Math.max(Math.max(land[n - 1][0], land[n - 1][1]),
                Math.max(land[n - 1][2], land[n - 1][3]));
    }
}