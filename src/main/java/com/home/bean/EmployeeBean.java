package com.home.bean;

import java.math.BigInteger;

public class EmployeeBean {

	private long empId;
	private String empName;
	private String empCity;
	private BigInteger empContactNumber;
	
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
	public BigInteger getEmpContactNumber() {
		return empContactNumber;
	}
	public void setEmpContactNumber(BigInteger empContactNumber) {
		this.empContactNumber = empContactNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
