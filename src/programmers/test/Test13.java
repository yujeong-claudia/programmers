package programmers.test;

public class Test13 {

    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }

}
