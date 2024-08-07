package Algorithm.S2024.M08;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    public static void main (String [] args){

        System.out.println(solution("17"));
        System.out.println(solution("011"));

    }

    public static int solution(String numbers) {
        Set<Integer> primeNumbers = new HashSet<>();
        generateNumbers(numbers, "", primeNumbers);

        int count = 0;
        for (int num : primeNumbers) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    // 모든 숫자 조합 생성
    private static void generateNumbers(String numbers, String current, Set<Integer> primes) {
        if (!current.isEmpty()) {
            primes.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            generateNumbers(numbers.substring(0, i) + numbers.substring(i + 1), current + numbers.charAt(i), primes);
        }
    }

    // 소수 판별
    private static boolean isPrime(int num) {
        if (num < 2) return false; // 0과 1은 소수가 아님
        if (num == 2) return true; // 2는 소수
        if (num % 2 == 0) return false; // 2를 제외한 짝수는 소수가 아님

        int sqrt = (int)Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) { // 2 이후의 홀수로만 검사
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
