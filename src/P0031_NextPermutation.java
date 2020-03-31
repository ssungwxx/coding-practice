import java.util.Arrays;

public class P0031_NextPermutation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        int[] c = {1, 1, 5};

        nextPermutation(a);
        System.out.println(Arrays.toString(a));

        nextPermutation(b);
        System.out.println(Arrays.toString(b));

        nextPermutation(c);
        System.out.println(Arrays.toString(c));
    }

    public static void nextPermutation(int[] nums) {
        int increase = nums.length - 1;

        for (; increase > 0; increase--) {
            if (nums[increase - 1] < nums[increase]) break;
        }

        if (increase == 0) {
            Arrays.sort(nums);
            return;
        }
        increase--;

        int larger = nums.length - 1;

        while(increase<larger){
            if(nums[increase] < nums[larger]) break;
            larger--;
        }

        swap(nums, increase, larger);

        int l = increase + 1, r = nums.length - 1;

        while(l < r){
            swap(nums, l++, r--);
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

