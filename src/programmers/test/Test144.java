package programmers.test;

import java.util.Arrays;

public class Test144 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int cost : d){
            if(budget >= cost){
                budget -= cost;
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
