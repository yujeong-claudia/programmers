package programmers.test;

public class Test137 {
    public boolean solution(String s) {
        return ((s.length() == 4 || s.length() == 6) && s.matches("\\d+")) ? true : false;       
    }
}
