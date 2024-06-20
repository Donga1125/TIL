package Algorithm.S2024.M01_05;

public class 약수의합 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i<=n; i++){
            if (n % i == 0){ //약수 판별
                answer += i;
            }
        }
        return answer;
    }
}
