package chap08;

public class Sample04 {
	
	static int total = 0;

	public static void main(String[] args) {
		System.out.printf("결과: %d\n", sum(1));
	}

	public static int sum(int... a) {
		for(int i: a) total += i;
		return total;
	}
	
	public static int sum(String b, int... a) {	 // 가변인자가 마지막에 와야함 & 가변인자는 하나만
		for(int i: a) total += i;
		return total;
	}
}
