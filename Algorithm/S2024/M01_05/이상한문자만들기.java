package Algorithm.S2024.M01_05;

public class 이상한문자만들기 {
    public static void main (String[] args){
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);  // -1 flag를 사용하여 끝의 공백도 유지

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(words[i].charAt(j)));
                } else {
                    answer.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
            if (i < words.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
