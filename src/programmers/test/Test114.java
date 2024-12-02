package programmers.test;

import java.util.Scanner;

public class Test114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int sum = 0;
        
        String number = Integer.toString(n);
        
        for(int i = 0; i < number.length(); i++){
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
	}

}
