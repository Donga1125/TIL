package Algorithm.S2024.M12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 무인도여행 {
    public static void main (String [] args){
        System.out.println(Arrays.toString(solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"})));
        System.out.println(Arrays.toString(solution(new String[]{"XXX","XXX","XXX"})));

    }

    public static int[] solution(String[] maps) {
        int rows = maps.length;
        int cols = maps[0].length();
        boolean[][] visited = new boolean[rows][cols];
        List<Integer> islandDays = new ArrayList<>();

        //지도 배열생성
        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            grid[i] = maps[i].toCharArray();
        }

        //상하좌우 탐색 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        //DFS 함수
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && grid[i][j] != 'X') {
                    islandDays.add(dfs(grid, visited, i, j, dx, dy));
                }
            }
        }

        //결과
        if (islandDays.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(islandDays);
        return islandDays.stream().mapToInt(i -> i).toArray();
    }

    //DFS로 섬의 값을 합산
    private static int dfs(char[][] grid, boolean[][] visited, int x, int y, int[] dx, int[] dy) {
        int rows = grid.length;
        int cols = grid[0].length;
        visited[x][y] = true;
        int sum = grid[x][y] - '0'; // 숫자로 변환

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && !visited[nx][ny] && grid[nx][ny] != 'X') {
                sum += dfs(grid, visited, nx, ny, dx, dy);
            }
        }
        return sum;
    }
}
