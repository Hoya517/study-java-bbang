package chap10;

class Computer1 {
	private String componentClassName;
	
	public void toInfo() {
		System.out.println(componentClassName);
	}
	
	public <T extends ComputerPart>Computer1(T component) {
		this.componentClassName = component.getClass().getName();
	}
}

class ComputerPart1 {}

class Memory1 extends ComputerPart {}

public class Sample09 {
	public static void main(String[] args) {
		Computer1 mem = new Computer1(new Memory1());
		mem.toInfo();
	}
}
