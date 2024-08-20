package programmers.test;

import java.util.HashSet;
import java.util.Set;

public class Test57 {
    public int solution(String[] s1, String[] s2) {
        
        Set<String> st1 = new HashSet<>();
        Set<String> st2 = new HashSet<>();
        
        for(String s : s1){
            st1.add(s);
        }
        for(String s : s2){
            st2.add(s);
        }
        st1.retainAll(st2);
        
        return st1.size();
    }
}
