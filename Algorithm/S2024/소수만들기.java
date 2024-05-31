package Algorithm.S2024;

public class 소수만들기 {
    public static void main (String[] args){
        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;

        // 세 숫자의 조합 모두 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    // 소수 판별하는 함수
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
