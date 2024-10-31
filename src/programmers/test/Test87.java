package programmers.test;

public class Test87 {
    public int solution(String num_str) {
        int answer = 0;
        
        for(char c : num_str.toCharArray()){
            answer += c - '0';
        }
        
        return answer;
    }
}
