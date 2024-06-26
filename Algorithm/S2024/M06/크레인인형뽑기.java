package Algorithm.S2024.M06;

import java.util.Stack;

public class 크레인인형뽑기 {
    public static void main (String[] args){
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int burstCount = 0;

        for (int move : moves) {
            int col = move - 1;
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] != 0) {
                    int pickedDoll = board[row][col];
                    board[row][col] = 0;

                    if (!basket.isEmpty() && basket.peek() == pickedDoll) {
                        basket.pop();
                        burstCount += 2;
                    } else {
                        basket.push(pickedDoll);
                    }
                    break;
                }
            }
        }
        return burstCount;
    }

}
