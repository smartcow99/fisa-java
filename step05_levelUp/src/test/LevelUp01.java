package test;

import java.util.ArrayList;

import org.junit.Test;

import model.domain.Customer;

public class LevelUp01 {

	@Test
	public void m1() {
		Customer admin = new Customer("admin", "pw");
		Customer c = new Customer("customer", "password");
		System.out.println(admin);
		System.out.println(c);

		ArrayList<Customer> arr = new ArrayList<>();
		arr.add(new Customer("c1", "pw1"));
		arr.add(new Customer("c2", "pw2"));
		arr.add(new Customer("c3", "pw3"));

		System.out.println("---step01---");
		arr.forEach(System.out::println);
		System.out.println();

		System.out.println("---step02---");
		arr.forEach(item -> System.out.println(item));
		System.out.println();

		System.out.println("---step03---");
		for (Customer cc : arr) {
			System.out.println(cc);
		}
		System.out.println();

		System.out.println("---step04---");
		int size = arr.size();
		for (int i = 0; i < size; i++) {
			System.out.println(arr.get(i));
		}
	}
}
