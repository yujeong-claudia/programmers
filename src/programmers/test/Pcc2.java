package programmers.test;

import java.util.Scanner;

public class Pcc2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c*c) - (a*a);

        System.out.println(b_square);

	}

}
