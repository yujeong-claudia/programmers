package programmers.test;

public class Test91 {
    public int solution(int n) {
        int answer = 0;
        
        // n이 0보다 클 때까지 반복
        while (n > 0) {
            answer += n % 10;  // 마지막 자리 숫자 더하기
            n /= 10;  // 마지막 자리 숫자 제거
        }
        
        return answer;
    }
}
