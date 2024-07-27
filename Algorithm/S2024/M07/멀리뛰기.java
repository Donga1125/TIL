package Algorithm.S2024.M07;

public class 멀리뛰기 {
    public static void main (String[] args){
        System.out.println(solution(4));
        System.out.println(solution(3));

    }

    public static int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int mod = 1234567;
        int prev1 = 1; // ways to reach the first step
        int prev2 = 2; // ways to reach the second step
        int current = 0;

        // Calculate ways to reach each step from 3 to n
        for (int i = 3; i <= n; i++) {
            current = (prev1 + prev2) % mod;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}
