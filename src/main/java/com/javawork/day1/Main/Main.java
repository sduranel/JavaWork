package com.javawork.day1.Main;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.javawork.day1.Array.ListArray;

public class Main {
	public static void main(String[] args) {
		ListArray array = new ListArray();
		int[] arr = array.initiliazeArray();
		Stream<Integer> arr2 = Arrays.stream(arr).boxed();
//		System.out.println(arr2.sorted().toList());
		System.out.println(arr2.sorted().collect(Collectors.toList()));	
	}

}
 