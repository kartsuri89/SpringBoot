package com.home.bean;

import java.math.BigInteger;

public class EmployeeBean {
	
	public EmployeeBean(){
		
	}

	public EmployeeBean(String empName, String empCity, String empContactNumber) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.empContactNumber = empContactNumber;
	}
	
	private long empId;
	private String empName;
	private String empCity;
	private String empContactNumber;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(String empContactNumber) {
		this.empContactNumber = empContactNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
