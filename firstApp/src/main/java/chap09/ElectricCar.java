package chap09;

public class ElectricCar extends Car {

	public ElectricCar(String color, String manufactuer) {
		super(color, manufactuer);
	}

	@Override
	public String fillUp() {
		return "전기를 주유합니다.";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
