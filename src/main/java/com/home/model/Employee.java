package com.home.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Employee")
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "empId")
	private long empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empCity")
	private String empCity;
	
	@Column(name="empContactNumber")
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
