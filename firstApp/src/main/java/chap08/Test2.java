package chap08;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idx = 0;
		Friend[] friends = new Friend[5];
		friends[idx++] = new Friend("1", 1, "010-1111-1111");
		friends[idx++] = new Friend("2", 2, "010-2222-2222");
		friends[idx++] = new Friend("3", 3, "010-3333-3333");
		friends[idx++] = new Friend("4", 4, "010-4444-4444");
		friends[idx++] = new Friend("5", 5, "010-4444-4444");
		
		do {
			System.out.println("신상을 알고싶은 사람의 이름을 입력해주세요 : ");
			String in = sc.next();
			
			if("0".equals(in)) {
				System.out.println("종료합니다.");
				break;
			} else {
				for(Friend friend : friends) {
					if(friend.getName().equals(in)) {
						System.out.println(friend.toString() + "\n");
					}
				}
			}
		} while(true);
		sc.close();
	}

}

@Data
@AllArgsConstructor
class Friend {
	private String name;
	private int    age;
	private String phone;
}
