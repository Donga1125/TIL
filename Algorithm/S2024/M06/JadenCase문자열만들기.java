package Algorithm.S2024.M06;

public class JadenCase문자열만들기 {
    public static void main (String [] args){
        System.out.println(solution("3people unFollowed me"));
    }

    public static String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                capitalize = true;
            } else {
                if (capitalize) {
                    result.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }
}
