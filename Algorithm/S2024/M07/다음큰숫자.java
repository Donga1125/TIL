package Algorithm.S2024.M07;

public class 다음큰숫자 {

    public static void main (String[]args){
        System.out.println(solution(78));
    }

    public static int solution(int n) {
        int countOnes = Integer.bitCount(n);
        int nextNumber = n + 1;

        // 다음 큰 숫자를 찾을 때까지 반복
        while (Integer.bitCount(nextNumber) != countOnes) {
            nextNumber++;
        }

        // 조건을 만족하는 가장 작은 다음 큰 숫자를 반환
        return nextNumber;
    }
}
