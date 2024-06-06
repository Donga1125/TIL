package Algorithm.S2024;
import java.util.*;
public class 다트게임 {

    public static void main (String[]args){
        System.out.println(solution("1S2D*3T"));
    }
    public static int solution(String dartResult) {
        // 점수를 저장할 리스트
        List<Integer> scores = new ArrayList<>();

        // 점수를 계산할 임시 변수
        int score = 0;

        // 문자열을 파싱하기 위한 인덱스
        int i = 0;

        while (i < dartResult.length()) {
            // 현재 문자가 숫자인지 확인
            if (Character.isDigit(dartResult.charAt(i))) {
                // 숫자를 처리 (10일 경우를 고려)
                if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                    score = 10;
                    i += 2;
                } else {
                    score = dartResult.charAt(i) - '0';
                    i++;
                }
            }

            // 보너스를 처리
            if (dartResult.charAt(i) == 'S') {
                score = (int) Math.pow(score, 1);
            } else if (dartResult.charAt(i) == 'D') {
                score = (int) Math.pow(score, 2);
            } else if (dartResult.charAt(i) == 'T') {
                score = (int) Math.pow(score, 3);
            }
            i++;

            // 옵션을 처리 (옵션은 있을 수도 없을 수도 있음)
            if (i < dartResult.length() && (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')) {
                if (dartResult.charAt(i) == '*') {
                    score *= 2;
                    if (!scores.isEmpty()) {
                        int lastIndex = scores.size() - 1;
                        scores.set(lastIndex, scores.get(lastIndex) * 2);
                    }
                } else if (dartResult.charAt(i) == '#') {
                    score *= -1;
                }
                i++;
            }

            // 계산된 점수를 리스트에 추가
            scores.add(score);
        }

        // 총 점수를 계산하여 반환
        int totalScore = 0;
        for (int s : scores) {
            totalScore += s;
        }

        return totalScore;
    }
}
