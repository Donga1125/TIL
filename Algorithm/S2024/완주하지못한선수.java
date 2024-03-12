package Algorithm.S2024;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println(solution(participant1, completion1));

    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        // 해시맵을 생성-> 참가자 이름과 그 등장 횟수를 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (map.containsKey(p)) {
                map.put(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }
        }

        // 완주자 명단을 기준으로 해시맵에서 이름을 뺀다
        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }

        // 해시맵에서 값이 1인 이름이 완주하지 못한 선수임
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
                break;
            }
        }

        return answer;
    }


}
