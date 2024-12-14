package programmers.test;

import java.util.Arrays;

public class Test124 {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                temp[count++] = arr[i];
            } 
        }
        
        if(count == 0){
            return new int[]{-1};
        }
        
        int[] answer = Arrays.copyOf(temp, count);
        Arrays.sort(answer);
        
        return answer;
    }
}
