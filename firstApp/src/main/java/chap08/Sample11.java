package chap08;

public class Sample11 {
	
	void localMethod() {
		int age = 23;
		
		class LocalClass {
			public void howOldAreYou() {
				System.out.println("나는 " + age + "살입니다.");
			}
		}
		
		LocalClass localClass = new LocalClass();
		localClass.howOldAreYou();
	}

	public static void main(String[] args) {
		Sample11 outerClass = new Sample11();
		outerClass.localMethod();
	}

}
