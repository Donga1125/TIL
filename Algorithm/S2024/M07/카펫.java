package Algorithm.S2024.M07;

import java.util.Arrays;

public class 카펫 {
    public static void main (String[] args){
        System.out.println(Arrays.toString(solution(10,2)));
        System.out.println(Arrays.toString(solution(8,1)));
        System.out.println(Arrays.toString(solution(24,24)));
    }
    public static int[] solution(int brown, int yellow) {
            int total = brown + yellow;

            for (int height = 3; height <= total / height; height++) {
                // 전체 격자 수를 나누어서 너비를 계산
                if (total % height == 0) {
                    int width = total / height;

                    // 조건 검증: (width - 2) * (height - 2) == yellow
                    if ((width - 2) * (height - 2) == yellow) {
                        return new int[] { width, height };
                    }
                }
            }

            return null;
        }
    }

