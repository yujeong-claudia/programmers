package programmers.test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length(); i++) {
        	System.out.print(a.charAt(i) + "\n");
        }

	}

}