package step02_structure;

import org.junit.Test;

class NewChild extends NewParent {
	
	String school;
	
	public NewChild() {
		super();
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(school);
	}
	
}

class NewParent extends Object {
	
	String name;
	int age;
	
	public NewParent() {
		super();
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Quiz {
	
	@Test
	public void m1() {
		NewParent np = new NewParent();
		np.name = "Jonadan";
		np.age = 48;
		NewChild nc = new NewChild();
		nc.name = "Kevin";
		nc.age = 14;
		nc.school = "Spring Field Middle School";
		
		np.info();
		nc.info();
		
		NewParent np2;
		
	}
}
