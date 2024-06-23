package Algorithm.S2024.M06;

import java.util.*;

public class 신고결과받기 {

    public static void main (String [] args){

        String [] idList = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(Arrays.toString(solution(idList, report, 2)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        int[] answer = new int[n];

        // 유저 ID와 인덱스를 매핑하는 맵
        Map<String, Integer> idIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idIndexMap.put(id_list[i], i);
        }

        // 각 유저가 신고당한 횟수를 기록할 맵
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String r : report) {
            String[] parts = r.split(" ");
            String fromUser = parts[0];
            String toUser = parts[1];

            reportMap.putIfAbsent(toUser, new HashSet<>());
            reportMap.get(toUser).add(fromUser);
        }

        // 정지된 유저 리스트
        List<String> suspendedUsers = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : reportMap.entrySet()) {
            if (entry.getValue().size() >= k) {
                suspendedUsers.add(entry.getKey());
            }
        }

        // 정지된 유저를 신고한 유저에게 메일 카운트를 증가시킴
        for (String suspendedUser : suspendedUsers) {
            for (String reporter : reportMap.get(suspendedUser)) {
                answer[idIndexMap.get(reporter)]++;
            }
        }

        return answer;
    }
}
