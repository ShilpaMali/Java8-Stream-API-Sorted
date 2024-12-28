package com.velocity.employee.salary.with;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "vinit", 7000));
		al.add(new Employee(102, "akash", 7000));
		al.add(new Employee(103, "suresh", 7500));
		al.stream().sorted((emp1, emp2) -> {
			if (emp1.getEmpSalary() == emp2.getEmpSalary()) {
				return 0;
			} else if (emp1.getEmpSalary() > emp2.getEmpSalary()) {
				return 1;
			} else {
				return -1;
			}
		}).forEach(e1 -> System.out.println(e1));
	}

}
