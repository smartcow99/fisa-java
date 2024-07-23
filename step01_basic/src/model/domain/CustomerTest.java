package model.domain;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void tst() {
		Customer c1 = Customer.builder().pw("password1").age(11).build();
		System.out.println(c1.pw);
	}
}
