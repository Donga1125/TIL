package Algorithm.S2024.M07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public static void main (String [] args){
        String [] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String [] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println(Arrays.toString(solution(3, words1)));
        System.out.println(Arrays.toString(solution(5,words2)));
    }

    public static int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            String previousWord = words[i - 1];

            // Check if the current word has been used or does not match the last char of the previous word
            if (usedWords.contains(currentWord) || previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0)) {
                int playerNumber = (i % n) + 1;
                int turnNumber = (i / n) + 1;
                return new int[]{playerNumber, turnNumber};
            }

            // Add the current word to the set of used words
            usedWords.add(currentWord);
        }

        return new int[]{0, 0};

    }
}
