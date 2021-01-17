package chap09;

public class Sample02 {
	public static void main(String[] args) {
		Car car = new ElectricCar("흰색", "현대");
		car.printInfo();
//		car.setColor("회색");	  // 자손 클래스에 정의된 메서드는 사용할 수 없다(자료형이 부모클래스)
		car.printInfo();
	}
}
