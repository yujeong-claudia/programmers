package programmers.test;

public class Test122 {
    public long solution(long n) {
        
        long x = (long)Math.sqrt(n);
        
        if(n == x * x){
            return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}
