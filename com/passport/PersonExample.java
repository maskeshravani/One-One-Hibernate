package com.passport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PersonExample {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String address;
	private long mNo;
	
	@OneToOne
	private Passport pass;

	public PersonExample() {
		super();
		
	}

	public PersonExample(int id, String name, String email, String address, long mNo, Passport pass) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mNo = mNo;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getmNo() {
		return mNo;
	}

	public void setmNo(long mNo) {
		this.mNo = mNo;
	}

	public Passport getPass() {
		return pass;
	}

	public void setPass(Passport pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "PersonExample [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mNo="
				+ mNo + ", pass=" + pass + "]";
	}
	
	
	

}
