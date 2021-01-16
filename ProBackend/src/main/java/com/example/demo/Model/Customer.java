package com.example.demo.Model;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerid;
	private String firstname;
	private String lastname;
	private String gender;
	private String dob;
	private String address;
	private String governmentidproof;
	private String governmentidnumber;
	private String email;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid", referencedColumnName="customerid")
	private Set<CustomerContact> customercontacts;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public Set<CustomerContact> getCustomercontacts() {
		return customercontacts;
	}

	public void setCustomercontacts(Set<CustomerContact> customercontacts) {
		this.customercontacts = customercontacts;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", governmentidproof="
				+ governmentidproof + ", governmentidnumber=" + governmentidnumber + ", email=" + email + ", password="
				+ password + ", customercontacts=" + customercontacts + "]";
	}

}
