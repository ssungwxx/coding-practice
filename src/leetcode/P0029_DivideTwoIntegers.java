package leetcode;

public class P0029_DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(-2147483648, -1));
        System.out.println(divide(-1,-1));
    }

    public static int divide(int dividend, int divisor) {
        long res = (long)dividend / (long)divisor;

        if(res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
        return (int)res;
    }
}
