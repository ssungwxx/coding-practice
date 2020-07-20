package leetcode;

import java.util.Arrays;

public class P0004_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3};

        int[] c = {1, 2};
        int[] d = {3, 4};

        System.out.println(findMedianSortedArrays(a, b));
        System.out.println(findMedianSortedArrays(c, d));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            nums3[nums1.length + i] = nums2[i];
        }

        Arrays.sort(nums3);

        if (nums3.length % 2 == 0) {
            double sum = (double) (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2]) / 2;
            return sum;
        } else {
            return nums3[nums3.length / 2];
        }
    }
}
