package Algorithm.S2024.M08;

import java.util.*;

public class 오픈채팅방 {
    public static void main (String[] args){
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };

        System.out.println(Arrays.toString(solution(record)));

    }

    public static String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        List<String> messageLog = new ArrayList<>();

        // 기록을 순회하여 유저 상태를 업데이트
        for (String entry : record) {
            String[] parts = entry.split(" ");
            String command = parts[0];
            String userId = parts[1];

            if (command.equals("Enter") || command.equals("Change")) {
                //유저의 닉네임을 최신으로 업데이트
                String nickname = parts[2];
                userMap.put(userId, nickname);
            }
        }

        // 메시지 기록을 다시 순회하여 최종 메시지 목록을 생성
        for (String entry : record) {
            String[] parts = entry.split(" ");
            String command = parts[0];
            String userId = parts[1];

            if (command.equals("Enter")) {
                // 입장 메시지 생성
                messageLog.add(userMap.get(userId) + "님이 들어왔습니다.");
            } else if (command.equals("Leave")) {
                // 퇴장 메시지 생성
                messageLog.add(userMap.get(userId) + "님이 나갔습니다.");
            }
        }

        return messageLog.toArray(new String[0]);
    }
}
