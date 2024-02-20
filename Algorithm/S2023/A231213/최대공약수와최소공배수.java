package Algorithm.S2023.A231213;

public class 최대공약수와최소공배수 {
    //배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환
    public static void main(String args[]) {

        System.out.println(solution(3,12));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        //더 큰수를 n으로 설정
        if (n < m ){
            int temp = n;
            n = m;
            m = temp;
        }

        //최대 공약수
        answer[0] = gcd(n,m);

        //최소공배수
        answer[1] = n * m / answer[0];

        return answer;
    }

    static int gcd (int n, int m){
        int r;
        while (m > 0){
            r = n%m;
            n = m;
            m = r;
        }

        return n;
    }
}
