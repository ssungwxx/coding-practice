package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0047_PermutationsII {
    public static void main(String[] args) {
        int[] a = {1, 1, 2};

        List<List<Integer>> res = permuteUnique(a);

        res.stream().forEach(x -> x.stream().forEach(y -> System.out.println(y)));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        boolean[] checked = new boolean[nums.length];
        backtracking(res, nums, new ArrayList<>(), checked);

        return res;
    }

    private static void backtracking(List<List<Integer>> res, int[] nums, List<Integer> temp, boolean[] checked) {
        if (temp.size() ==nums.length){
            if(!res.contains(temp)) res.add(new ArrayList<>(temp));
        }else{
            for(int i = 0 ; i < nums.length; i++){
                if(checked[i]) continue;
                temp.add(nums[i]);
                checked[i] = true;
                backtracking(res, nums, temp, checked);
                temp.remove(temp.size() - 1);
                checked[i] = false;
            }
        }
    }
}
