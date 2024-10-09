package programmers.test;

public class Test70 {
	public int[] solution(int[] num_list) {
        // 마지막 원소와 그 전 원소를 변수에 저장
        int lastElement = num_list[num_list.length - 1];
        int secondLastElement = num_list[num_list.length - 2];
        
        // 결과를 저장할 리스트 생성
        int[] answer;
        
        if (lastElement > secondLastElement) {
            // 마지막 원소가 그 전 원소보다 클 경우
            answer = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[num_list.length] = lastElement - secondLastElement;
        } else {
            // 마지막 원소가 그 전 원소보다 작거나 같을 경우
            answer = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[num_list.length] = lastElement * 2;
        }
        
        return answer;
    }
}
