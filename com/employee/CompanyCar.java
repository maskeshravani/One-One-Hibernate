package com.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class CompanyCar {

	@Id
	private int car_id;
	private int ModelYear;
	private String c_name;
	private String color;
	
	public CompanyCar() {
		super();
		
	}

	public CompanyCar(int car_id, int modelYear, String c_name, String color) {
		super();
		this.car_id = car_id;
		ModelYear = modelYear;
		this.c_name = c_name;
		this.color = color;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public int getModelYear() {
		return ModelYear;
	}

	public void setModelYear(int modelYear) {
		ModelYear = modelYear;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CompanyCar [car_id=" + car_id + ", ModelYear=" + ModelYear + ", c_name=" + c_name + ", color=" + color
				+ "]";
	}
	
	
}
