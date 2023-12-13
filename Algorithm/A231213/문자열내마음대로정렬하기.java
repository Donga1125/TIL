package Algorithm.A231213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열내마음대로정렬하기 {
    public static void main(String args[]) {

        System.out.println(solution(new String[]{"sun", "bed", "car"}, 1));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings); //입력받은 배열 정렬

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n + 1); //n번째 인덱스부터 짤라서 정렬
        }
        Arrays.sort(answer);

        List<String> list = new ArrayList<>(Arrays.asList(strings));

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).substring(n, n + 1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        return answer;
    }
}


