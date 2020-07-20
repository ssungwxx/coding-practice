package hackerslank;

import java.util.Arrays;
import java.util.Comparator;

public class LuckBalance {
    static int luckBalance(int k, int[][] contests) {
        int luck = 0;

        Arrays.sort(contests, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        for(int i = 0; i < contests.length; i++){
            if(contests[i][1] == 0){
                luck += contests[i][0];
            }else{
                if(k > 0){
                    luck += contests[i][0];
                    k--;
                }else{
                    luck -= contests[i][0];
                }
            }
        }

        return luck;
    }
}
