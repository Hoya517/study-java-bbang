package chap09;

public class Sample06 {

	public static void main(String[] args) {
		ICompute a = new Apartment();
		System.out.println(a.compute(30));
	}

}

class Apartment1 implements ICompute2 {

	@Override
	public float compute(int area) {
		return area * pyung;
	}
	
	@Override
	public float toPyung(int area) {	// 오버라이딩해서 재구현해도 무관
		return area / 3;
	}
	
}

class Apartment2 implements ICompute2 {

	@Override
	public float compute(int area) {
		return area * pyung;
	}
	
	// 재구현 안하면 디폴트 메서드 그냥 사용
	
}

class Apartment3 implements ICompute2 {

	@Override
	public float compute(int area) {
		return area * pyung;
	}
	
}

class Apartment4 implements ICompute2 {

	@Override
	public float compute(int area) {
		return area * pyung;
	}
	
}

interface ICompute2 {
	float pyung = 3.3f;
	float compute(int area);
	default float toPyung(int area) {	// 디폴트 메서드
		return area / pyung;
	}
}