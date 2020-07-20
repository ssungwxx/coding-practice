package hackerslank;

public class NewYearChaos {
    static void minimumBribes(int[] q) {
        int cnt = 0;

        for(int i = q.length -1; i >= 0 ;i--){
            if(q[i]  > i + 3){
                System.out.println("Too chaotic");
                return;
            }

            for(int j = Math.max(0, q[i] - 2); j < i; j++){
                if(q[j] > q[i]) cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 3, 4};

        minimumBribes(a);
    }
}
