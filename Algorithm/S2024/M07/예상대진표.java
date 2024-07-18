package Algorithm.S2024.M07;

public class 예상대진표 {
    public static void main(String [] args){
        System.out.println(solution(8,4,7));

    }

    public static int solution(int n, int a, int b)
    {
        int round = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        return round;
    }
}
