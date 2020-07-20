package leetcode;

import java.util.HashSet;

public class P0003_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> list = new HashSet<>();

            list.add(s.charAt(i));
            int length = 1;

            for (int j = i + 1; j < s.length(); j++) {
                char now = s.charAt(j);
                if (list.contains(now)) {
                    break;
                } else {
                    length++;
                    list.add(now);
                }
            }

            maxLength = maxLength < length ? length : maxLength;
        }

        return maxLength;
    }
}
