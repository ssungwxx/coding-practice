import java.util.Stack;

public class P0032_LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()"));
        System.out.println(longestValidParentheses(")()()"));
    }

    public static int longestValidParentheses(String s) {
        char[] array = s.toCharArray();
        int res = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                int stack = 1;
                int cnt = 1;

                for (int j = i + 1; j < array.length; j++) {
                    if(array[j] == '('){
                        stack++;
                        cnt++;
                    }else{
                        stack--;
                        cnt++;
                    }

                    if(stack < 0){
                        break;
                    }

                    if(stack == 0) res = res < cnt ? cnt : res;
                }
            }
        }

        return res;
    }
}
