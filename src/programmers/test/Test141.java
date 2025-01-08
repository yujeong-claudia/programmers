package programmers.test;

public class Test141 {
	
    public int[] solution(int n, int m) {
        int[] arr = new int[2];
        int max = 0;
		for(int i = 1; i <= n && i <= m; i++){
            if(n % i == 0 && m % i == 0){
                max = i;
            }
        }
        int min = (n * m) / max;
        
        arr[0] = max;
        arr[1] = min;
        
        return arr;
    }
}
