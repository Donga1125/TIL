package Algorithm.S2024.M01_05;

public class 평균구하기 {
        public static double solution(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return (double) sum / arr.length;
        }

        public static void main(String[] args) {
            System.out.println(solution(new int[]{1, 2, 3, 4})); // 2.5
            System.out.println(solution(new int[]{5, 5}));       // 5.0
        }

}
