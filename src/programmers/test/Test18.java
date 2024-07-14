package programmers.test;

public class Test18 {
    public int solution(int n) {
        int answer = 0;

        //n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
        if(n % 2 == 1) {
            for(int i = 1; i <= n; i += 2) {
                answer += i;
            }
        //n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
        } else {
            for(int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }
        return answer;
    }
}
