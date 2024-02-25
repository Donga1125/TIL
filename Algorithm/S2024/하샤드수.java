package Algorithm.S2024;

public class 하샤드수 {
        public static boolean solution(int x) {
            // x를 문자열로 변환하여 각 자릿수를 분리하고 합산
            int digitSum = 0;
            String strX = Integer.toString(x);
            for (int i = 0; i < strX.length(); i++) {
                digitSum += Character.getNumericValue(strX.charAt(i));
            }

            // x가 자릿수의 합으로 나누어지는지 확인
            if (x % digitSum == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            // 테스트
            System.out.println(solution(10)); // true
            System.out.println(solution(12)); // true
            System.out.println(solution(11)); // false
            System.out.println(solution(13)); // false
        }
    }


