package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class HotelContacts {

	@Id
	@GeneratedValue
	private int hotelcontactid;
	private long contactnumber;
	
	public int getHotelcontactid() {
		return hotelcontactid;
	}
	public void setHotelcontactid(int hotelcontactid) {
		this.hotelcontactid = hotelcontactid;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	
}
