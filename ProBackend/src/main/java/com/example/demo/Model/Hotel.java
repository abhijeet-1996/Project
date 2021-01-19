package com.example.demo.Model;

import javax.persistence.*;


@Entity
public class Hotel {
	@Id
	@GeneratedValue
	private int hotelid;
	private String hotelname;
	private String hoteldescription;
	private String address;
	private String state; 
	private String city;
	private int pincode; 
	private int totalrooms;
	private int roomsavailable;
	private int rent; 
	private int rating;
	private long phone1;
	private long phone2;

	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	
	public String getHoteldescription() {
		return hoteldescription;
	}
	public void setHoteldescription(String hoteldescription) {
		this.hoteldescription = hoteldescription;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public int getTotalrooms() {
		return totalrooms;
	}
	public void setTotalrooms(int totalrooms) {
		this.totalrooms = totalrooms;
	}
	
	public int getRoomsavailable() {
		return roomsavailable;
	}
	public void setRoomsavailable(int roomsavailable) {
		this.roomsavailable = roomsavailable;
	}
	
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
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
		return "Hotel [hotelid=" + hotelid + ", hotelname=" + hotelname + ", hoteldescription=" + hoteldescription
				+ ", address=" + address + ", state=" + state + ", city=" + city + ", pincode=" + pincode
				+ ", totalrooms=" + totalrooms + ", roomsavailable=" + roomsavailable + ", rent=" + rent + ", rating="
				+ rating + ", phone1=" + phone1 + ", phone2=" + phone2 + "]";
	}
	
}
