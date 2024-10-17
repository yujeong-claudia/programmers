package programmers.test;

public class Test77 {
	 public int solution(int[] num_list, int n) {
	        // num_list 배열을 순회하면서 n과 비교
	        for (int num : num_list) {
	            if (num == n) {
	                return 1; // n이 num_list에 존재하면 1 반환
	            }
	        }
	        return 0; // n이 num_list에 없으면 0 반환
	    }
}
