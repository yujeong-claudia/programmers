package programmers.test;

public class Test34 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
           answer[i] = numbers[i] * 2;  
        }
       
        return answer;
    }
}
