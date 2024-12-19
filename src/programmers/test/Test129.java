package programmers.test;

public class Test129 {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        int minIndex = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(minIndex > arr[i]){
                minIndex = arr[i];
            }
        }
        int[] result = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != minIndex){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
