package Algorithm.S2024.M01_05;

import static java.lang.Integer.*;

public class 크기가작은부분문자열 {
    public static void main (String[]args){
        //1 ≤ p의 길이 ≤ 18
        //p의 길이 ≤ t의 길이 ≤ 10,000
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int count = 0;
        String [] arrays = t.split("");

        for (int i =0; i<arrays.length; i++){
            String answer = "";
            if(i+ p.length() > arrays.length){
                break;
            }
            for (int j =i; j < i+ p.length(); j++){
                answer += arrays[j];
            }
            if (Long.parseLong(answer) <= Long.parseLong(p)){ //P의 길이는 최대 18 이므로 Integer의 범위를 벗어나서 런타임에러가 나기때문에 LONG으로 해줘야함
                count ++;
            }
        }
        return count;
    }
}
