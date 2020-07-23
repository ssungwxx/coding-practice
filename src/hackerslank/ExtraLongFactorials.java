package hackerslank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger res = BigInteger.ONE;

        for(int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }

        System.out.println(res.toString());
    }
}
