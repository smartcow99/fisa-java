package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import model.domain.Customer;

public class LevelUp05 {

	@Test
	public void m1() {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		List<String> data = null;

		// Q1
		System.out.println("Q1 ***");
		System.out.println(numbers.stream().mapToInt(Integer::parseInt).filter(value -> value % 2 == 0).count());
		System.out.println();

		// Q2 3명의 고객 정보 생성
		// 나이가 20 미만 고객들의 나이 값의 합 출력
		ArrayList<Customer> arr = new ArrayList<>();
		arr.add(new Customer("id1", "pw1", 19, "SangAmDong", "11", "Male"));
		arr.add(new Customer("id2", "pw2", 29, "DongDaeMun", "FreshMan", "Female"));
		arr.add(new Customer("id3", "pw3", 3, "NakSanGongWon", "0", "Male"));

		System.out.println(arr.stream().mapToInt(Customer::getAge).filter(value -> value < 20).sum());

	}
}
