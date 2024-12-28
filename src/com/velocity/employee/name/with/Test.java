package com.velocity.employee.name.with;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "vinit", 7000));
		al.add(new Employee(102, "akash", 8000));
		al.add(new Employee(103, "suresh", 7500));
		al.stream().sorted((emp1,emp2)->
		emp1.getEmpName().compareTo(emp2.getEmpName()))
		.forEach(e1->System.out.println(e1));
	}

	
}
