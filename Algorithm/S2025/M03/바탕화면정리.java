package Algorithm.S2025.M03;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main (String [] args){

        String[] str1 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] str2 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] str3 = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution(str1)));
        System.out.println(Arrays.toString(solution(str2)));
        System.out.println(Arrays.toString(solution(str3)));

    }

    public static int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE, rdy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                    }
            }
        }

        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}

