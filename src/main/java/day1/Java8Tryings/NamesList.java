package day1.Java8Tryings;

import java.util.Comparator;
import java.util.List;

public class NamesList {

	public static void getNamesList() {
		PrepareList name = new PrepareList();
		List<String> names = name.getNames();
		System.out.println(names);
		names.stream().sorted().forEach(System.out::println);
		System.out.println(names);
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println(names.stream().findFirst());
	}

}
