import java.util.Stack;

public class P0020_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("{]"));
    }

    public static boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }else{
                if(stack.empty()) return false;
                else if (array[i] == ')') {
                    if (stack.pop() != '(') return false;
                } else if (array[i] == '}') {
                    if (stack.pop() != '{') return false;
                } else if (array[i] == ']') {
                    if (stack.pop() != '[') return false;
                }
            }
        }

        if (stack.empty()) return true;
        else return false;
    }
}
