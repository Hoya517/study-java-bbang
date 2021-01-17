package chap10;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Student<G extends Integer, C extends Integer> {
	G g;
	C c;
	
	public void printInfo(String name) {
		System.out.printf("%s는 %d학년 %d반입니다.", name, g, c);
	}
}

public class Sample11 {

	public static void main(String[] args) {
		Student<Integer, Integer> juho = new Student<>(2, 5);
		juho.printInfo("주호");
	}

}
