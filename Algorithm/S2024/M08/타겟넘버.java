package Algorithm.S2024.M08;

public class 타겟넘버 {
    public static void main (String [] args){
        System.out.println(solution(new int[]{1,1,1,1,1}, 3));
        System.out.println(solution(new int[]{4,1,2,1}, 4));
    }

    public static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private static int dfs(int[] numbers, int target, int index, int sum) {
        // 기저 조건: 모든 숫자를 다 사용했을 때
        if (index == numbers.length) {
            // 현재까지의 합이 타겟 넘버와 같으면 1 반환
            return sum == target ? 1 : 0;
        }

        // 현재 숫자를 더하는 경우와 빼는 경우로 나누어 재귀 호출
        return dfs(numbers, target, index + 1, sum + numbers[index])
                + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
