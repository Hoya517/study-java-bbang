package chap09;

interface Database {
	void getConnect();
	
	void printInfo();
}

class Oracle implements Database {

	boolean conn = false;
	@Override
	public void getConnect() {
		this.conn = true;
	}

	@Override
	public void printInfo() {
		if(conn) System.out.println("데이터베이스 접속 성공");
		else 	 System.out.println("데이터베이스 접속 실패");
	}
	
}

class Ms implements Database {

	boolean conn = false;
	@Override
	public void getConnect() {
		this.conn = true;
	}

	@Override
	public void printInfo() {
		if(conn) System.out.println("데이터베이스 접속 성공");
		else 	 System.out.println("데이터베이스 접속 실패");
	}
	
}

public class Sample08 {

	public static void main(String[] args) {
		Database oracle = new Oracle();
		oracle.getConnect();
		oracle.printInfo();
		
		Database ms = new Oracle();
		ms.printInfo();
	}

}
