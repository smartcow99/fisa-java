package step01;

import org.junit.Test;

/*
 * 1. 코드를 확인하여 문법적으로 오류가 있는 부분을 모두 찾아 주석처리하고 그 이유를 작성하시오
 * 2. 코드의 실행 결과를 작성하시오
 */

public class PaperTest {
	
	int A;
	static int B;
	int C;
	String S = "hi";
	
	public PaperTest() {
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
		
		PaperTest p1 = new PaperTest();
		System.out.println("B is " + B);
		System.out.println("d1.C is " + p1.C);
		
		PaperTest p2 = new PaperTest();
		System.out.println("B is " + B);
		System.out.println("d2.A is " + p2.A);
		
		PaperTest p3 = new PaperTest();
		System.out.println("d3.B is " + p3.B);
		
//		System.out.println(S);
		System.out.println(p3.S);
		
		func1();
		p1.func1();
//		func2();
		p3.func2();
		int result = p1.A + p2.B + p3.C;
		System.out.println("A + p2.B + p3.C = " + result);
		
	}

}
