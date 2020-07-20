package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P0018_4Sum {
    public static void main(String[] args) {
        int[] a = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(a, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        len = nums.length;
        List<List<Integer>> res = nSum(nums, target, 4, 0);

        return res;
    }

    public static int len;

    public static List<List<Integer>> nSum(int[] nums, int target, int k, int idx) {
        List<List<Integer>> res = new LinkedList<>();

        if (k == 2) {
            int l = idx;
            int r = len - 1;

            while (l < r) {
                if (target - nums[l] == nums[r]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++; r--;
                }else if(target - nums[l] < nums[r]){
                    r--;
                }else l++;
            }
        } else {
            for(int i = idx; i < len - k + 1; i++){
                List<List<Integer>> temp = nSum(nums, target - nums[i], k -1, i+1);

                if(temp != null){
                    for (List<Integer> t:temp) {
                        t.add(0, nums[i]);
                    }

                    res.addAll(temp);
                }

                while(i < len - 1 && nums[i] == nums[i+1]) i++;
            }
        }

        return res;
    }
}
