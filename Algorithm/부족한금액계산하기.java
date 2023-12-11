package Algorithm;

public class 부족한금액계산하기 {

    public static void main(String args[]) {

        System.out.println(solution(3,20,1));
    }

    public static long solution(int price, int money, int count) {
        long sum = 0;
        long answer = 0;

        for (int i =1; i<= count; i++){
            sum += (price * i);
        }

        if (money - sum < 0) { //금액이 부족하지 않으면 0을 return하기 위해
            answer = Math.abs(sum - money);
        }

        return answer;
    }
}
