package chap05;

import java.util.Arrays;

public class Sample13 {

	public static void main(String[] args) {
		var students = new String[] {
				"스노우 화이트", "멀린", "레지나", "애버러지", "잭", "아덕", "한스"
		};
		
		// 레드슈즈 주인공 '스노우 화이트'를 검색
		var sortedStduents = Arrays.copyOf(students, students.length);
		Arrays.sort(sortedStduents);
		System.out.println("정렬 :: " + Arrays.toString(sortedStduents));
		
		int idx = Arrays.binarySearch(sortedStduents, "스노우 화이트");
		System.out.printf("%d 번째에 [%s]가 위치합니다.", (idx+1), sortedStduents[idx]);
	}

}
