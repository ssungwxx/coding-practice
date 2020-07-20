package leetcode;

public class P0035_SearchInsertPosition {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};

        System.out.println(searchInsert(a, 3));
        System.out.println(searchInsert(a, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int res = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res = i;
                break;
            }

            if(nums[i] > target){
                res = i;
                break;
            }
        }

        if(res == -1) res = nums.length;

        return res;
    }
}
