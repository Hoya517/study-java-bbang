package chap06;

public class Test7 {

	public static void main(String[] args) {
		int[][] x = new int[8][9];
		
		for(int a = 0; a < 8; a++) {
			for(int b = 0; b < 9; b++) {
				x[a][b] = (a + 2) * (b + 1);
			}
		}
		
		for(int i = 0; i < x.length; i++) {
			int[] y = x[i];
			for(int j = 0; j < y.length; j++) {
				System.out.print("\t" + y[j]);
			}
			System.out.println();
		}
	}

}
