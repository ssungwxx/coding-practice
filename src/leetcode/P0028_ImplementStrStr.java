package leetcode;

public class P0028_ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;

        int res = -1;
        int heyLength = haystack.length();
        int needleLength = needle.length();

        for(int i = 0; i < heyLength - needleLength + 1; i++){
            if(haystack.substring(i, i + needleLength).equals(needle)){
                res = i;
                break;
            }
        }

        return res;
    }
}
