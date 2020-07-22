package hackerslank;

import java.util.StringTokenizer;

public class TimeConversion {
    static String timeConversion(String s) {
        char[] arr = s.toCharArray();
        if (arr[8] == 'P') {
            if (!(arr[0] == '1' && arr[1] == '2')) {
                arr[0] += 1;
                arr[1] += 2;
                if (arr[1] > '9') {
                    arr[1] -= 10;
                    arr[0] += 1;
                }
            }
        } else if (arr[8] == 'A' && arr[0] == '1' && arr[1] == '2') {
            arr[0] = '0';
            arr[1] = '0';
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
