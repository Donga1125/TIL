package Algorithm.S2024;

import java.util.HashMap;
public class 가장가까운같은글자 {
    public static void main (String[]args){
        System.out.println(solution("banana"	));
}
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lastSeen.containsKey(currentChar)) {
                answer[i] = i - lastSeen.get(currentChar);
            } else {
                answer[i] = -1;
            }
            lastSeen.put(currentChar, i);
        }

        return answer;
    }
}
