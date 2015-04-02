package com.healthcare.model;

import java.util.Date;


import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	Date created_at;
	String inscomp_id;
	String policy_num;
	String billing_address;
	String billing_city;
	String billing_state;
	String billing_country;
	String billing_zipcode;
	String billing_phno;
	
	@NotEmpty
	public Date getCreated_at() {
		return created_at;
	}
	@NotEmpty
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@NotEmpty
	public String getInscomp_id() {
		return inscomp_id;
	}
	@NotEmpty
	public void setInscomp_id(String inscomp_id) {
		this.inscomp_id = inscomp_id;
	}
	@NotEmpty
	public String getPolicy_num() {
		return policy_num;
	}
	@NotEmpty
	public void setPolicy_num(String policy_num) {
		this.policy_num = policy_num;
	}
	@NotEmpty
	public String getBilling_address() {
		return billing_address;
	}
	@NotEmpty
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	@NotEmpty
	public String getBilling_city() {
		return billing_city;
	}
	@NotEmpty
	public void setBilling_city(String billing_city) {
		this.billing_city = billing_city;
	}
	@NotEmpty
	public String getBilling_state() {
		return billing_state;
	}
	@NotEmpty
	public void setBilling_state(String billing_state) {
		this.billing_state = billing_state;
	}
	@NotEmpty
	public String getBilling_country() {
		return billing_country;
	}
	@NotEmpty
	public void setBilling_country(String billing_country) {
		this.billing_country = billing_country;
	}
	@NotEmpty
	public String getBilling_zipcode() {
		return billing_zipcode;
	}
	@NotEmpty
	public void setBilling_zipcode(String billing_zipcode) {
		this.billing_zipcode = billing_zipcode;
	}
	@NotEmpty
	public String getBilling_phno() {
		return billing_phno;
	}
	@NotEmpty
	public void setBilling_phno(String billing_phno) {
		this.billing_phno = billing_phno;
	}
	

}
