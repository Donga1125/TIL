package Algorithm.S2024.M06;

import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main (String[]args){
        String [] friends = {"muzi", "ryan", "frodo", "neo"};
        String [] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends, gifts));
    }

    public static int solution(String[] friends, String[] gifts) {
        int l1 = friends.length;
        int l2 = gifts.length;

        // 2차원 배열과 선물 지수를 저장할 배열 및 변수들
        int[][] tbl = new int[l1][l1];
        int[] idx = new int[l1];
        int max = 0;

        // 친구 이름을 인덱스로 매핑하기 위한 맵
        Map<String, Integer> friendIndexMap = new HashMap<>();
        for (int i = 0; i < l1; i++) {
            friendIndexMap.put(friends[i], i);
        }

        // 선물 데이터를 인덱스로 치환하여 2차원 배열에 입력
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giverIndex = friendIndexMap.get(parts[0]);
            int receiverIndex = friendIndexMap.get(parts[1]);
            tbl[giverIndex][receiverIndex]++;
        }

        // 2차원 배열로부터 선물 지수 구하기
        for (int i = 0; i < l1; i++) {
            int gnt = 0;
            for (int j = 0; j < l1; j++) {
                gnt += tbl[i][j]; // 줬으면 +1
                gnt -= tbl[j][i]; // 받았으면 -1
            }
            idx[i] = gnt; // idx[i] = i의 선물지수
        }

        // 받을 선물 수 구해서 max값 계산하기
        for (int i = 0; i < l1; i++) {
            int take = 0; // 선물 받을 횟수
            for (int j = 0; j < l1; j++) {
                if (i != j) { // 자기 자신과의 비교는 건너뜀
                    if (tbl[i][j] == tbl[j][i]) {
                        if (idx[i] > idx[j]) {
                            take++;
                        }
                    } else if (tbl[i][j] > tbl[j][i]) {
                        take++;
                    }
                }
            }
            max = Math.max(max, take); // max 갱신
        }

        return max;
    }

}
