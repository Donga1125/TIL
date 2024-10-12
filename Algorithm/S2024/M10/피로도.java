package Algorithm.S2024.M10;
public class 피로도 {
    private static int maxDungeonCount = 0;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = { {80, 20}, {50, 40}, {30, 10} };

        System.out.println(solution(k, dungeons));
    }

    public static int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; // 던전을 방문했는지 체크하는 배열
        exploreDungeons(k, dungeons, visited, 0);
        return maxDungeonCount;
    }

    // 던전 탐험을 재귀적으로 수행하는 함수
    private static void exploreDungeons(int fatigue, int[][] dungeons, boolean[] visited, int count) {
        // 탐험한 던전의 수를 갱신
        maxDungeonCount = Math.max(maxDungeonCount, count);

        // 모든 던전을 하나씩 탐험 시도
        for (int i = 0; i < dungeons.length; i++) {
            // 해당 던전을 아직 방문하지 않았고, 현재 피로도로 탐험할 수 있는 경우
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true; // 해당 던전을 방문 처리
                // 피로도를 소모하고, 재귀적으로 탐험을 진행
                exploreDungeons(fatigue - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false; // 백트래킹: 방문 상태 복구
            }
        }
    }
}
