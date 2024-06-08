package Algorithm.S2024;

public class 시저암호 {
    public static void main (String[] args){

        System.out.println(solution("AB",1));
    }
        public static String solution(String s, int n) {
            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    // 대문자 처리
                    result.append((char) ('A' + (c - 'A' + n) % 26));
                } else if (Character.isLowerCase(c)) {
                    // 소문자 처리
                    result.append((char) ('a' + (c - 'a' + n) % 26));
                } else {
                    // 공백 처리
                    result.append(c);
                }
            }

            return result.toString();
        }


}
