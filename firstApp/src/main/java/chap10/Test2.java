package chap10;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		CustomList<String> customList = new CustomList<>();
		customList.add("Iron man");
		customList.add("Captin America");
		customList.add("Thor");
		System.out.println(customList.toString());
		
		CustomList<Integer> numberList = new CustomList<>();
		numberList.add(1);
		numberList.add(2);
		System.out.println(numberList.toString());
	}

}

class CustomList<E> {
	private int listCount = 0;
	
	Object[] customList = new Object[0];
	
	public boolean add(E e) {
		listCount++;
		customList = Arrays.copyOf(customList, listCount);
		customList[listCount-1] = e;
		return true;
	}
	
	@Override
	public String toString() {
		return "CustomList =" + Arrays.toString(customList);
	}
}