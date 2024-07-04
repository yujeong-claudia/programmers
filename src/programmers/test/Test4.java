package programmers.test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b; // 문자 저장할 곳
        String answer = ""; // 문자열 저장할 곳
        for(int i = 0; i < a.length(); i++) {
        	b = a.charAt(i); // a의 문자 저장
        	
        	if(Character.isUpperCase(b)) {
        		answer += Character.toLowerCase(b);
        	} else {
        		answer += Character.toUpperCase(b);
        	}
        }
        System.out.println(answer);

	}

}
