package Algorithm.S2024.M07;

public class 피보나치의수 {

    public static void main (String[] args){

        System.out.println(solution(3));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        int mod = 1234567;
        int prev1 = 1; // F(1)
        int prev2 = 1; // F(2)
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = (prev1 + prev2) % mod;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}