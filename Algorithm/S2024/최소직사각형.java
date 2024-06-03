package Algorithm.S2024;

public class 최소직사각형 {
    public static void main (String[]args){
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            // 짧은 길이는 가로, 긴 길이는 세로로 정렬
            int minSide = Math.min(w, h);
            int maxSide = Math.max(w, h);

            // 현재까지의 최대 가로 길이와 최대 세로 길이를 갱신
            maxWidth = Math.max(maxWidth, minSide);
            maxHeight = Math.max(maxHeight, maxSide);
        }

        // 결과로 최소 지갑 크기 반환
        return maxWidth * maxHeight;

    }
}
