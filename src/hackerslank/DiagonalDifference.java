package hackerslank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if (i == j) left += arr.get(i).get(j);
                if (arr.size() - 1 == i + j) right += arr.get(i).get(j);
            }
        }

        return Math.abs(left - right);
    }
}
