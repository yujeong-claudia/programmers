package programmers.test;

public class Test79 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for (char ch : rsp.toCharArray()) {
            if (ch == '0') {
                answer.append('5'); // 바위(0)를 이기려면 보(5)를 내야 함
            } else if (ch == '2') {
                answer.append('0'); // 가위(2)를 이기려면 바위(0)를 내야 함
            } else if (ch == '5') {
                answer.append('2'); // 보(5)를 이기려면 가위(2)를 내야 함
            }
        }
        
        return answer.toString();
    }
}
