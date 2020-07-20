package hackerslank;

public class H_2DArrayDS {
    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                int sum = eachSum(arr, i, j);
                maxSum = maxSum < sum ? sum : maxSum;
            }
        }

        return maxSum;
    }

    public static int eachSum(int[][] arr, int x, int y) {
        return arr[x][y] + arr[x][y + 1] + arr[x][y + 2] +
                arr[x + 1][y + 1] +
                arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];
    }
}
