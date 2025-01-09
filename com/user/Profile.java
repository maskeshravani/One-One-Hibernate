package com.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profile {

	@Id
	private int id;
	private String address;
	private long phone;
	private String email;
	private String password;
	
	public Profile() {
		super();
		
	}

	public Profile(int id, String address, long phone, String email, String password) {
		super();
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", address=" + address + ", phone=" + phone + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

}
