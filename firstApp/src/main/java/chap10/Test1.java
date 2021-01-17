package chap10;

import lombok.Builder;

public class Test1 {

	public static void main(String[] args) {
		Person superman = Person.builder()
								.name("슈퍼맨")
								.age(32)
								.hight(190)
								.weight(100)
								.phone("1511-1151")
								.build();
		System.out.println(superman.toString());
	}

}

class Person {
	private String name;
	private int age;
	private float hight;
	private float weight;
	private String phone;

	@Builder
	public Person(String name, int age, float hight, float weight, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hight=" + hight
				+ ", weight=" + weight + ", phone=" + phone + "]";
	}
}
