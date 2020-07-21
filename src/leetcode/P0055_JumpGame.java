package leetcode;

public class P0055_JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1) return true;
        loop1:
        for (int i = 0; i < nums.length; i++) {
            if(i + nums[i] == nums.length - 1)return true;

            if(nums[i] == 0){
                for(int j = i - 1; j >=0;j--){
                    if(nums[j] + j > i) continue loop1;
                }
                return false;
            }
        }

        return true;
    }
}
