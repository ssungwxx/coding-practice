import java.util.Stack;

public class P0007_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(210));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();

        boolean is = false;

        for (char c : Integer.toString(x).toCharArray()) {
            if (c == '-') {
                is = true;
            } else {
                sb.insert(0, c);
            }
        }

        long result = Long.parseLong(sb.toString());
        if (is) result = 0 - result;

        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;

        return (int)result;
    }
}
