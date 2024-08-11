package programmers.test;

public class Test55 {
    public String solution(String my_string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            for(int j = 0; j < n; j++){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
