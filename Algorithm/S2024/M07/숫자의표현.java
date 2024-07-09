package Algorithm.S2024.M07;

public class 숫자의표현 {
    public static void main (String[]args){
        System.out.println(solution(15));

    }
    public static int solution(int n) {
        int count = 0;

        for (int k = 1; k * (k - 1) / 2 < n; k++) {
            int sum = k * (k - 1) / 2;
            if ((n - sum) % k == 0) {
                count++;
            }
        }

        return count;
    }
}
