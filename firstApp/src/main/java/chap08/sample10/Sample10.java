package chap08.sample10;

public class Sample10 {

	public static void main(String[] args) {
		Student student = new Student("주호");
		Student.Score studentScore = student.new Score();
		studentScore.eng = 7;
		studentScore.mat = 10;
		studentScore.showInfo();
	}

}
