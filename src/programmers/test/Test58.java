package programmers.test;

public class Test58 {
    public int solution(int n) {
        double answer = Math.sqrt(n);
        return (n % answer == 0) ? 1 : 2;
    }
}
