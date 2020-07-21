package hackerslank;

import java.util.Arrays;

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        int cost = 0;
        int person = 1;

        Arrays.sort(c);

        for(int i = c.length - 1; i >= 0; i-=k){
            for(int j = i; j > Math.max(i - k, -1); j--){
                cost += person * c[j];
            }
            person++;
        }

        return cost;
    }
}
