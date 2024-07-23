/*
 * About Array
 * 
 * - 하나의 변수로 다수의 데이터 관리
 * - 데이터 구분은 고유한 index
 * - index의 시작은 0부터
 * - 모든 배열은 객체(heap 메모리에 저장)
 * - python: list len()
 * - 변수 선언 위치
 * 	1. class{}: heap, 객체 내부
 *  2. 생성자 parameter: 생성자 실행 중에만 사용 가능한 로컬 변수
 *  3. 생성자 {}: 생성자 실행중에만 사용 가능한 로컬 변수
 *  4. 메소드 parameter: 메소드 실행 중에만 사용 가능한 로컬 변수
 *  5. 메소드 {}: 메소드 실행 중에만 사용 가능한 로컬 변수
 *  
 */

package step02_array;

import org.junit.Test;

import model.domain.PeopleDTO;

public class ArraySyntax {
	
	public void t1() {
		int [] i = new int[3];
		i[0] = 10;
		int i2 = 0;
		System.out.println(i[0]);
		System.out.println(i2);
		System.out.println("**********");
		
		String[] s = new String[2];
		System.out.println(s[0]);
		s[0] = "test";
		System.out.println(s[0]);
		
		PeopleDTO[] p = new PeopleDTO[2];
//		p[0].setName("person1");
//		System.out.println(p[0].getName());
		p[1] = new PeopleDTO("person2", 36);
		System.out.println(p[1].getAge());
	}
	
	public void t2() {
		int[] i = {1, 2, 3};
		String[] s = {"s1", null};
		PeopleDTO[] p = {null, new PeopleDTO("p1", 3)};
	}
	
	public PeopleDTO getPeople() {
		PeopleDTO[] p = {null, new PeopleDTO("p1", 3)};
		
		return p[1];
	}
	
	@Test
	public void running() {
//		t1();
		System.out.println(getPeople().getName());
	}

}
