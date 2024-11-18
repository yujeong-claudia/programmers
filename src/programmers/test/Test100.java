package programmers.test;

public class Test100 {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}
