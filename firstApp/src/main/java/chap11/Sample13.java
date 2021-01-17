package chap11;

import java.util.HashMap;
import java.util.TreeMap;

public class Sample13 {

	public static void main(String[] args) {
		// 학번 정보
		System.out.println("HashMap은 정렬되지 않은 Key, Value 형태로 저장됩니다.");
		var hashMap = new HashMap<String, String>();
		hashMap.put("1902893", "선풍기");
		hashMap.put("1801438", "신문지");
		hashMap.put("1803962", "고무신");
		hashMap.put("1722761", "강속구");
		hashMap.put("1913499", "동백꽃");
		hashMap.put("1804367", "솔까말");
		System.out.println(hashMap);
		
		// 정렬해서 출력
		System.out.println("\nTreeMap은 정렬하며 Key, Value 형태로 저장됩니다.");
		var map = new TreeMap<String, String>();
		map.putAll(hashMap);
		
		System.out.println(map);
		System.out.println();
		
		// 학번이 1803959 이거나 더 큰 값을 갖는 가장 가까운 학번 정보
		System.out.println("학번이 1803959 이거나 더 큰 값을 갖는 가장 가까운 학번 정보");
		System.out.println(map.ceilingEntry("1803959"));
		System.out.print(map.ceilingKey("1803959"));
		// key로 value 찾기
		System.out.println(", " + map.get(map.ceilingKey("1803959")));
		
		// '1803962' 이라는 학번의 학생이 재학생인지 확인
		String no = "1803962";
		if(map.containsKey(no)) {
			System.out.printf("\n학번 %s인 학생의 이름은 %s\n", no, map.get(no));
		} else {
			System.out.printf("\n학번 %s인 학생은 재학생이 아닙니다.\n", no);
		}
	}

}
