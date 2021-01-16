package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class StaffContact {
	@Id
	@GeneratedValue
	private int staffcontactid;
	private String name;
	private long contactnumber;
	
	public int getStaffcontactid() {
		return staffcontactid;
	}
	public void setStaffcontactid(int staffcontactid) {
		this.staffcontactid = staffcontactid;
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
		return "StaffContact [staffcontactid=" + staffcontactid + ", name=" + name + ", contactnumber=" + contactnumber
				+ "]";
	}
}
