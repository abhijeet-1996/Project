package com.example.demo.Model;

import java.util.List;
import java.util.Set;

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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelid", referencedColumnName="hotelid")
	private Set<HotelContacts> hotelcontacts;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelid", referencedColumnName="hotelid")
	private Set<Staff> staff;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelid", referencedColumnName="hotelid")
	private Set<Customer> customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelid", referencedColumnName="hotelid")
	private Set<Booking> booking;

	@ManyToMany
	@JoinTable(name="hotelamenities",joinColumns=@JoinColumn(name="hotelid"),
			inverseJoinColumns=@JoinColumn(name="amenitiesid"))
	private List<Amenities> amenities;
	
	
	
	public List<Amenities> getAmenities() {
		return amenities;
	}
	public void setAmenities(List<Amenities> amenities) {
		this.amenities = amenities;
	}
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
	
	public Set<HotelContacts> getHotelcontacts() {
		return hotelcontacts;
	}
	public void setHotelcontacts(Set<HotelContacts> hotelcontacts) {
		this.hotelcontacts = hotelcontacts;
	}
	
	 
	public Set<Staff> getStaff() {
		return staff;
	}
	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}
	
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
	public Set<Booking> getBooking() {
		return booking;
	}
	public void setBooking(Set<Booking> booking) {
		this.booking = booking;
	}
	@Override
	public String toString() {
		return "Hotel [hotelid=" + hotelid + ", hotelname=" + hotelname + ", hoteldescription=" + hoteldescription
				+ ", address=" + address + ", state=" + state + ", city=" + city + ", pincode=" + pincode
				+ ", totalrooms=" + totalrooms + ", roomsavailable=" + roomsavailable + ", rent=" + rent + ", rating="
				+ rating + ", hotelcontacts=" + hotelcontacts + ", staff=" + staff + ", customer=" + customer
				+ ", booking=" + booking + ", amenities=" + amenities + "]";
	}
	
}
