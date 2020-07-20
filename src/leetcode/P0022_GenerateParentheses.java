package leetcode;

import java.util.LinkedList;
import java.util.List;

public class P0022_GenerateParentheses {
    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();

        addList(res, n, n, "");

        return res;
    }

    public static void addList(List<String> list, int l, int r, String s) {
        if(l == 0 && r == 0){
            list.add(s);
            return;
        }

        if(l > 0) addList(list, l - 1, r, s + "(");
        if(l < r) addList(list, l, r - 1, s + ")");
    }
}
