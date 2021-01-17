package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample09 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(4, "상오"));
		list.add(new Employee(1, "주호"));
		list.add(new Employee(3, "범우"));
		list.add(new Employee(2, "대현"));
		
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}

}

@Data
@AllArgsConstructor
class Employee implements Comparable<Employee> {
	private int	   sabun;
	private String name;
	
	@Override
	public int compareTo(Employee o) {
//		return this.sabun - o.sabun;	// 순정렬
//		return o.sabun - this.sabun;	// 역정렬
//		return this.name.compareTo(o.name);	// 순정렬
		return o.name.compareTo(this.name);	// 역정렬
	}
}