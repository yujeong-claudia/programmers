package programmers.test;

public class Test136 {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        
        for(int i = 1; i <= count; i++){
            totalPrice += price * i;
        }
        
        long shortage = totalPrice - money;
        
        return shortage > 0 ? shortage : 0;
    }
}
