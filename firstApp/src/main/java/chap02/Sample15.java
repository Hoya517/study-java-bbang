package chap02;

import java.util.Random;

public class Sample15 {

	/**
	 *
	 * @param args
	 * @since 1.0
	 * 2020. 12. 20.
	 */
	public static void main(String[] args) {
		Random random =  new Random();  // 변수명 rnd 사용도함
		int num = random.nextInt(3) + 1;  // 0~2 +1 => 1~3
//		int num = (int)(Math.random() * 3 + 1);
		System.out.printf("난수 : %d", num);
	}

}
