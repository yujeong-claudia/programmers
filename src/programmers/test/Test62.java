package programmers.test;

import java.util.Arrays;

public class Test62 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                     .filter(num -> num % n == 0) 
                     .toArray(); 
    }
}
