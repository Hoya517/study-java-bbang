package chap06;

public class Sample05 {

	public static void main(String[] args) {
		for(int i=0, l=9; i<5; i++, l-=2) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<l; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
