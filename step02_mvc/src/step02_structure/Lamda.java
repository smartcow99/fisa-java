package step02_structure;

import java.util.Arrays;

import org.junit.Test;

import model.domain.PeopleDTO;

public class Lamda {

	@Test
	public void m1() {
		PeopleDTO p1 = new PeopleDTO("p1", 18);
		PeopleDTO p2 = new PeopleDTO("p2", 25);
		PeopleDTO p3 = new PeopleDTO("p3", 32);
		Arrays.asList(p1, p2, p3).forEach(item -> System.out.println(item.getName() + " " + item.getAge()));
		
	}
}
