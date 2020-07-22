package hackerslank;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for (int i = 0; i < ar.length; i++) {
            if (max == ar[i]) cnt++;
            else if (max < ar[i]) {
                max = ar[i];
                cnt = 1;
            }

        }

        return cnt;
    }
}
