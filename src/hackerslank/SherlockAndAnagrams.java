package hackerslank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        int cnt = 0;
        HashMap<Integer, List<String>> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String tmp = s.substring(i, j);
                if (hm.containsKey(tmp.length())) {
                    List<String> list = hm.get(tmp.length());

                    for (String str : list) {
                        if (isAnagram(tmp, str)) cnt++;
                    }

                    list.add(tmp);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(tmp);
                    hm.put(tmp.length(), list);
                }
            }
        }

        return cnt;
    }

    static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abcd"));
    }
}
