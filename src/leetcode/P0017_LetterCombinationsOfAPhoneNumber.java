package leetcode;

import java.util.*;

public class P0017_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23")); // ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<Character>[] phone = new ArrayList[10];

        phone[2] = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        phone[3] = new ArrayList<>(Arrays.asList('d', 'e', 'f'));
        phone[4] = new ArrayList<>(Arrays.asList('g', 'h', 'i'));
        phone[5] = new ArrayList<>(Arrays.asList('j', 'k', 'l'));
        phone[6] = new ArrayList<>(Arrays.asList('m', 'n', 'o'));
        phone[7] = new ArrayList<>(Arrays.asList('p', 'q', 'r', 's'));
        phone[8] = new ArrayList<>(Arrays.asList('t', 'u', 'v'));
        phone[9] = new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z'));

        List<String> res = new LinkedList<>();

        if (digits.length() > 0) addList(digits, 0, res, phone, "");

        Collections.sort(res);

        return res;
    }

    public static void addList(String digits, int idx, List<String> res, ArrayList<Character>[] phone, String s) {
        if (idx == digits.length() - 1) {
            for (int i = 0; i < phone[digits.charAt(idx) - '0'].size(); i++) {
                String ns = s + phone[digits.charAt(idx) - '0'].get(i);
                res.add(ns);
            }
            return;
        }

        for (int i = 0; i < phone[digits.charAt(idx) - '0'].size(); i++) {
            String ns = s + phone[digits.charAt(idx) - '0'].get(i);
            addList(digits, idx + 1, res, phone, ns);
        }
    }
}
