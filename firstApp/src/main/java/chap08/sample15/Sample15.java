package chap08.sample15;

public class Sample15 {
	public static void main(String[] args) {
		Student.Score studentScore = new Student.Score("주호");	// 인스턴스 생성없이
		studentScore.eng = 100;
		studentScore.mat = 100;
		studentScore.showInfo();
	}
}
