package com.healthcare.model;

import java.util.Date;

public class MedicalRecord  {
		
	Date admit_date;
	String current_proc;
	String billing_amt;
	Date billing_Due_date;
	
	public Date getAdmit_date() {
		return admit_date;
	}
	public void setAdmit_date(Date admit_date) {
		this.admit_date = admit_date;
	}
	public String getCurrent_proc() {
		return current_proc;
	}
	public void setCurrent_proc(String current_proc) {
		this.current_proc = current_proc;
	}
	public String getBilling_amt() {
		return billing_amt;
	}
	public void setBilling_amt(String billing_amt) {
		this.billing_amt = billing_amt;
	}
	public Date getBilling_Due_date() {
		return billing_Due_date;
	}
	public void setBilling_Due_date(Date billing_Due_date) {
		this.billing_Due_date = billing_Due_date;
	}

	
	

}
