package programmers.test;

public class Test128 {
    public int solution(int[] numbers) {

        int totalSum = 0;
        for(int i = 0; i <= 9; i++){
           totalSum += i; 
        }

        int numberSum = 0;
        for(int number : numbers){
           numberSum += number; 
        }
        return totalSum - numberSum;
    }
}
