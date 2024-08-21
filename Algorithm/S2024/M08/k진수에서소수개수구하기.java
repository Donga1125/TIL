package Algorithm.S2024.M08;

public class k진수에서소수개수구하기 {
    public static void main (String[] args){
        //정수 n을 k진수로 변환
        //변환한거에서 10진법 기준 소수를 찾고 0이 어디에 있는지 확인
        System.out.println(solution(437674,2));
        System.out.println(solution(110011,10));

    }

    public static int solution(int n, int k) {
        String kBaseNumber = Integer.toString(n, k);  // n을 k진수로 변환
        String[] candidates = kBaseNumber.split("0"); // '0'을 기준으로 분할

        int count = 0;
        for (String candidate : candidates) {
            if (!candidate.isEmpty() && isPrime(Long.parseLong(candidate))) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
