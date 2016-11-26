package com.home.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.bean.EmployeeBean;
import com.home.dao.WelcomeDao;
import com.home.model.Employee;

@Service("welcomeService")
@Transactional(readOnly = true)
public class WelcomeServiceImpl implements WelcomeService{
	
	@Autowired
	private WelcomeDao welcomeDao;
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeBean> listEmployeess() {
		List<EmployeeBean> list = new ArrayList<EmployeeBean>();
		list.add(new EmployeeBean("Suriya","Chennai","9790719474"));
		list.add(new EmployeeBean("Sanjay","US","8300154474"));
		list.add(new EmployeeBean("Ramesh","Europe","9710391676"));
		return list;
	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}
