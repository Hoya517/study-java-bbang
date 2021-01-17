package chap05;

import java.util.Arrays;

public class Sample06 {

	public static void main(String[] args) {
		int[][][] household = {
				{
					{1,2,3}, {4,5,6}, {7}, {8,9,10}, {11,12,13}
				},
				{
					{14,15,16}, {17,18,19}, {20}, {21,22,23}, {24,25,26}
				}
		};
		
		int dongNo = 0;
		for(int[][] dong : household) {
			dongNo++;
			int floorNo = 0;
			for(int[] floor : dong) {
				floorNo++;
				int idx = 0;
				for(int seadae : floor) {
					System.out.printf("%d동 %d층 %d세대 : %d\t", dongNo, floorNo, ++idx, seadae);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		/*
		 * 1차원 배열 => to.String()
		 * 2차원 이상 => Arrays.deepToString()
		 */
		System.out.println(Arrays.deepToString(household));
	}

}
