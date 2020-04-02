public class P0033_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2,3};
        System.out.println(search(a, 0));
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;

        while(l < r){
            int mid = (l + r) / 2;
            if(nums[mid] > nums[r]) l = mid + 1;
            else r = mid;
        }

        int pivot = l;
        l = 0;
        r = n - 1;

        while(l <= r){
            int mid = (l + r) / 2;
            int realMid = (mid + pivot) % n;

            if(nums[realMid] == target) return realMid;

            if(nums[realMid] < target) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}
