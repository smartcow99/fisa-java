package step01;

public class BasicSyntax2 {
	// Member variable -> instance 
	String name = "HW";
	int age = 26;
	
	// Required
	// If developer except auto added
	public BasicSyntax2() {
		// TODO Auto-generated constructor stub

	}
	
	// Method: Variable declare, print age variable and name variable
	// Return Type Method name([parameter]){}

	void info() {
		String name2 = "DG";
		int age2 = 22;
		System.out.println(name2 + " " + age2);
		
	}
	
	
	public static void main(String[] args) {
		BasicSyntax2 bs2 = new BasicSyntax2();
		bs2.info();
		System.out.print(bs2.name + " ");
		System.out.println(bs2.age);
		
	}

}
