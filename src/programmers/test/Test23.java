package programmers.test;

import java.util.Scanner;

public class Test23 {

    public int solution(int age) {
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        
        int year = 2022;
        
        return year - age;
    }

}
