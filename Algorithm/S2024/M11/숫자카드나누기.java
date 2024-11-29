package Algorithm.S2024.M11;

public class 숫자카드나누기 {
    public static void main (String[] args){
        System.out.println(solution(new int[]{10, 17}, new int[]{5,20}));
        System.out.println(solution(new int[]{10, 20}, new int[]{5,17}));
        System.out.println(solution(new int[]{14,35,119}, new int[]{18,30,102}));

    }

    public static int solution(int[] arrayA, int[] arrayB) {
        //두 배열 GCD 계산
        int gcdA = findGCD(arrayA);
        int gcdB = findGCD(arrayB);

        //조건 검증
        boolean conditionA = canDivideAll(arrayB, gcdA);
        boolean conditionB = canDivideAll(arrayA, gcdB);

        //결과 반환
        int result = 0;
        if (!conditionA) result = Math.max(result, gcdA);
        if (!conditionB) result = Math.max(result, gcdB);

        return result;
    }

    //배열 전체 GCD 계산
    private static int findGCD(int[] array) {
        int gcd = array[0];
        for (int num : array) {
            gcd = gcd(gcd, num);
            if (gcd == 1) break; // 더 이상 계산할 필요 없음
        }
        return gcd;
    }

    //숫자가 배열의 모든 원소를 나눌 수 있는지 확인
    private static boolean canDivideAll(int[] array, int divisor) {
        for (int num : array) {
            if (num % divisor == 0) {
                return true;
            }
        }
        return false;
    }

    //두개의 GCD 계산 (유클리드 알고리즘)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
