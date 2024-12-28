package com.velocity.without;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(20);
		Collections.sort(list);
		System.out.println("Ascending order>>" + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Desending order>>" + list);
	}

}
