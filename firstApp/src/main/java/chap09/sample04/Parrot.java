package chap09.sample04;

public class Parrot extends Pet {
	public Parrot(boolean wing, int legCount) {
		super(wing, legCount);
	}

	@Override
	public void run(String name) {
		System.out.printf("%s는 소리없이 조용하게 뜁니다.\n", name);
	}
	
	public void fly(String name) {
		System.out.printf("%s는 뛰지 않고 날라갑니다.\n", name);
	}
}
