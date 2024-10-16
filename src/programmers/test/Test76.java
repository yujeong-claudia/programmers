package programmers.test;

public class Test76 {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        // 홀수 번째와 짝수 번째 원소의 합 계산
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) { // 짝수 인덱스 (1번, 3번, ... 원소)
                oddSum += num_list[i];
            } else {           // 홀수 인덱스 (2번, 4번, ... 원소)
                evenSum += num_list[i];
            }
        }
        
        // 두 합 중 큰 값을 반환
        return Math.max(oddSum, evenSum);
    }
}
