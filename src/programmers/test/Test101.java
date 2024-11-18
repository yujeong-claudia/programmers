package programmers.test;

public class Test101 {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                result.append('A');
            } else if (Character.isUpperCase(c) && c != 'A') {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
