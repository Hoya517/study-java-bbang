package chap08;

import lombok.Builder;

public class Sample27 {

	public static void main(String[] args) {
		Person person1 = Person.builder()
							  .no(1)
							  .build();
		Person person2 = Person.builder()
							  .no(2)
							  .name("주호")
							  .build();
		Person person3 = Person.builder()
							   .no(3)
							   .name("호야")
							   .phone("010-1234-1234")
							   .build();
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
	}

}

class Person {
	private final int no;
	private String name;
	private String phone;
	
	@Builder
	public Person(int no, String name, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
