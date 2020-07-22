package hackerslank;

public class BeautifulTriplets {
    static int beautifulTriplets(int d, int[] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for(int j = i + 1; j < arr.length - 1; j++){
                if(arr[j] > arr[i] + d) continue;
                if(arr[j] == arr[i] + d){
                    for(int k = j + 1; k < arr.length; k++){
                        if(arr[k] == arr[j] + d) cnt++;
                        if(arr[k] > arr[j] + d) continue;
                    }
                }
            }
        }

        return cnt;
    }
}
