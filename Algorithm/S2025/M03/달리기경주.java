package Algorithm.S2025.M03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public static void main (String [] args){
        String [] players = {"mumu", "soe", "poe", "kai", "mine"};
        String [] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String name : callings) {
            int idx = playerMap.get(name);

               if (idx > 0) {
                   String prevPlayer = players[idx - 1];
                   players[idx - 1] = name;
                   players[idx] = prevPlayer;

                   playerMap.put(name, idx - 1);
                   playerMap.put(prevPlayer, idx);
               }
        }

        return players;
    }
}

