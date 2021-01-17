package chap06;

public class Test3 {

	public static void main(String[] args) {
		final int line = 5;
		
		for(int i=0; i<line; i++) {
			for(int j = 0; j < line-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+(i+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
