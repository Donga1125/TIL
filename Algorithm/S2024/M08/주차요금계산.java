package Algorithm.S2024.M08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 주차요금계산 {
    public static void main (String[]args){
        // 차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수 배열에 담아서 return
        //기본 시간(분)	기본 요금(원)	단위 시간(분)	단위 요금(원)
        //시각(시:분)	차량 번호	내역
        int [] fee1 = {180, 5000, 10, 600};
        String [] records1 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        int [] fee2 = {120, 0, 60, 591};
        String [] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};

        int [] fee3 = {1, 461, 1, 10};
        String [] records3 = {"00:00 1234 IN"};

        System.out.println(Arrays.toString(solution(fee1, records1)));
        System.out.println(Arrays.toString(solution(fee2, records2)));
        System.out.println(Arrays.toString(solution(fee3, records3)));


    }

    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();

        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        for (String record : records){
            String[] tmp = record.split(" ");
            int time = getRealTime(tmp[0]);
            String carNum = tmp[1];
            String io = tmp[2];

            if (io.equals("IN")){
                map1.put(carNum, time);
            }else {
                int carTime1 = map1.get(carNum);
                map1.remove(carNum);
                if (map2.containsKey(carNum)){
                    int carTime2 = map2.get(carNum);
                    map2.replace(carNum, carTime2+time - carTime1);

                }else {
                    map2.put(carNum, time - carTime1);
                }
            }
        }

        int lastTime = 1439; //23:59
        for (String car : map1.keySet()){
            int carTime1 = map1.get(car);
            if (map2.containsKey(car)){
                int carTime2 = map2.get(car);
                map2.replace(car, carTime2 + lastTime - carTime1);
            }else {
                map2.put(car, lastTime - carTime1);
            }
        }

        Object[] sortKey = map2.keySet().toArray(); // 차 번호 순서대로 정렬
        Arrays.sort(sortKey);
        answer = new int[sortKey.length];

        for (int i = 0; i<answer.length; i++){
            int result = baseFee;
            String car = String.valueOf(sortKey[i]);
            int val = map2.get(car);
            if (val > baseTime) {
                result = (int) (baseFee + Math.ceil((double)(val-baseTime)/unitTime) * unitFee);
            }
            answer[i] = result;
        }

        return answer;

    }

    public static int getRealTime(String time) {
        String[] tmp = time.split(":");
        int hour = Integer.parseInt(tmp[0]) * 60;
        int minute = Integer.parseInt(tmp[1]);
        return hour + minute;
    }
}
