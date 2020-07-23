package hackerslank;

public class CamelCase {
    static int camelcase(String s) {
        int cnt = 1;

        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z') cnt++;
        }

        return cnt;
    }
}
