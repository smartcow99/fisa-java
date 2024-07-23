package step02;

import org.junit.Test;

class A{
	String message = "fisa";
}
class B{
	A aa = new A();
}

class C{
	B bb = new B();
}
public class ApplyTest {

	@Test
	public void lab() {
		C c = new C();
		System.out.println(c.bb.aa.message);
		c.bb.aa.message = "omg";
		System.out.println(c.bb.aa.message);
	}

}
