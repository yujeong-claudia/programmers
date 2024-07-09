package programmers.test;

public class Test15 {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ab2 = 2 * Integer.parseInt(Integer.toString(a)) * Integer.parseInt(Integer.toString(b));
        
        if(ab == ab2){
            answer = ab;
        } else if(ab > ab2){
            answer = ab;
        } else {
            answer = ab2;
        }
        return answer;
    }
}
