package programmers.test;

public class Test10 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}

