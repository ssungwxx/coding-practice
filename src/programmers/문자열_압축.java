package programmers;

public class 문자열_압축 {
    public static int solution(String s) {
        int answer = s.length();

        for(int i = 1; i <= s.length() / 2; i++){
            StringBuilder sb = new StringBuilder();
            String before = s.substring(0, i);
            int start = i;
            int cnt = 1;

            while(start + i <= s.length()){
                String now = s.substring(start, start + i);
                if(now.equals(before)){
                    cnt++;
                }else{
                    if(cnt > 1) sb.append(cnt);
                    sb.append(before);
                    cnt = 1;
                    before = now;
                }

                start += i;
            }

            if(cnt > 1) sb.append(cnt);
            sb.append(before);
            sb.append(s.substring(start, s.length()));

            answer = Math.min(sb.toString().length(), answer);

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
        System.out.println(solution("ababcdcdababcdcd"));
        System.out.println(solution("abcabcdede"));
        System.out.println(solution("abcabcabcabcdededededede"));
        System.out.println(solution("xababcdcdababcdcd"));
    }
}
