package chap05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		var wishList = new String[] {
				"냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"
		};
		
		var purchasedList = new String[] {
				"에어컨", "노트북", "TV"
		};
		
		System.out.println("== 구입하지 못한 물건 ==");
		Arrays.sort(purchasedList);
		for (int i=0; i<wishList.length; i++) {
			System.out.printf("%s", Arrays.binarySearch(purchasedList, wishList[i]) < 0 ? wishList[i]+"\n" : "");
		}
	}

}
