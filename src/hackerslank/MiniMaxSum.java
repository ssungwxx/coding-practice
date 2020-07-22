package hackerslank;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        long min = arr[0];
        long max = arr[0];
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.printf("%d %d", (sum - max), (sum - min));
    }
}
