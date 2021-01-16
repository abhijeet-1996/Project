package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class CustomerContact {

	@Id
	@GeneratedValue
	private int customercontactid;
	private String name;
	private long contactnumber;
	
	public int getCustomercontactid() {
		return customercontactid;
	}
	public void setCustomercontactid(int customercontactid) {
		this.customercontactid = customercontactid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "CustomerContact [customercontactid=" + customercontactid + ", name=" + name + ", contactnumber="
				+ contactnumber + "]";
	}
}
