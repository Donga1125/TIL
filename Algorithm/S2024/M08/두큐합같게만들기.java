package Algorithm.S2024.M08;

public class 두큐합같게만들기 {
    public static void main (String[] args){
        System.out.println(solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
        System.out.println(solution(new int[]{1,2,1,2}, new int[]{1,10,1,2}));

    }

    public static   int solution(int[] queue1, int[] queue2) {
        // 두 큐의 합을 계산
        long sum1 = 0, sum2 = 0;
        for (int num : queue1) sum1 += num;
        for (int num : queue2) sum2 += num;

        // 두 큐의 원소 총합
        long totalSum = sum1 + sum2;

        // 합이 홀수라면 어떤 방법으로도 두 큐의 합을 같게 할 수 없음
        if (totalSum % 2 != 0) return -1;

        // 목표 합
        long targetSum = totalSum / 2;

        // 두 큐를 합친 배열 생성
        int n = queue1.length;
        int[] combinedQueue = new int[n * 2];
        System.arraycopy(queue1, 0, combinedQueue, 0, n);
        System.arraycopy(queue2, 0, combinedQueue, n, n);

        int left = 0, right = n; // 각각 큐1, 큐2의 시작점
        long currentSum = sum1;
        int moves = 0;

        // 투 포인터로 합을 맞춰나감
        while (left < n * 2 && right < n * 2) {
            if (currentSum == targetSum) {
                return moves;
            } else if (currentSum < targetSum) {
                currentSum += combinedQueue[right++];
            } else {
                currentSum -= combinedQueue[left++];
            }
            moves++;
        }

        // 합을 맞출 수 없는 경우
        return -1;
    }
}
