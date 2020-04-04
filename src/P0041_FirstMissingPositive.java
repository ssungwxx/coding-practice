import java.util.HashSet;
import java.util.Set;

public class P0041_FirstMissingPositive {
    public static void main(String[] args) {
        int[] a = {-1,3,5,4};

        System.out.println(firstMissingPositive(a));
    }

    public static int firstMissingPositive(int[] nums) {
        int res = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length;i++){
            if(nums[i] <= 0) continue;
            set.add(nums[i]);
        }

        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(!set.contains(i)){
                res = i;
                break;
            }
        }

        return res;
    }
}
