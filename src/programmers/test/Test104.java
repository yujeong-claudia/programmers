package programmers.test;

public class Test104 {
	public int solution(int[] num_list) {
		int sum = 0;
		if (num_list.length >= 11) {
			for (int i = 0; i < num_list.length; i++) {
				sum += num_list[i];
			}
			return sum;
		} else {
			int product = 1;
			for (int i = 0; i < num_list.length; i++) {
				product *= num_list[i];
			}
			return product;
		}
	}
}
