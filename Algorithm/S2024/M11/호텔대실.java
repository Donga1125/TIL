package Algorithm.S2024.M11;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 호텔대실 {
    public static void main (String[] args){
        String[][] bookTime1 = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        String[][] bookTime2 = {{"09:10", "10:10"}, {"10:20", "12:20"}};
        String[][] bookTime3 = {{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}};


        System.out.println(solution(bookTime1));
        System.out.println(solution(bookTime2));
        System.out.println(solution(bookTime3));
    }

    public static int solution(String[][] book_time) {
        // 예약 시간을 분 단위로 변환
        int[][] bookings = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            bookings[i][0] = toMinutes(book_time[i][0]);  // 시작 시간
            bookings[i][1] = toMinutes(book_time[i][1]) + 10;  // 종료 시간 + 10분 청소 시간
        }

        // 시작 시간 기준으로 정렬
        Arrays.sort(bookings, (a, b) -> Integer.compare(a[0], b[0]));

        // 우선순위 큐 (종료 시간이 빠른 순으로 정렬)
        PriorityQueue<Integer> roomEndTimes = new PriorityQueue<>();

        for (int[] booking : bookings) {
            int start = booking[0];
            int end = booking[1];

            // 가장 먼저 사용할 수 있는 객실의 종료 시간이 현재 예약의 시작 시간보다 작거나 같다면 재사용 가능
            if (!roomEndTimes.isEmpty() && roomEndTimes.peek() <= start) {
                roomEndTimes.poll();
            }

            // 현재 예약을 위한 종료 시간 추가
            roomEndTimes.add(end);
        }

        // 큐에 남아 있는 종료 시간의 개수가 필요한 객실 수
        return roomEndTimes.size();
    }

    // 시간을 분 단위로 변환하는 헬퍼 메소드
    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

}
