package chap10;

public class Sample07 {

	public static void main(String[] args) {
		Sample06<Integer> age = new Sample06<Integer>();
		Sample06<String> name = new Sample06<String>();
		
		age.setT(24);
		name.setT("주호");
		
		int myAge = age.getT();
		String myName = name.getT();
		
		System.out.printf("%s는 %d살 입니다.", myName, myAge);
	}

}
