package leetcode;

public class P0013_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i = 0; i < s.length() ; i++){
            String sub1 = s.substring(i, i + 1);
            String sub2 = i == s.length() - 1 ? "" : s.substring(i, i + 2);
            boolean flag = false;

            for(int j = 1; j < roman.length; j +=2){
                if(sub2.equals(roman[j])) {
                    result += romanInt[j];
                    flag = true;
                    i++;
                    continue;
                }
            }

            if(!flag){
                for(int j = 0; j < roman.length; j +=2){
                    if(sub1.equals(roman[j])) {
                        result += romanInt[j];
                        continue;
                    }
                }
            }
        }

        return result;
    }
}
