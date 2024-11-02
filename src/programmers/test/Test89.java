package programmers.test;

import java.util.Arrays;

public class Test89 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int length = num_list.length;
        int excludeCount = Math.min(5, length);

        int[] answer = new int[length - excludeCount];

        for (int i = 0; i < length - excludeCount; i++) {
            answer[i] = num_list[i + excludeCount];
        }
        
        return answer;
    }
}
