public class P0027_RemoveElement {
    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3};
        System.out.println(removeElement(a, 3));
        int[] b = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(b, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int point = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[point++] = nums[i];
            }
        }

        return point;
    }
}
