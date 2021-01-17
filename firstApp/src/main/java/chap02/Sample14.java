package chap02;

public class Sample14 {
	public static void main(String[] args) {
		final float PI;
		PI = 3.14f;
//		PI = 3.141592f;  // The final local variable PI may already have been assigned
		int radius = 10;
		
		final var PI2 =3.141592f;
		
		float area = radius * radius * PI;
		System.out.println(PI);
		System.out.println(PI2);
		System.out.println(area);
	}
}
