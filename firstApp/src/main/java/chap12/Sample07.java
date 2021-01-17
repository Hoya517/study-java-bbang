package chap12;

public class Sample07 {

	public static void main(String[] args) {
		CITY returnCity = CITY.valueOf(3);
		System.out.println(returnCity.getDestination());
	}

}

enum CITY {
	SEOUL("서울", 0), DAEJEON("대전", 1), DAEGU("대구", 3), PUSAN("부산", 4), JEJU("제주", 6), GWANGJU("광주", 5);
	
	private final String destination;
	private final int	 seq;
	private CITY(String destination, int seq) {
		this.destination = destination;
		this.seq = seq;
	}
	public String getDestination() {
		return destination;
	}
	public int getSeq() {
		return seq;
	}
	
//	public static CITY valueOf(int selectNum) {
//		CITY returnCity = null;
//		for(CITY city : CITY.values()) {
//			if(city.ordinal() == selectNum) {
//				returnCity = city;
//				break;
//			}
//		}
//		return returnCity;
//	}
	public static CITY valueOf(int seq) {
		CITY returnCity = null;
		for(CITY city : CITY.values()) {
			if(city.ordinal() == seq) {
				returnCity = city;
				break;
			}
		}
		return returnCity;
	}
}
