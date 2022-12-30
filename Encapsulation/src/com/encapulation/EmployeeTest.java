package com.encapulation;

import java.util.Scanner;

public class EmployeeTest {
	public static void getUserInput() {
		
		System.out.println("Enter Employee Id");
		Scanner scanner= new Scanner(System.in);
		int id =scanner.nextInt();
		System.out.println("Enter Employee Name");
		Scanner scanner1= new Scanner(System.in);
		String name=scanner.next();
		System.out.println("Enter Employee city");
		Scanner scanner2= new Scanner(System.in);
		String city=scanner.next();
		
		Employee emp= new Employee();
		emp.setEmployeeeId(id);
		emp.setEmployeeName(name);
		emp.setEmployeeCity(city);
		
		System.out.println("Employee id>>"+emp.getEmployeeeId());
		System.out.println("Employee name>>"+emp.getEmployeeName());
		System.out.println("Employee city>>"+emp.getEmployeeCity());
		
	}

	public static void main(String[] args) {
		getUserInput();
	}
}
