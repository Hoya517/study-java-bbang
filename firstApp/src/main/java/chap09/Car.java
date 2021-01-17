package chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {

	protected String color;
	protected String manufactuer;
	
	public void printInfo() {
		System.out.println("이 차의 색	 : " + this.color);
		System.out.println("이 차는 	 : " + this.fillUp());
		System.out.println("이 차는 	 : " + this.manufactuer+"에서 제조합니다.");
	}
	
	public abstract String fillUp();
}
