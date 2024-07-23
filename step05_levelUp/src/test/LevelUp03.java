package test;

import org.junit.Test;

interface Calc {
	// 실행 직후 다음과 같은 미완성 메소드로 변환
	// public abstract int calc(int i1, int i2);

	public int add(int i1, int i2);
	// TODO: return i1 + i2

	public int sub(int i1, int i2);
	// TODO: return i1 - i2

	public int mul(int i1, int i2);
	// TODO: return i1 * i2

	public int mod(int i1, int i2);
	// TODO: return i1 % i2

	public int div(int i1, int i2);
	// TODO: return i1 / i2
}

@FunctionalInterface
interface Calc2 {
	public int calc(int i1, int i2);
}

class Calculator implements Calc {
	@Override
	public int sub(int i1, int i2) {
		// TODO Auto-generated method stub
		return i1 - i2;
	}

	@Override
	public int mul(int i1, int i2) {
		// TODO Auto-generated method stub
		return i1 * i2;
	}

	@Override
	public int mod(int i1, int i2) {
		// TODO Auto-generated method stub

		return i1 % i2;
	}

	@Override
	public int add(int i1, int i2) {
		// TODO Auto-generated method stub
		return i1 + i2;
	}

	@Override
	public int div(int i1, int i2) {
		// TODO Auto-generated method stub
		if (i2 != 0) {
			return i1 / i2;
		}
		return -1;
	}
}

public class LevelUp03 {

	@Test
	public void m1() {
		Calculator c = new Calculator();

		System.out.println(c.add(10, 11));
		System.out.println(c.mul(10, 11));
		System.out.println(c.sub(999, 88));
		System.out.println(c.mod(12345, 11));
		System.out.println(c.div(10, 2));
		System.out.println(c.div(5, 0));

		Calc2 cc = (i1, i2) -> i1 + i2;
		System.out.println(cc.calc(10, 11));

		cc = (i1, i2) -> i1 * i2;
		System.out.println(cc.calc(7, 9));

		cc = (i1, i2) -> {
			if ((i1 + i2) % 2 == 0) {
				return (i1 + i2) / 2;
			} else {
				return (i1 + i2 + 1) / 2;
			}
		};

		System.out.println(cc.calc(10, 11));
		System.out.println(cc.calc(10, 20));

		cc = (i1, i2) -> {
			System.out.println("i1 + i2 = " + (i1 + i2));
			return i1 - i2;
		};
		System.out.println(cc.calc(15, 8));
	}

}
