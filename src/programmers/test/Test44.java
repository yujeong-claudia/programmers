package programmers.test;

public class Test44 {
    public int solution(int n, int k) {
        int answer = 0;
        
        int service = n / 10;
        int freeDrink = k - service;
            
        answer = (n * 12000) + (freeDrink * 2000);
        return answer;
    }
}
