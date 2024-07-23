package step01;

public class PaperTest3 {
	
	int A;
	static int B;
	int C;
	String S = "hi";
	
	public PaperTest3() {
		A++;
		B++;
		--C;
		++B;
	};
	
	static void func1() {
		System.out.println("func1 is called!");
	}
	
	void func2() {
		System.out.println("func2 is called!");
	}

	public static void main(String[] args) {
		
		PaperTest3 p1 = new PaperTest3();
		System.out.println("B is " + B);
		System.out.println("d1.C is " + p1.C);
		
		PaperTest3 p2 = new PaperTest3();
		System.out.println("B is " + B);
		System.out.println("d2.A is " + p2.A);
		
		PaperTest3 p3 = new PaperTest3();
		System.out.println("d3.B is " + p3.B);
		
//		System.out.println(S);
		System.out.println(p3.S);
		
		func1();
		p1.func1();
//		func2();
		p3.func2();
		int result = p1.A + p2.B + p3.C;
		System.out.println("A + d2.B + d3.C = " + result);
		
	}

}
