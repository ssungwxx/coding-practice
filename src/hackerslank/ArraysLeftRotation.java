package hackerslank;

import java.util.Arrays;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(a, 4)));
    }

    static int[] rotLeft(int[] a, int d) {
        int[] res = new int[a.length];

        for(int i = 0; i < a.length; i++){
            int moveTo = i - d;

            if(moveTo < 0) moveTo += a.length;

            res[moveTo] = a[i];
        }

        return res;
    }
}
