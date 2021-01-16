package com.example.demo.Model;

import java.util.Set;

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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "staffid", referencedColumnName="staffid")
	private Set<StaffContact> staffcontacts;
	
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
	public Set<StaffContact> getStaffcontacts() {
		return staffcontacts;
	}
	public void setStaffcontacts(Set<StaffContact> staffcontacts) {
		this.staffcontacts = staffcontacts;
	}
	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", firstname=" + firstname + ", lastname=" + lastname + ", gender="
				+ gender + ", dateofbirth=" + dateofbirth + ", address=" + address + ", governmentidproof="
				+ governmentidproof + ", governmentidnumber=" + governmentidnumber + ", designation=" + designation
				+ ", email=" + email + ", password=" + password + ", staffcontacts=" + staffcontacts + "]";
	}

}
