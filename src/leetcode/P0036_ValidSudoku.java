package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0036_ValidSudoku {
    public static void main(String[] args) {
        char[][] a = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] b = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] c = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(isValidSudoku(a));
        System.out.println(isValidSudoku(b));
        System.out.println(isValidSudoku(c));
    }

    public static boolean isValidSudoku(char[][] board) {
        return isValidInRows(board) && isValidInColumns(board) && isValidInArea(board);
    }

    public static boolean isValidInRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> isRowRepetition = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int rowNum = board[i][j];
                if (isRowRepetition.contains(rowNum) && rowNum != '.') return false;

                isRowRepetition.add(rowNum);
            }
        }

        return true;
    }

    public static boolean isValidInColumns(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> isColumnRepetition = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                int columnNum = board[j][i];
                if (isColumnRepetition.contains(columnNum) && columnNum != '.') return false;

                isColumnRepetition.add(columnNum);
            }
        }

        return true;
    }

    public static boolean isValidInArea(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Integer> isAreaRepetition = new HashSet<>();

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int areaNum = board[i + k][j + l];
                        if (isAreaRepetition.contains(areaNum) && areaNum != '.') return false;
                        isAreaRepetition.add(areaNum);
                    }
                }
            }
        }

        return true;
    }
}
