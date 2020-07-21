package hackerslank;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 ) positive++;
            else if(arr[i] < 0 ) negative++;
            else zero++;
        }

        System.out.printf("%f\n",(float)positive / arr.length);
        System.out.printf("%f\n",(float)negative / arr.length);
        System.out.printf("%f\n",(float)zero / arr.length);
    }
}
