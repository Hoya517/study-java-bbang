package chap04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("답 입력> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = (num1 > num2) ? num1 : (num1 == num2) ? 0 : num2;
		System.out.printf("출력  > %d", result);
		
		scanner.close();
	}

}
