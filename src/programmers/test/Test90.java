package programmers.test;

import java.util.Arrays;

public class Test90 {
	public int[] solution(int[] num_list) {
        // num_list를 정렬
        Arrays.sort(num_list);
        
        // 가장 작은 5개 수를 담을 배열을 생성
        int size = Math.min(5, num_list.length); // num_list의 길이가 5보다 작을 경우를 고려합니다.
        int[] answer = new int[size];
        
        // 가장 작은 5개의 수를 answer 배열에 복사
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i];
        }
        
        return answer; // 결과 배열을 반환
    }
}
