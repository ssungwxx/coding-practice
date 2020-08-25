package leetcode;

public class P0053_MaximumSubarray {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for(int num : nums){
            if(curSum < 0)
                curSum = 0;
            curSum += num;
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
