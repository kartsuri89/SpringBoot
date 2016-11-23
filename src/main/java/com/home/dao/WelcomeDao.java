package com.home.dao;

import java.util.List;

import com.home.model.Employee;

public interface WelcomeDao {
	
	public void addEmployee(Employee employee);

	 public List<Employee> listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);

}
