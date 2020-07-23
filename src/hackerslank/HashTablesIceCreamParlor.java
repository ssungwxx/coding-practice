package hackerslank;

import java.util.HashMap;

public class HashTablesIceCreamParlor {
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < cost.length; i++) {
            if (!hm.containsKey(cost[i])) {
                hm.put(cost[i], i);
            }

            int spare = money - cost[i];
            if (hm.containsKey(spare)) {
                int gap = i - hm.get(spare);
                if (gap > max) {
                    max = gap;
                    start = hm.get(spare);
                    end = i;
                }
            }

        }

        System.out.printf("%d %d\n", start + 1, end + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 2};
        whatFlavors(a, 4);
    }
}
