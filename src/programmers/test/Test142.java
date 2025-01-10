package programmers.test;

public class Test142 {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length(); 
        long pValue = Long.parseLong(p); 

       
        for (int i = 0; i <= t.length() - pLength; i++) {
            String subString = t.substring(i, i + pLength); 
            long subValue = Long.parseLong(subString); 

            if (subValue <= pValue) {
                answer++;
            }
        }
        return answer;
    }
}
