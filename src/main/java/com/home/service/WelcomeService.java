package com.home.service;

import java.util.List;

import com.home.bean.EmployeeBean;
import com.home.model.Employee;

public interface WelcomeService {
	
	 public void addEmployee(Employee employee);

	 public List<EmployeeBean> listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);

}
