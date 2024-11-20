package programmers.test;

public class Test103 {
    public int solution(String myString, String pat) {
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        return myString.contains(pat) ? 1 : 0;
    }
}
