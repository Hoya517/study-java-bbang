package chap06;

public class Test4 {

	public static void main(String[] args) {
		for(int i = 2; i <= 100; i++) {
			boolean f = true;
			
			for(int j=2; j<i; j++) {
				if((i % j) == 0) {
					f = false;
				}
			}
			if(f) System.out.print(i+" ");
		}
	}

}
