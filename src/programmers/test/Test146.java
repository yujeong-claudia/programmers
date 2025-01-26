package programmers.test;

public class Test146 {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;
        
        // 삼중 반복문으로 모든 세 학생의 조합을 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 학생 번호의 합이 0이면 카운트 증가
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
