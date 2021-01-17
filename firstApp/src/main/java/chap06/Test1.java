package chap06;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int array[] = new int[input];
		for(int i=0; i<input; i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}
		
		scanner.close();
	}

}
