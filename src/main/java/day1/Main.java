package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


	public static void main(String[] args) {
		ListArray array = new ListArray();
		int[] arr = array.initiliazeArray();
		Stream<Integer> arr2 = Arrays.stream(arr).boxed();
		System.out.println(arr2.sorted().toList());
	}

}
 