package chap11;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// 삽입 정렬
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(9);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		
		System.out.println("시작 배열: " + list);
		for(int times = 1; times < list.size(); times++) {
			var targetPos = times;
			var target1   = list.get(targetPos);
			var pos 	  = times - 1;
			
			System.out.print(target1 + " ");
			for(int idx = pos; idx >= 0; idx--) {
				var target2 = list.get(idx);
				if(target1 < target2) {
					list.set(targetPos, target2);
					list.set(idx, target1);
					targetPos = idx;
				}
			}
			System.out.println(list);
		}
		System.out.println("최종 배열 : " + list);
	}

}
