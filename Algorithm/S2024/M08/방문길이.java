package Algorithm.S2024.M08;

import java.util.HashSet;
import java.util.Set;

public class 방문길이 {
    public static void main (String[] args){
        System.out.println(solution("ULURRDLLU"));
        System.out.println(solution("LULLLLLLU"	));

    }

    public static int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;

        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;

            switch (dir) {
                case 'U': ny++; break;
                case 'D': ny--; break;
                case 'R': nx++; break;
                case 'L': nx--; break;
            }

            // 경계를 벗어나면 이동 무시
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;

            // 길을 "현재 좌표 -> 새로운 좌표"와 "새로운 좌표 -> 현재 좌표"로 표현
            String path1 = x + "" + y + "" + nx + "" + ny;
            String path2 = nx + "" + ny + "" + x + "" + y;

            // 새로운 길이면 추가
            visited.add(path1);
            visited.add(path2);

            // 좌표 업데이트
            x = nx;
            y = ny;
        }

        // 방문한 길의 절반만 카운트 (양방향 경로이기 때문에)
        return visited.size() / 2;
    }
}
