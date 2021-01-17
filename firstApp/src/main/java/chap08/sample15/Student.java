package chap08.sample15;

public class Student {
	static String name;	// static 클래스는 static 변수만 접근 가능
		
	public Student(String name) {
//		this.name = name;
	}
	
	public static class Score {
		int eng;
		int mat;

		public Score(String name) {
			Student.name = name;	// static 직접 접근
		}
		
		public void showInfo() {
			System.out.println("이름: " + name);  // 내부클래스는 외부클래스에 접근이 쉽다
			System.out.println("영어: " + eng);
			System.out.println("수학: " + mat);
		}
	}
}
