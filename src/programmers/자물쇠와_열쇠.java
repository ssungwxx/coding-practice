package programmers;

import java.util.Arrays;

public class 자물쇠와_열쇠 {
    public static boolean solution(int[][] key, int[][] lock) {
        int N = lock.length;

        int[][] newLock = new int[N * 3][N * 3];

        boolean flag = true;
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N; j++){
                if(lock[i][j] != 1) {
                    flag = false;
                }
            }
        }
        if(flag) return true;

        for (int i = N; i < N * 2; i++) {
            for (int j = N; j < N * 2; j++) {
                newLock[i][j] = lock[i - N][j - N];
            }
        }

        for (int rotate = 0; rotate < 4; rotate++) {
            for (int i = 0; i < 2 * N; i++) {
                for (int j = 0; j < 2 * N; j++) {
                    keyToLock(newLock, key, i, j);
                    if (isCorrect(newLock, N)) return true;
                    rollback(newLock, key, i, j);
                }
            }

            key = rotate(key);
        }

        return false;
    }

    public static void keyToLock(int[][] lock, int[][] key, int i, int j) {
        for (int x = i; x < i + key.length; x++) {
            for (int y = j; y < j + key.length; y++) {
                lock[x][y] += key[x - i][y - j];
            }
        }
    }

    public static void rollback(int[][] lock, int[][] key, int i, int j) {
        for (int x = i; x < i + key.length; x++) {
            for (int y = j; y < j + key.length; y++) {
                lock[x][y] -= key[x - i][y - j];
            }
        }
    }

    public static boolean isCorrect(int[][] lock, int N) {
        for (int i = N; i < N * 2; i++) {
            for (int j = N; j < N * 2; j++) {
                if (lock[i][j] != 1) return false;
            }
        }

        return true;
    }

    public static int[][] rotate(int[][] arr) {
        int n = arr.length;
        int[][] rotate = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[i][j] = arr[n - 1 - j][i];
            }
        }

        return rotate;
    }

    public static void main(String[] args) {
        int[][] a = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] b = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        System.out.println(solution(a, b));
    }
}
