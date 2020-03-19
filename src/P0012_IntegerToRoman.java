public class P0012_IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));

    }

    public static String intToRoman(int num) {
        int[] div = {1000, 500, 100, 50, 10, 5, 1};
        String[] roman = {"M", "D", "C", "L", "X", "V", "I"};

        StringBuilder sb = new StringBuilder();

        int t = 0;
        while (num > 0) {
            int p = num / div[t];
            char first = Integer.toString(num).charAt(0);

            if (first == '4' && p > 0) {
                num = num - (div[t] * p);
                sb.append(roman[t]);
                sb.append(roman[t - 1]);
            } else if (first == '9' && p > 0) {
                num = num - ((first - '0') * div[t + 1]);
                sb.append(roman[t + 1]);
                sb.append(roman[t - 1]);
            } else {
                num = num - (div[t] * p);
                for (int i = 0; i < p; i++) sb.append(roman[t]);
                t++;
            }

        }

        return sb.toString();
    }
}
