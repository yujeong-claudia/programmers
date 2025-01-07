package programmers.test;

import java.util.Arrays;

public class Test140 {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int prev = -1;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != prev){
                answer[index] = arr[i];
                index++;
                prev = arr[i];
            }
        }
        
        return Arrays.copyOf(answer, index);

    }
}
