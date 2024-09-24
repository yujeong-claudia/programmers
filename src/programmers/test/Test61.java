package programmers.test;

public class Test61 {
    public int[] solution(int[] array) {
        int maxValue = array[0]; // 첫 번째 값을 초기 최대값으로 설정
        int maxIndex = 0;        // 초기 최대값의 인덱스를 0으로 설정

        // 배열을 순회하면서 최대값과 인덱스를 찾음
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        // 최대값과 그 인덱스를 배열로 반환
        return new int[]{maxValue, maxIndex};
    }
}
