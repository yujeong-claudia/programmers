package programmers.test;

import java.util.Scanner;

public class Test78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 직각 이등변 삼각형 출력
        for (int i = 1; i <= n; i++) {
            // '*' 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
        
        sc.close();
    }
}
