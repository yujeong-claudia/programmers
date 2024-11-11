package programmers.test;

public class Test94 {
    public int solution(int[] arr1, int[] arr2) {
        // null 체크
        if (arr1 == null && arr2 == null) return 0;
        if (arr1 == null) return -1;
        if (arr2 == null) return 1;

        // 1. 배열의 길이를 비교
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            // 2. 길이가 같은 경우, 배열의 모든 원소 합을 비교
            int sum1 = 0, sum2 = 0;
            for (int num : arr1) sum1 += num;
            for (int num : arr2) sum2 += num;

            if (sum1 > sum2) {
                return 1;
            } else if (sum1 < sum2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
