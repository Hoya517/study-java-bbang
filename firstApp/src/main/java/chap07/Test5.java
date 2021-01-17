package chap07;

public class Test5 {

	public static void main(String[] args) {
		String word = "Internet of things";
		String result = "";
		
		word = word.toLowerCase(); // 소문자로 변경
		
		boolean changeFlag = false;
		for(var c : word.toCharArray()) {
			if(changeFlag) {
				changeFlag = false;
				c = (char)((int)c-32);
			}
			if(c == ' ') {
				changeFlag = true;
				continue;
			}
			result += c;
		}
		System.out.println("input : " + word);
		System.out.println("output : " + result);
	}

}
