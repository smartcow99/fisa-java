package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LevelUp02 {

	@Test
	public void m1() {
		Integer i1 = 1;
		Integer i2 = 2;
		Integer i3 = 3;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(i1);
		arr.add(i2);
		arr.add(i3);

		arr.forEach(i -> System.out.println(i));
		arr.forEach(System.out::println);

//		Arrays.asList(1, 2, 3).forEach(System.out::println);
//		Arrays.asList("1", "2", "3").forEach(System.out::println);

		Arrays.asList(11, 12, 13).forEach(i -> System.out.println(i % 10));
	}

}
