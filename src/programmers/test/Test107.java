package programmers.test;

import java.util.ArrayList;
import java.util.List;

public class Test107 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> pendingTasks = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                pendingTasks.add(todo_list[i]);
            }
        }
        
        return pendingTasks.toArray(new String[0]);
    }

}
