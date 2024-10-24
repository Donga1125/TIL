package Algorithm.S2024.M10;

public class 마법의엘리베이터 {
    public static void main (String[] args){
        System.out.println(solution(16));
        System.out.println(solution(2554));

    }

    public static int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int currentDigit = storey % 10;
            int nextStorey = storey / 10;

            if (currentDigit > 5 || (currentDigit == 5 && (nextStorey % 10) >= 5)) {
                // 5 이상이거나, 5인데 다음 자리가 5 이상인 경우 올림
                answer += (10 - currentDigit);
                storey = nextStorey + 1;
            } else {
                // 5 미만이면내림
                answer += currentDigit;
                storey = nextStorey;
            }
        }

        return answer;
    }
}
