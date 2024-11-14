package programmers.test;

public class Test97 {
    public int solution(String myString, String pat) {
        
        StringBuilder converted = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                converted.append('B');
            } else if (c == 'B') {
                converted.append('A');
            } else {
                converted.append(c); 
            }
        }

        if (converted.toString().contains(pat)) {
            return 1;
        }
        return 0;
    }
}
