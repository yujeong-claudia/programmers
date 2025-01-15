package programmers.test;

public class Test145 {
    public int solution(int n) {
        String ternary = "";
        while(n > 0) {
        	ternary = (n % 3) + ternary;
        	n /= 3;
        }
        
        String reversedTernary = new StringBuilder(ternary).reverse().toString();
        
        int answer = Integer.parseInt(reversedTernary, 3);
        
        return answer;
    }
}
