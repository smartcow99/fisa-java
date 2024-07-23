package step02_mvc;


class A {
	
	static {
		System.out.println("Class A");
	}
}

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			Class.forName("Step02_mvc/A");
			System.out.println("I am?");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("로딩하려는 클래스 없을 때");
		}
	}
}
