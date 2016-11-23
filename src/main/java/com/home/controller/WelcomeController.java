package com.home.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.bean.EmployeeBean;
import com.home.model.Employee;
import com.home.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeBean>> listEmployees() {
		List<Employee> users = welcomeService.listEmployeess();
		if (users.isEmpty()) {
			//return new ResponseEntity<prepareListofBean(users)>(HttpStatus.NO_CONTENT);
		}
		//return new ResponseEntity<>(users, HttpStatus.OK);
		return null;
	}

	@SuppressWarnings("unused")
	private Employee prepareModel(EmployeeBean employeeBean) {
		Employee employee = new Employee();
		employee.setEmpName(employeeBean.getEmpName());
		employee.setEmpCity(employeeBean.getEmpCity());
		employee.setEmpContactNumber(employeeBean.getEmpContactNumber());
		return employee;
	}

	private List<EmployeeBean> prepareListofBean(List<Employee> employees) {
		List<EmployeeBean> beans = null;
		if (employees != null && !employees.isEmpty()) {
			beans = new ArrayList<EmployeeBean>();
			EmployeeBean bean = null;
			for (Employee employee : employees) {
				bean = new EmployeeBean();
				bean.setEmpName(employee.getEmpName());
				bean.setEmpId(employee.getEmpId());
				bean.setEmpCity(employee.getEmpCity());
				bean.setEmpContactNumber(employee.getEmpContactNumber());
				beans.add(bean);
			}
		}
		return beans;
	}

	private EmployeeBean prepareEmployeeBean(Employee employee) {
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpName(employee.getEmpName());
		bean.setEmpId(employee.getEmpId());
		bean.setEmpContactNumber(employee.getEmpContactNumber());
		bean.setEmpId(employee.getEmpId());
		return bean;
	}

}
