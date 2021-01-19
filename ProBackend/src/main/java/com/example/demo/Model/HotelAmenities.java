package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HotelAmenities {

	@Id
	@GeneratedValue
	private int id;
	private int hotelid;
	private int amenitiesid;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getAmenitiesid() {
		return amenitiesid;
	}
	public void setAmenitiesid(int amenitiesid) {
		this.amenitiesid = amenitiesid;
	}
	@Override
	public String toString() {
		return "HotelAmenities [id=" + id + ", hotelid=" + hotelid + ", amenitiesid=" + amenitiesid + "]";
	}
	
	
}
