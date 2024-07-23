/* 상속
 * 
 */

package step02_structure;

class Parent extends Object{
	String id;
	int pw;
	public Parent() {
		super();
	}
	
	void printAll() {
		System.out.println(id);
		System.out.println(pw);
	}
	
}


class Child extends Parent{
	
	public Child() {
		super();
	}
	
	
	String grade;
	
	void printAll() {
		System.out.println(id);
		System.out.println(pw);
		System.out.println(grade);
	}
}


public class OOP1 extends Object {
	
	public OOP1() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		
//		c.printAll();
		
		Parent p = new Child();
		p.id = "Master";
//		System.out.println(p.id);
		Child c2 = (Child)p;
		c2.grade = "VVIP";
//		System.out.println(c2.id);
//		System.out.println(c2.grade);
		Parent p2 = new Parent();
		p2.printAll();
		p.printAll();
		
		c2.printAll();
		}

}
