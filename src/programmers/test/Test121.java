package programmers.test;

import java.util.Arrays;

public class Test121 {
    public long solution(long n) {
        
        char[] digits = String.valueOf(n).toCharArray();
        
        Arrays.sort(digits);
        StringBuilder sorted = new StringBuilder(new String(digits)).reverse();
                
        return Long.parseLong(sorted.toString()); 
    }
}
