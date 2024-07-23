/*
 * ArrayList
 * 동적 메모리 크기
 * 배열은 한번 생성한 크기는 절대 불변
 * 실행 속도는 배열보다 떨어짐
 * 
 * 
 * 
 */

package step02_array;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListSyntax {
	
	@Test
	public void m1() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("ab");
		al.add("abc");
		System.out.println(al.size());
		System.out.println(al);
		
		String s = al.get(0);
		System.out.println(s + " " + s.length());
		
		al.remove(0);
		System.out.println(al.get(0));
		System.out.println(s);
	}

}
