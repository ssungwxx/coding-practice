package hackerslank;

import java.util.Arrays;

public class MinimumSwaps2 {
    static int minimumSwaps(int[] arr) {
        int cnt = 0;
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        boolean[] checked = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(checked[i]) continue;

            if(arr[i] == sortedArr[i]){
                checked[i] = true;
            }else{
                int start = i;
                int loop = arr[i];
                checked[i] = true;

                while(loop - 1 != start){
                    checked[loop - 1] = true;
                    loop = arr[loop - 1];

                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] a = {7,1,3,2,4,5,6};
        System.out.println(minimumSwaps(a));
    }
}
