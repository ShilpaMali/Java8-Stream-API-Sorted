package com.velocity.employee.name.salary.minimum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "vinit", 7000));
		al.add(new Employee(102, "akash", 8000));
		al.add(new Employee(103, "suresh", 7500));
		List<Employee> empSalList = al.stream().sorted((emp1, emp2) -> {
			if (emp1.getEmpSalary() == emp2.getEmpSalary()) {
				return 0;
			} else if (emp1.getEmpSalary() > emp2.getEmpSalary()) {
				return 1;
			} else {
				return -1;
			}
		}).collect(Collectors.toList());

		System.out.println(empSalList.get(0).getEmpName());
	}

}
