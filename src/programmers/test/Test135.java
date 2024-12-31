package programmers.test;

import java.util.Arrays;

public class Test135 {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}
