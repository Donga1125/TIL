package Algorithm.S2024.M09;

import java.util.Arrays;

public class 파일명정렬하기 {
    public static void main (String[] args){
        System.out.println(Arrays.toString(solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        System.out.println(Arrays.toString(solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})));

    }
    public static String[] solution(String[] files) {
        // 정규 표현식을 통해 파일명을 HEAD, NUMBER로 나누는 패턴
        return Arrays.stream(files)
                .sorted((file1, file2) -> {
                    // 파일명을 HEAD, NUMBER, TAIL로 나누기
                    String[] parsed1 = parseFile(file1);
                    String[] parsed2 = parseFile(file2);

                    // HEAD를 대소문자 구분 없이 비교
                    int headComparison = parsed1[0].compareToIgnoreCase(parsed2[0]);
                    if (headComparison != 0) {
                        return headComparison;
                    }

                    // NUMBER 비교 (숫자로 변환 후 비교)
                    int number1 = Integer.parseInt(parsed1[1]);
                    int number2 = Integer.parseInt(parsed2[1]);
                    return Integer.compare(number1, number2);
                })
                .toArray(String[]::new);
    }

    // 파일명을 HEAD, NUMBER, TAIL로 분리하는 함수
    private static String[] parseFile(String file) {
        String head = "";
        String number = "";
        int i = 0;

        // HEAD 추출: 숫자가 나오기 전까지의 문자열
        while (i < file.length() && !Character.isDigit(file.charAt(i))) {
            head += file.charAt(i);
            i++;
        }

        // NUMBER 추출: 최대 5자리 숫자까지 추출
        while (i < file.length() && Character.isDigit(file.charAt(i))) {
            number += file.charAt(i);
            i++;
            if (number.length() >= 5) break;
        }

        // 반환값은 [HEAD, NUMBER]로 구성
        return new String[] { head, number };
    }

}
