package chap10;

class ComputerPart { }

class Graphics extends ComputerPart { }

class Memory extends ComputerPart { }

class Monitor { }

class Computer<T extends ComputerPart> {
	private T component;
	
	public void toInfo() {
		System.out.println(component.getClass().getName());
	}

	public void setComponent(T component) {
		this.component = component;
	}

	public Computer(T component) {
		this.component = component;
	}
	
	public Computer() { }
}

public class Sample08 {

	public static void main(String[] args) {
		Computer<ComputerPart> vga = new Computer<ComputerPart>();
		vga.setComponent(new Graphics());
//		vga.setComponent(new Monitor());
		vga.toInfo();
		
		Computer<ComputerPart> mem = new Computer<ComputerPart>();
		mem.setComponent(new Memory());
		mem.toInfo();
	}

}
