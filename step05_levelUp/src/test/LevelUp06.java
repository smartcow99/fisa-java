package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.junit.Test;

import model.domain.Customer;

public class LevelUp06 {

//	@Test
	public void m1() {
		ArrayList<Customer> arr = new ArrayList<>();
		arr.add(new Customer("id1", "pw1", 10, "Sangam", "vip", "Male"));
		arr.add(new Customer("id2", "pw2", 12, "Dongjak", "gold", "Male"));
		arr.add(new Customer("id3", "pw3", 24, "Gwanak", "red", "Female"));

		// 고유한 구분값(Key)를 통해 데이터를 구분하여 사용
		// String 타입의 Key를 통해 Customer 객체를 구분
		HashMap<String, Customer> map = new HashMap<>();
		map.put("key1", new Customer("id4", "pw4", 24, "Gwangju", "vip", "Female"));
		map.put("key2", new Customer("id5", "pw5", 11, "Busan", "red", "Male"));
		map.put("key3", new Customer("id6", "pw6", 30, "Incheon", "bronze", "Male"));

		map.forEach((k, v) -> System.out.println(k + " " + v));

		// Q1 map에 저장된 모든 고객의 나이값 합
		System.out.println("Q1 ***");
		System.out.println(map.values().stream().mapToInt(Customer::getAge).sum());
		System.out.println();

		// Q2 map에 저장된 모든 고객의 나이값이 20미만인 고객의 나이값 합
		System.out.println("Q2 ***");
		System.out.println(map.values().stream().mapToInt(Customer::getAge).filter(value -> value < 20).sum());
		System.out.println();

	}

	@Test
	public void m2() {
//		String str = null;
		String str = "string";
		Optional<String> op = Optional.ofNullable(str);
//		Optional<String> op = Optional.of(str);
		System.out.println(op);
		op.ifPresent(value -> System.out.println(value));
	}

	@Test
	public void m3() {
		String str = null;
		Optional<String> op = Optional.ofNullable(str);
		System.out.println(op.isEmpty());
		System.out.println(op.isPresent());
		System.out.println(op.orElse("Is null"));
	}

	@Test
	/*
	 * 프로그램 실행 중지를 방지하기 위한 처리 코드는 어떻게?
	 */
	public void m4() {
//		HashMap<String, Customer> map = null;
		HashMap<String, Customer> map = new HashMap<>();
		map.put("key1", new Customer("id4", "pw4", 24, "Gwangju", "vip", "Female"));
		map.put("key2", new Customer("id5", "pw5", 11, "Busan", "red", "Male"));
		map.put("key3", new Customer("id6", "pw6", 30, "Incheon", "bronze", "Male"));

		System.out.println("Q1 ***");
		Optional<HashMap<String, Customer>> op = Optional.ofNullable(map);
		op.ifPresent(value -> System.out
				.println(value.values().stream().mapToInt(Customer::getAge).filter(age -> age < 20).sum()));

	}

}
