package programmers.test;

public class Test123 {
    public boolean solution(int x) {
        int digitSum = 0;
        int temp = x;
        
        while(temp > 0){
            digitSum += temp % 10;
            temp /= 10;
        }
        return x % digitSum == 0;
    }
}
