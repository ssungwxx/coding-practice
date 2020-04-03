import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P0040_CombinationSumII {
    public static void main(String[] args) {
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> res = combinationSum2(a, 8);

        for (List<Integer> list : res) {
            for (int num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<String> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        comb(res, new ArrayList<>(), candidates, 0, target, set);

        return res;
    }

    public static void comb(List<List<Integer>> res, List<Integer> temp, int[] candidates, int point, int target, HashSet<String> set) {
        if (target > 0 && point < candidates.length) {
            temp.add(candidates[point]);
            comb(res, temp, candidates, point + 1, target - candidates[point], set);
            temp.remove(temp.size() - 1);
            comb(res, temp, candidates, point + 1, target, set);
        } else if (target == 0) {
            StringBuilder sb = new StringBuilder();
            for (int num:temp) {
                sb.append(num).append(" ");
            }
            if(set.add(sb.toString())){
                res.add(new ArrayList<>(temp));
            }
        }
    }
}
