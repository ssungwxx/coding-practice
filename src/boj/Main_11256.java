package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11256 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());

            int J = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int[] boxes = new int[N];

            for(int n = 0; n < N; n++){
                st = new StringTokenizer(br.readLine().trim());

                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                boxes[n] = r * c;
            }

            Arrays.sort(boxes);
            int cnt = 0;

            while(J > 0){
                J -= boxes[--N];
                cnt++;
            }

            sb.append(cnt);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
