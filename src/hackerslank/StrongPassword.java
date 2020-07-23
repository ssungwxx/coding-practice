package hackerslank;

import java.util.HashSet;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        boolean[] checked = new boolean[4];
        int cnt = 4;

        for(char c : password.toCharArray()){
            if(!checked[0]){
                for(int i = 0; i < numbers.length();i++){
                    if(c == numbers.charAt(i)){
                        checked[0] = true;
                        cnt--;
                        break;
                    }
                }
            }
            if(!checked[1]){
                for(int i = 0; i < lower_case.length();i++){
                    if(c == lower_case.charAt(i)){
                        checked[1] = true;
                        cnt--;
                        break;
                    }
                }
            }
            if(!checked[2]){
                for(int i = 0; i < upper_case.length();i++){
                    if(c == upper_case.charAt(i)){
                        checked[2] = true;
                        cnt--;
                        break;
                    }
                }
            }
            if(!checked[3]){
                for(int i = 0; i < special_characters.length();i++){
                    if(c == special_characters.charAt(i)){
                        checked[3] = true;
                        cnt--;
                        break;
                    }
                }
            }
        }

        return Math.max(cnt, 6 - n);
    }
}
