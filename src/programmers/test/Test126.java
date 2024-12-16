package programmers.test;

public class Test126 {
    public int solution(long num) {
        long count = 0;

        if (num == 1) {
            return 0;
        }

        while (count < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            count++;

            if (num == 1) {
                return (int)count;
            }
        }
        
        return -1;
    }
}
