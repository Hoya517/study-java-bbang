package chap07;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		if(in>0) {
			System.out.println("양수입니다");
		} else {
			System.out.println("음수입니다.");
		}
		sc.close();
	}

}
