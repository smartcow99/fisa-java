package step01;

public class BasicSyntax3 {
	static int no1 = 0;
	int no2 = 0;
	
	public BasicSyntax3() {
		no1++;
		no2++;
	}
	
	static void info() {
		String name = "HW";
		int age = 26;
		System.out.println("My name is " + name + " and my age is " + age);
	}
	
	
	public static void main(String[] args) {
		System.out.println(no1);
		BasicSyntax3 bs1 = new BasicSyntax3();
		System.out.println(no1);
		BasicSyntax3 bs2 = new BasicSyntax3();
		System.out.println(no1);
		
		info();
		BasicSyntax3.info();

		System.out.println("bs1.no1 = " + bs1.no1);
		System.out.println("bs1.no2 = " + bs1.no2);
		System.out.println("no1 = " + no1);
		System.out.println("bs2.no1 = " + bs2.no1);
		System.out.println("bs2.no2 = " + bs2.no2);

	}

}
