package chap12;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Sample05 {

	public static void main(String[] args) {
		FLOWER flower = FLOWER.ROSE;
		System.out.println(flower.getName());
	}

} 

@RequiredArgsConstructor
@Getter
enum FLOWER {
	SUNFLOWER("sunflower"), ROSE("rose");	// 세미클론 필수!
	
	private final String name;

}