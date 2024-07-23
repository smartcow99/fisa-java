package step02_structure;

import model.domain.PeopleDTO;

public class OOP2 {
	static Object m1() {
		return new Parent();
	}
	
	static Object[] m2() {
		Object[] o = new Object[3];
		o[0] = "str";
		o[1] = 3;
		o[2] = new PeopleDTO("new name", 28);
		
		return o;
		
	}
	
	public static void main(String[] args) {
		// question
		// 1. m2 호출
		// 2. index 0의 문자열 길이 출력
		// 3. index 2의 id 출력
		// 4. index 2의 id 다른 값으로 변경
		// 5. index 2의 id 출력
		
		Object[] o = m2();
		String s = (String)o[0];
		PeopleDTO pd = (PeopleDTO)o[2];
		
		System.out.println(((String)o[0]).length());
		
		System.out.println(s.length());
		System.out.println(pd.getName());
		pd.setName("changed name");
		System.out.println(pd.getName());

		
		Parent p = (Parent)m1();
		p.id = "person 1";
		p.printAll();
	}
}
