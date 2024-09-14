package Algorithm.S2024.M09;

public class N개의최소공배수 {

    public static void main(String[] args) {

        int[] arr1 = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }


    // 최대공약수(GCD) 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM) 함수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 배열의 최소공배수를 구하는 함수
    public static int solution(int[] arr) {
        // 초기 최소공배수를 배열의 첫 번째 값으로 설정
        int answer = arr[0];

        // 배열의 나머지 값들에 대해 최소공배수를 계산
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

}
