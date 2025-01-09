package com.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Supplier {

	@Id
	private int s_id;
	private String address;
	private long mNo;
	
	@OneToOne
	private Product product;

	public Supplier() {
		super();
		
	}

	public Supplier(int s_id, String address, long mNo, Product product) {
		super();
		this.s_id = s_id;
		this.address = address;
		this.mNo = mNo;
		this.product = product;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Supplier [s_id=" + s_id + ", address=" + address + ", mNo=" + mNo + ", product=" + product + "]";
	}
	
	
	
}
