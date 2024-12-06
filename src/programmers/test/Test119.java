package programmers.test;

public class Test119 {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        
        long pCount = s.chars().filter(ch -> ch == 'p').count();
        long yCount = s.chars().filter(ch -> ch == 'y').count();

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return pCount == yCount;
    }
}
