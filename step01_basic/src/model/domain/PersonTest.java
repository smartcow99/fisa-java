package model.domain;

import org.junit.Test;

public class PersonTest {

	
	@Test
	public void t1() {
		Person p1 = new Person();
		Person p2 = new Person("p2's id", "Seoul si Gwanak gu Sinlim dong ");
		Person p3 = new Person("p3's id", 1234, "Olimpic Dae Ro");
		
		System.out.println(p1.getPw());
		System.out.println(p2.getId());
		System.out.println(p3.getAddress());
	}
	
	
//	
//	@Test
//	public void t2() {
//		Person p2 = Person.builder().build();
//	}
//	
//	@Test
//	public void t3() {
//		System.out.println();
//	}
}
