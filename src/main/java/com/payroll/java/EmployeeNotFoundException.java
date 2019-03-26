package com.payroll.java;



public class EmployeeNotFoundException extends RuntimeException{

		EmployeeNotFoundException(Long id) {
			super("Could not find employee " + id);
		}
	
}
