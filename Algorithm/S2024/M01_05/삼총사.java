package Algorithm.S2024.M01_05;

public class 삼총사 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));

    }
    public static int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 3중 반복문을 통해 모든 세 학생 조합을 검사
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
