package programmers.test;

public class Test120 {
    public int[] solution(long n) {
        String reversed = new StringBuilder(String.valueOf(n)).reverse().toString();
        
        int[] result = new int[reversed.length()];
        for(int i = 0; i < reversed.length(); i++) {
        	result[i] = reversed.charAt(i) - '0';
        }
        
        return result;
    }
}
