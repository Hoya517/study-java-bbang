package chap05;

import java.util.Arrays;

public class Sample10 {

	public static void main(String[] args) {
		int[] correct = {1,2,3,4,5,6};
		
		int[][] answers = {
				{1,2,3,4,5,6},
				{1,23,3,4,5,6},
				{1,2,233,4,5,6},
				{1,2,3,44,5,6},
				{1,2,3,45,5,6},
				{1,2,32,4,5,56}
		};
		
		// 만점자 찾기
		int no = 0;
		for(int[] answer : answers) {
			no++;
			if(Arrays.equals(correct, answer)) 
				System.out.println(no+"번 학생은 만점자 입니다.");
			else
				System.out.println(no+"번 학생은 만점자가 아닙니다.");
		}
	}

}
