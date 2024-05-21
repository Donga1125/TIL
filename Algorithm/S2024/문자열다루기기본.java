package Algorithm.S2024;

public class 문자열다루기기본 {
    public static void main (String[] args){
        //문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }
    public static boolean solution(String s) {
        boolean answer;
        int n = s.length();
        Character characters[] = new Character[s.length()];
        if (n == 4 || n == 6) answer = true;
        else answer = false;

        for (int i=0; i<n; i++){
            characters[i] = s.charAt(i);
            if ((int)characters[i]>= 97 || (int)characters[i] >= 65){ //영문 알파벳 대소문자일경우 false
                answer = false;
            }
        }
        return answer;
    }
}
