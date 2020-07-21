package hackerslank;

import java.util.Arrays;

public class MaxMin {
    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);

        int res = arr[k - 1] - arr[0];

        for (int i = 1; i < arr.length - k + 1; i++) {
            if (i + k - 1> arr.length - 1) break;
            res = (arr[i + k - 1] - arr[i]) < res ? (arr[i + k - 1] - arr[i]) : res;
        }

        return res;
    }
}
