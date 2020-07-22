package hackerslank;

import java.util.HashMap;

public class MinimumDistances {
    static int minimumDistances(int[] a) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i])) {
                res = Math.min(res, i - hm.get(a[i]));
                hm.replace(i, a[i]);
            } else {
                hm.put(a[i], i);
            }
        }

        if (res == Integer.MAX_VALUE) res = -1;

        return res;
    }
}
