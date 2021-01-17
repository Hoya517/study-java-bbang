package chap08;

interface Greeting {
	public abstract String sayHello(String name);
}

public class Sample13 {

	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			@Override
			public String sayHello(String name) {
				return name + ", 안녕?";
			}
		};
		System.out.println(greeting.sayHello("주호"));
		
		// 람다식
		Greeting g = (name) -> name + ", 안녕?(람다)";
		System.out.println(g.sayHello("주호"));
	}

}
