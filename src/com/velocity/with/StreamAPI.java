package com.velocity.with;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(20);

		// using java 8
		list.stream().sorted().forEach(s -> System.out.println(s));

		// how to sort data and store it into collection
		List<Integer> l = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order>>" + l);

		// desending order
		List<Integer> l1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("desending order>>" + l1);
	}

}
