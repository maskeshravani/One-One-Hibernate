package com.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne
	private Profile profile;

	public User() {
		super();
		
	}

	public User(int id, String name, Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", profile=" + profile + "]";
	}
	
	
	
}
