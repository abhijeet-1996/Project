package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int staffid;
	private String firstname;
	private String lastname;
	private String gender;
	private String dateofbirth;
	private String address ;
	private String governmentidproof;
	private String governmentidnumber;
	private String designation;
	private String email;
	private String password;
	private long phone1;
	private long phone2;

	
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGovernmentidproof() {
		return governmentidproof;
	}
	public void setGovernmentidproof(String governmentidproof) {
		this.governmentidproof = governmentidproof;
	}
	public String getGovernmentidnumber() {
		return governmentidnumber;
	}
	public void setGovernmentidnumber(String governmentidnumber) {
		this.governmentidnumber = governmentidnumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	public long getPhone1() {
		return phone1;
	}
	public void setPhone1(long phone1) {
		this.phone1 = phone1;
	}
	public long getPhone2() {
		return phone2;
	}
	public void setPhone2(long phone2) {
		this.phone2 = phone2;
	}
	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", firstname=" + firstname + ", lastname=" + lastname + ", gender="
				+ gender + ", dateofbirth=" + dateofbirth + ", address=" + address + ", governmentidproof="
				+ governmentidproof + ", governmentidnumber=" + governmentidnumber + ", designation=" + designation
				+ ", email=" + email + ", password=" + password + ", phone1=" + phone1 + ", phone2=" + phone2 + "]";
	}

	
}
