package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample12 {

	public static void main(String[] args) {
		var<String, Integer> map = new HashMap<String, Integer>();
		int idx = 0;
		map.put("Java", ++idx);
		map.put("C", ++idx);
		map.put("C++", ++idx);
		map.put("C#", ++idx);
		map.put("Python", ++idx);
		map.put("JavaScript", ++idx);
		map.put("PHP", ++idx);
		map.put("Visual Basic .NET", ++idx);
		map.put("Perl", ++idx);
		map.put("Delphi", ++idx);
		
		@SuppressWarnings("unchecked")
		Map<String, Integer> beforeMap = (Map<String, Integer>) map.clone();
		Set<String> keys = map.keySet();
		
		// 향상된 for문
		System.out.println("==Enhanced for Loop");
		for(String key : keys) {
			System.out.println(key);
		}
		
		// 람다식
		System.out.println("==Lambda expression");
		keys.forEach( (s) -> System.out.println(s));
		
		// 메서드 참조
		System.out.println("==Method references");
		map.keySet().forEach(System.out::println);
		
		// 총 맵의 매핑 수
		System.out.println("맵의 매핑 수: " + map.size());
		
		// Ruby가 10위로 들어오고 Delphi가 10권 밖으로 사라짐
		System.out.println("\n==Ruby가 10위로 들어오고 Delphi가 10권 밖으로 사라짐");
		if(map.containsKey("Delphi"))	map.remove("Delphi");
		else	System.out.println("Delphi가 없습니다.");
		map.put("Ruby", 10);
		System.out.println(map.toString());
		
		// Java가 순위에서 1계단 내려오고 C가 한계단 올라감
		map.computeIfPresent("Java", (String key, Integer value) -> ++value);
		map.computeIfPresent("C", (String key, Integer value) -> --value);
		System.out.println("After :: " + map.toString());
		System.out.println("Before :: " + beforeMap);
	}

}
