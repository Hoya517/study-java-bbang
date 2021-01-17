package chap07;

public class Sample08 {

	@SuppressWarnings("preview")
	public static void main(String[] args) {
		int in = 1;
		
		switch(in) {
			case 1,3,5,7,9 -> System.out.println("홀수입니다.");
			case 2,4,6,8,10 -> System.out.println("홀수입니다.");
			default -> {
				System.out.println("1~10의 수가 아닙니다");
				System.out.println("정확한 수를 입력하세요.");
			}
		}
	}

}
