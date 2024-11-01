package Algorithm.S2024.M10;

public class _124나라의숫자 {
    public static void main (String[] args){
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));

    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            if (remainder == 0) {
                answer.append("4");
                n = n / 3 - 1;
            } else {
                answer.append(remainder);
                n /= 3;
            }
        }

        return answer.reverse().toString();
    }
}
