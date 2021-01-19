package com.example.demo.Model;


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
	private String town;
	private String state;
	private int pin;
	private long phone1;
	private long phone2;
	
	

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

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
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", governmentidproof="
				+ governmentidproof + ", governmentidnumber=" + governmentidnumber + ", email=" + email + ", password="
				+ password + ", town=" + town + ", state=" + state + ", pin=" + pin + ", phone1=" + phone1 + ", phone2="
				+ phone2 + "]";
	}
	
	
}
