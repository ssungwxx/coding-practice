package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class P0014_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] a = {"abcc", "abwqd", "abqwaasads"};
        String[] b = {"qfwqf", "fasv", "qwdas"};
        System.out.println(longestCommonPrefix(a));
        System.out.println(longestCommonPrefix(b));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        char[] result = strs[0].toCharArray();

        for (int i = 1; i < strs.length; i++) {
            StringBuilder sb = new StringBuilder();
            char[] compare = strs[i].toCharArray();

            for (int j = 0; j < Math.min(compare.length, result.length); j++) {
                if(compare[j] == result[j]) sb.append(compare[j]);
                else break;
            }

            if(sb.length() < result.length) result = sb.toString().toCharArray();
        }


        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i < result.length; i++) sb.append(result[i]);

        return sb.toString();
    }
}
