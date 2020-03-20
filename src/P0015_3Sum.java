import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P0015_3Sum {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i >0 && nums[i] == nums[i-1]) continue;

            int target = -nums[i];
            int l = i + 1, r = nums.length - 1;

            while (l < r) {
                if (nums[l] + nums[r] > target) {
                    r--;
                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r &&nums[r] == nums[r + 1]) r--;
                }
            }
        }

        return res;
    }
}
