package com.home.service;

import java.util.List;

import com.home.model.Employee;

public interface WelcomeService {
	
	 public void addEmployee(Employee employee);

	 public List<Employee> listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);

}
