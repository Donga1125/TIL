package Algorithm.S2024.M08;

import java.util.Arrays;

public class 쿼드압축후개수세기 {
    public static void main (String[] args){
        int[][] arr1 = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[][] arr2 = {{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};

        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));

    }

    public static int[] solution(int[][] arr) {
        int[] answer = compress(arr, 0, 0, arr.length);
        return answer;
    }

    // 특정 영역을 압축하는 메서드
    private static int[] compress(int[][] arr, int x, int y, int size) {
        int firstValue = arr[x][y];
        boolean isSame = true;

        // 주어진 영역의 모든 값이 같은지 확인
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != firstValue) {
                    isSame = false;
                    break;
                }
            }
            if (!isSame) break;
        }

        // 모든 값이 동일하면 0 또는 1의 개수를 반환
        if (isSame) {
            if (firstValue == 0) {
                return new int[]{1, 0};  // 0의 개수, 1의 개수
            } else {
                return new int[]{0, 1};
            }
        }

        // 값이 다르면 4개의 영역으로 분할하여 재귀적으로 압축
        int newSize = size / 2;
        int[] topLeft = compress(arr, x, y, newSize);
        int[] topRight = compress(arr, x, y + newSize, newSize);
        int[] bottomLeft = compress(arr, x + newSize, y, newSize);
        int[] bottomRight = compress(arr, x + newSize, y + newSize, newSize);

        // 각 영역에서 반환된 결과를 합산
        int zeroCount = topLeft[0] + topRight[0] + bottomLeft[0] + bottomRight[0];
        int oneCount = topLeft[1] + topRight[1] + bottomLeft[1] + bottomRight[1];

        return new int[]{zeroCount, oneCount};
    }
}
