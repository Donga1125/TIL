package Algorithm.S2024.M11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class 배달 {
    //최단 경로 알고리즘으로 풀 수 있었음...

    public static void main (String [] args){
        int road [][] = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
        System.out.println(solution(5, road, 3));

    }

    public static int solution(int N, int[][] road, int K) {
        //그래프 초기화
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        //도로 정보 추가 (양방향)
        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int c = r[2];
            graph.get(a).add(new int[]{b, c});
            graph.get(b).add(new int[]{a, c});
        }

        //최단거리 배열 및 우선순위 큐 초기화
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{1, 0});

        //다익스트라 알고리즘 적용...
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currVillage = current[0];
            int currDist = current[1];

            if (currDist > dist[currVillage]) continue;

            for (int[] neighbor : graph.get(currVillage)) {
                int nextVillage = neighbor[0];
                int time = neighbor[1];
                int newDist = currDist + time;

                if (newDist < dist[nextVillage]) {
                    dist[nextVillage] = newDist;
                    pq.offer(new int[]{nextVillage, newDist});
                }
            }
        }

        //K이하로 도달할 수 있는 마을수 세기
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                count++;
            }
        }

        return count;
    }
}
