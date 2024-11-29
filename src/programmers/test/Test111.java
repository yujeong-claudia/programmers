package programmers.test;

public class Test111 {

    public int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

}
