package Algorithm.S2024.M11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 전력망을둘로나누기 {

    public static void main (String [] args){
        int [][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

        System.out.println(solution(9, wires));

    }

    public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        //인접 리스트
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        //전선 하나씩 끊어서 최소차이 계산
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            //전선끊기
            graph.get(v1).remove(Integer.valueOf(v2));
            graph.get(v2).remove(Integer.valueOf(v1));

            //BFS로 한 쪽 서브트리의 노드 개수 계산
            int subtreeSize = bfs(v1, graph, n);
            int otherSize = n - subtreeSize;
            answer = Math.min(answer, Math.abs(subtreeSize - otherSize));

            //전선 복구
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        return answer;
    }

    //BFS로 서브트리 크기 계산
    private static int bfs(int start, List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return count;
    }
}
