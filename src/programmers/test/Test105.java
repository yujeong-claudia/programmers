package programmers.test;

public class Test105 {
    public int[] solution(int[] arr) {

        int[] sum = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
   
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                sum[i] = arr[i] / 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                sum[i] = arr[i] * 2;
            } else {
                sum[i] = arr[i];
            }

        }
      return sum;
    }
}
