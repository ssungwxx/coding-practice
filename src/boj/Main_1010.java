package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        int[][] dp = new int[30][30];

        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[1][i] = i;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = i + 1; j < 30; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
            }
        }

        for (int t = 0; t < tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[N][M]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
