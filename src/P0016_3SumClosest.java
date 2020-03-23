import java.util.Arrays;

public class P0016_3SumClosest {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(a, 1)); // 2
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        loop:
        for(int i = 0; i < nums.length; i++){
            int l = 0;
            int r = nums.length - 1;

            while(l < r){
                int sum;

                if(l != i && r != i){
                    sum = nums[i] + nums[l] + nums[r];
                    if(sum == target) {
                        res = target;
                        break loop;
                    }

                    if(Math.abs(target - sum) < Math.abs(target - res)){
                        res = sum;
                    }

                    if(sum < target){
                        l++;
                    }else{
                        r--;
                    }
                }else{
                    if(l == i) l++;
                    if(r == i) r--;
                }
            }
        }

        return res;
    }
}
