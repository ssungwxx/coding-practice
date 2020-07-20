package leetcode;

import javax.sound.sampled.Line;
import java.util.*;

public class P0046_Permutations {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        List<List<Integer>> res = permute(a);

        for(List<Integer> elem : res){
            elem.stream().forEach(x -> System.out.println(x));
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtracking(res, new ArrayList<>(), nums);

        return res;
    }

    public static void backtracking(List<List<Integer>> res, List<Integer> elem, int[] nums) {
        if(elem.size() == nums.length) {
            res.add(new ArrayList<>(elem));
        }else{
            for(int i = 0 ; i < nums.length; i++){
                if(elem.contains(nums[i])) continue;
                elem.add(nums[i]);
                backtracking(res, elem, nums);
                elem.remove(elem.size() - 1);
            }
        }
    }
}
