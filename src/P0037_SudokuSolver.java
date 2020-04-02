import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P0037_SudokuSolver {
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

        solveSudoku(a);
        System.out.println(Arrays.deepToString(a));
    }

    public static void solveSudoku(char[][] board) {
        findAnswerBoard(board, 0, 0);
    }

    public static boolean findAnswerBoard(char[][] board, int row, int column) {
        for (int i = row; i < 9; i++, column=0) {
            for (int j = column; j < 9; j++) {
                if (board[i][j] != '.') continue;

                for (char k = '1'; k <= '9'; k++) {
                    if (isValidSutoku(board, i, j, k)) {
                        board[i][j] = k;

                        if (findAnswerBoard(board, row, column + 1)) return true;

                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }


    public static boolean isValidSutoku(char[][] board, int row, int column, char input) {
        int rowArea = 3 * (row / 3);
        int columnArea = 3 * (column / 3);

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == input) return false;
            if (board[i][column] == input) return false;
            if (board[rowArea + i / 3][columnArea + i % 3] == input) return false;
        }

        return true;
    }
}
