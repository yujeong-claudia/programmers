package programmers.test;

public class Test93 {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        
        for (int i = 0; i < length; i++) {
            if ((length % 2 != 0 && i % 2 == 0) || (length % 2 == 0 && i % 2 != 0)) {
                arr[i] += n;
            }
        }
        
        return arr;
    }
}
