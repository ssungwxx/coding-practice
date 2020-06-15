import java.util.Arrays;

public class P0048_RotateImage {
    public static void main(String[] args) {
        int[][] image_1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] image_2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotate(image_1);
        rotate(image_2);

        for (int i = 0; i < image_1.length; i++) {
            System.out.println(Arrays.toString(image_1[i]));
        }

        for (int i = 0; i < image_2.length; i++) {
            System.out.println(Arrays.toString(image_2[i]));
        }
    }

    public static void rotate(int[][] matrix) {
        int s = 0;
        int e = matrix.length - 1;

        while (s < e) {
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;
            e--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (i == j) continue;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
