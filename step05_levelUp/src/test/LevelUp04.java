package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import model.domain.Customer;

public class LevelUp04 {

	@Test
	public void m1() {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		List<String> datas = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee", "ffffff");

		// Q1 더블 연산자 + forEach()를 사용하여 출력하기
		System.out.println("Q1 ***");
		numbers.forEach(System.out::println);
		System.out.println();

		// Q2 3의 배수를 제외한 값만 출력하기
		System.out.println("Q2 ***");
		numbers.forEach(value -> {
			if (Integer.parseInt(value) % 3 != 0) {
				System.out.println(value);
			}
		});
		System.out.println();

		// Q3 Stream API를 활용하여 2의 배수를 제외한 값만 출력하기
		System.out.println("Q3 ***");
		numbers.stream().filter(value -> Integer.parseInt(value) % 2 != 0).forEach(System.out::println);
		System.out.println();
		
		// Q4 datas의 문자열 길이가 1인 경우 제외하고 데이터 출력
		System.out.println("Q4 ***");
		datas.stream().filter(value -> value.length() != 1).forEach(System.out::println);
		System.out.println();
		
		// Q5 datas의 문자열 길이가 1인 데이터 제외하고 문자열 길이 출력
		System.out.println("Q5 ***");
		datas.stream().filter(value -> value.length() != 1).forEach(value -> System.out.println(value.length()));
		System.out.println();
		
		// Q6 사용자 정의 객체 타입(참조 타입, 클래스 타입) Customer를 활용하여 
		System.out.println("Q6 ***");
		ArrayList<Customer> arr = new ArrayList<>();
		arr.add(new Customer("c1", "pw1"));
		arr.add(new Customer("c2", "pw2"));
		arr.add(new Customer("c3", "pw3"));
	
		arr.stream().filter(value -> !value.getId().equals("c2")).forEach(System.out::println);
		arr.stream().filter(value -> !value.getId().equals("c2")).forEach(value -> System.out.println(value.getId()));
		System.out.println();
		
		// Q7 연산
		System.out.println("Q7 ***");
		int result = numbers.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(result);
		double result2 = numbers.stream().mapToDouble(Double::parseDouble).sum();
		System.out.println(result2);
		System.out.println();
		
		// Q8 Optional
		System.out.println("Q8 ***");
		System.out.println(numbers.stream().mapToInt(Integer::parseInt).max().getAsInt());
		System.out.println(numbers.stream().mapToInt(Integer::parseInt).min().getAsInt());
		System.out.println(numbers.stream().mapToInt(Integer::parseInt).count());
		System.out.println();
	}

}
