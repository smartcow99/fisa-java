/*	학습내용
 *  1. java.lang package's main class
 *  2. 용도
 *   - 기본 타입 8가지를 support
 *   - 객체 타입들로만 관리되어야 하는 데이터군집에 가령 2 형식의 데이터 저장을 해야 할 경우 기본타입이라 저장 불가 현상 발생
 *   - 해결책: 2 값을 보유한 순수 숫자 형식의 객체로 생성해서 활용
 *   
 *  3. 참고
 *   - String 타입은 class 기반의 객체이지만 new 생성자 없이 " " 로 자동 객체
 *   - 배열도 {}를 통해 생성자 없이 자동 객체
 *   	: 저장 공간은 heap
 *   - int i = new Integer(3)
 *   - Integer ii = 3;
 *   	: 둘 다 가능
 */

package step02;

public class WrapperAPI {
	// ?
	static String m1() {		// return 을 위해서 String을 반환한다는 사실을 적시해야함.
		return "fisa";
	}
	
	static Integer m2() {		// main에서 따로 생성자를 호출하지 않고 사용하려 하기에 static 키워드를 사용해야함.
		return 3;
	}
	
	int m3() {					// return을 int라고 적시해두었기에 return i를 통해서 값을 전달해야함.
		Integer i = 5;
		return i;
	}
	
	public static void main(String [] args) {
		int v1 = m2();
		System.out.println(v1);
		int v2 = Integer.parseInt("3");			//
//		int v3 = Integer.parseInt("오");			//
//		System.out.println(v3);
		System.out.println(v2);
		
		Integer i2 = new Integer(3);
		System.out.println(i2);
	}
}
