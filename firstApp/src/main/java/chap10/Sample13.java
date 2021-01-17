package chap10;

class NumberBox {
	public <Z extends Number> void setNumber(Z z) {
		System.out.printf("입력된 값은 [%s] 입니다.\n", z.toString());
	}
}

public class Sample13 {

	public static void main(String[] args) {
		NumberBox nb = new NumberBox();
		nb.setNumber(3333);
		nb.setNumber(33.33);
//		nb.setNumber("33");
//		nb.setNumber('a');
	}

}
