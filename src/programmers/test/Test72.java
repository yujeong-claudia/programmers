package programmers.test;

public class Test72 {
    public int[] solution(int start_num, int end_num) {
        int size = end_num - start_num + 1; // 배열의 크기
        int[] answer = new int[size]; // 배열 선언
        
        for (int i = 0; i < size; i++) {
            answer[i] = start_num + i; // 각 요소에 값을 저장
        }
        
        return answer; // 배열 반환
    }
}
