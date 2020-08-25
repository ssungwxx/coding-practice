package programmers;

public class 괄호_변환 {
    public static String solution(String p) {
        if(p.length() == 0) return "";

        String u = "";
        String v = "";
        int cnt = 0;

        for(int i = 0; i < p.length(); i++){
            if(p.charAt(i) == '(') cnt++;
            else cnt--;
            u += p.charAt(i);

            if(cnt == 0) {
                v = p.substring(i+1);
                break;
            }
        }

        if(isCorrect(u)){
            return u + solution(v);
        }else{
            String tmp = "(";
            tmp += solution(v);
            tmp += ")";
            u = u.substring(1, u.length() - 1);
            for(char c : u.toCharArray()){
                if(c == '(') tmp += ')';
                else tmp += '(';
            }

            return tmp;
        }
    }

    public static boolean isCorrect(String s){
        int cnt = 0;
        if(s.charAt(0) == ')') return false;

        for(char c : s.toCharArray()){
            if(c == '(') cnt ++;
            else cnt--;

            if(cnt < 0) return false;
        }

        if(cnt == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("(()())()"));
        System.out.println(solution(")("));
        System.out.println(solution("()))((()"));
    }
}
