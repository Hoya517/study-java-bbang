package chap05;

public class Sample05 {

	public static void main(String[] args) {
		int[][] household = new int[5][3];
		household[1] = new int[1];
		household[4] = new int[2];
		
		int[][] householdclone = household;
		
		System.out.printf("1층 %d세대\n", household[0].length);
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("3층 %d세대\n", household[2].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("5층 %d세대\n", household[4].length);
		
		System.out.println(householdclone.length);
	}

}
