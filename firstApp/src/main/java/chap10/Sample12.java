package chap10;

import lombok.Getter;

@Getter
class Data {
	String value;
	
	public <T> void setValue(T t) {
		this.value = t.toString();
	}
	
}

public class Sample12 {

	public static void main(String[] args) {
		Data data = new Data();
		data.setValue(3);
//		data.setValue("4");
		System.out.println(data.getValue());
	}

}
