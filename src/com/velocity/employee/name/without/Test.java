package com.velocity.employee.name.without;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "vinit", 7000));
		al.add(new Employee(102, "akash", 8000));
		al.add(new Employee(103, "suresh", 7500));
		Collections.sort(al,new NameComparator());
		System.out.println(al);
	}

}
