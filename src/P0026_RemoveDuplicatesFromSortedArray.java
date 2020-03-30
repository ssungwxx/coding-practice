public class P0026_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1,1,2};
        int[] b = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(a));
        System.out.println(removeDuplicates(b));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int res = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[res]) {
                res++;
                nums[res] = nums[i];
            }
        }

        return res + 1;
    }
}
