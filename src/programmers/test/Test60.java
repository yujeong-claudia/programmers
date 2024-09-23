package programmers.test;

public class Test60 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            // 대문자인 경우 소문자로, 소문자인 경우 대문자로 변환
            if(Character.isLowerCase(c)){
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }
}
