package Algorithm.S2024.M08;

import java.util.*;

public class 튜플 {
    public static void main (String [] args){
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(solution("{{20,111},{111}}")));

    }
    public static int[] solution(String s) {
        //문자열에서 '{', '}', ','를 제거
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] sets = s.split("-");

        Arrays.sort(sets, Comparator.comparingInt(String::length));

        //순서대로 숫자를 추출
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (String set : sets) {
            String[] numbers = set.split(",");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                // 튜플에 없는 숫자라면 추가
                if (!seenNumbers.contains(num)) {
                    seenNumbers.add(num);
                    resultList.add(num);
                }
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
