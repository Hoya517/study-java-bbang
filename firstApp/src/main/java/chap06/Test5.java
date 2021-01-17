package chap06;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String word = sc.next();
		String password1 = "";
		String password2 = "";
		for(char c : word.toCharArray()) {
			password1 += "" + (char) (c-3);
		}
		System.out.printf("암호화 된 단어 : %s", password1);
		for(char c : password1.toCharArray()) {
			password2 += "" + (char) (c+3);
		}
		System.out.println("\n복호화 된 단어 : " + password2);
		sc.close();
	}

}
