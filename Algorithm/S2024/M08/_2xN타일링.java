package Algorithm.S2024.M08;

public class _2xN타일링 {
    public static void main (String[] args){
        System.out.println(solution(4));

    }
    public static int solution(int n) {
        int MOD = 1_000_000_007;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }

        return dp[n];
    }
}
