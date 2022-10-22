package datastructure;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char [][] board = new char[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }

        char [][] boardTwo = new char[][] {
          new char[] {'O', '-', '-'},
          new char[] {'O', '-', '-'},
          new char[] {'O', '-', '-'},
        };

        System.out.println(Arrays.deepToString(boardTwo));

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        System.out.println(Arrays.deepToString(board));
    }
}
