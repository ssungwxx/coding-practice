package leetcode;

public class P0005_LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if(s.equals("")) return "";

        int maxLength = 0;
        String result = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (j - i <= maxLength) {
                    continue;
                } else {
                    String sub = s.substring(i, j);
                    if (checkPalindromic(sub)) {
                        maxLength = sub.length();
                        result = sub;
                    }
                }
            }
        }

        return result;
    }

    public static boolean checkPalindromic(String s) {
        boolean flag = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
