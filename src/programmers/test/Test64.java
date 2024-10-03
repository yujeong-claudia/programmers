package programmers.test;

public class Test64 {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
