package Algorithm.S2024.M08;

public class 모음사전 {
    public static void main (String[] args){
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
    }

    public static int solution(String word) {

        String vowels = "AEIOU";
        int[] multiplier = {781, 156, 31, 6, 1};

        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            int position = vowels.indexOf(word.charAt(i));
            index += position * multiplier[i] + 1;
        }

        return index;
    }
}
