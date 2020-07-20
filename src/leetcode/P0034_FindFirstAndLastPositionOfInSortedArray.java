package leetcode;

import java.util.Arrays;

public class P0034_FindFirstAndLastPositionOfInSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.out.println(Arrays.toString(searchRange(nums, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];

        res[0] = findFirstPosition(nums, target);
        res[1] = findLastPosition(nums, target);

        return res;
    }

    public static int findFirstPosition(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int res = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;

            if (nums[mid] == target) res = mid;
        }

        return res;
    }

    public static int findLastPosition(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int res = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;

            if (nums[mid] == target) res = mid;
        }

        return res;
    }
}
