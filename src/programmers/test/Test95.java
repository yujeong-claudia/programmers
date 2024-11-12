package programmers.test;

import java.util.ArrayList;
import java.util.List;

public class Test95 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                list.add(a);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
