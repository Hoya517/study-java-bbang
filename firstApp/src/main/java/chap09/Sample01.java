package chap09;

public class Sample01 {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar("흰색", "현대");
		GasolineCar gasolineCar = new GasolineCar("검은색", "기아");
		
		electricCar.printInfo();
		gasolineCar.printInfo();
	}

}
