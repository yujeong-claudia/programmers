package programmers.test;

public class Test80 {
    public int solution(int[] box, int n) {
        
        int xCount = box[0] / n; // 가로 방향
        int yCount = box[1] / n; // 세로 방향
        int zCount = box[2] / n; // 높이 방향

        // 총 들어갈 수 있는 주사위의 개수
        int answer = xCount * yCount * zCount;
        return answer;
    }
}
