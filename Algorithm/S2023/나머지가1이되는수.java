package Algorithm.S2023;

public class 나머지가1이되는수 {

    public static void main(String args[]) {

        System.out.println(solution(10));
    }


    public static int solution(int n) {
        int answer = -1;

        for (int i = 2; i< n; i++){
            if (n % i == 1){
                answer = i;
                break; //1이되는 최소 수를 찾기 위해서
            }

        }
        return answer;
    }
}
