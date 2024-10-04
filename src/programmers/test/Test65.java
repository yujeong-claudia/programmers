package programmers.test;

import java.util.Arrays;

public class Test65 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        if(sides[2] < sides[0] + sides[1]){
           return 1;  
        } else {
            return 2;
        }
    }
}
