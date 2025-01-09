package com.passport;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passport {		
	
		@Id
		private int id;
		private String pass_No;
		private String conntry;
		
		public Passport() {
			super();
		}

		public Passport(int id, String pass_No, String conntry) {
			super();
			this.id = id;
			this.pass_No = pass_No;
			this.conntry = conntry;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPass_No() {
			return pass_No;
		}

		public void setPass_No(String pass_No) {
			this.pass_No = pass_No;
		}

		public String getConntry() {
			return conntry;
		}

		public void setConntry(String conntry) {
			this.conntry = conntry;
		}

		@Override
		public String toString() {
			return "Passport [id=" + id + ", pass_No=" + pass_No + ", conntry=" + conntry + "]";
		}
		
	

}
