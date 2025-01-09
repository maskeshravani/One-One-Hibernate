package com.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_Id;
	private String e_name;
	private String address;
	private String depa;
	
	@OneToOne
	private CompanyCar com;

	public Employee() {
		super();
	
	}

	public Employee(int e_Id, String e_name, String address, String depa, CompanyCar com) {
		super();
		this.e_Id = e_Id;
		this.e_name = e_name;
		this.address = address;
		this.depa = depa;
		this.com = com;
	}

	public int getE_Id() {
		return e_Id;
	}

	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepa() {
		return depa;
	}

	public void setDepa(String depa) {
		this.depa = depa;
	}

	public CompanyCar getCom() {
		return com;
	}

	public void setCom(CompanyCar com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "Employee [e_Id=" + e_Id + ", e_name=" + e_name + ", address=" + address + ", depa=" + depa + ", com="
				+ com + "]";
	}
	
	
}
