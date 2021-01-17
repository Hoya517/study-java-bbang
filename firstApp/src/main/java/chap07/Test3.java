package chap07;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int[] target = new int[6];
		for(int i = 0; i < target.length; i++) {
			target[i] = (int)(Math.random() * 45 + 1);
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(target[i] == target[j]) {
						i--;
						break;
					}
				}
			}
		}
		Arrays.sort(target);
		for(int c : target) {
			System.out.print(c + " ");
		}
	}

}
