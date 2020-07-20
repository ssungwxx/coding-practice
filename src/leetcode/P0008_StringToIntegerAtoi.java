package leetcode;

public class P0008_StringToIntegerAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("42")); // 42
        System.out.println(myAtoi("     -42")); // -42
        System.out.println(myAtoi("4193 with words")); // 4193
        System.out.println(myAtoi("words and 987")); // 0
        System.out.println(myAtoi("-91283472332")); // -2147483648
        System.out.println(myAtoi("9223372036854775808")); //
    }

    public static int myAtoi(String str) {
        long result = 0;
        long sign = 1;

        int i = 0;
        char[] arr = str.toCharArray();

        while (i < arr.length && arr[i] == ' ') {
            i++;
        }

        if (i < arr.length && (arr[i] == '+' || arr[i] == '-')) {
            sign = arr[i] == '-' ? -1 : 1;
            i++;
        }

        for (; i < arr.length; i++) {
            if (arr[i] < '0' || arr[i] > '9') {
                break;
            }
            result = result * 10 + (arr[i] - '0');

            if (result * sign > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
                break;
            }
            if (result * sign < Integer.MIN_VALUE) {
                result = Integer.MIN_VALUE;
                break;
            }
        }

        if (sign == -1 && result > 0) result = 0 - result;

        return (int) result;
    }
}
