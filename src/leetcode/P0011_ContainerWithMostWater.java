package leetcode;

public class P0011_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length - 1; i++){
            for(int j = i+1; j < height.length; j++){
                int minHeight = Math.min(height[i], height[j]);
                int water = minHeight * (j - i);
                max = water > max ? water : max;
            }
        }

        return max;
    }
}
