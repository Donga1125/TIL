package Algorithm.S2024;
import java.util.PriorityQueue;

public class 더맵게 {

    public static void main (String[] args){
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.offer(s);
        }

        int count = 0;

        while (pq.size() > 1 && pq.peek() < K) {
            int leastSpicy = pq.poll();
            int secondLeastSpicy = pq.poll();
            int newScoville = leastSpicy + (secondLeastSpicy * 2);

            pq.offer(newScoville);
            count++;
        }

        if (pq.peek() < K) {
            return -1;
        }

        return count;
    }
}
