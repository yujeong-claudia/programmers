package programmers.test;

public class Test71 {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;

        // 배열의 모든 원소에 대해 합과 곱을 계산
        for (int num : num_list) {
            product *= num;
            sum += num;
        }

        // 곱이 합의 제곱보다 작으면 1, 아니면 0을 반환
        if (product < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }
}
