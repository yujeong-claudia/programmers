package programmers.test;

public class Test143 {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < words.length; i++) {
        	String word = words[i];
        	StringBuilder convertedWord = new StringBuilder();
        	
        	for(int j = 0; j < word.length(); j++) {
        		char c = word.charAt(j);
        		if(j % 2 == 0) {
        			convertedWord.append(Character.toUpperCase(c));
        		} else {
        			convertedWord.append(Character.toLowerCase(c));
        		}
        	}
        	answer.append(convertedWord);
        	if(i < words.length - 1) {
        		answer.append(" ");
        	}
        }
        
        return answer.toString();
    }
}
