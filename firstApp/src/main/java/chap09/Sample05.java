package chap09;

public class Sample05 {

	public static void main(String[] args) {
		ICompute a = new Apartment();	// 참조 자료형(다형성), Apartment a = new Apartment()도 가능
		System.out.println(a.compute(30));
	}

}

class Apartment implements ICompute {

	@Override
	public float compute(int area) {
		return area * pyung;
	}
	
}

interface ICompute {	// abstract interface ICompute 
	float pyung = 3.3f;		// static final float pyung => 상수 값 고정
	float compute(int area);	// abstract float compute(int area)
}