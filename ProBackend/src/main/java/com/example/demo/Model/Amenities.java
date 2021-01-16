package com.example.demo.Model;

import java.util.List;

import javax.persistence.*;
@Entity
public class Amenities {

	@Id
	@GeneratedValue
	private int amenitiesid;
	private String amenitiesname;
	private int cost;
	@ManyToMany(mappedBy="amenities")
	private List<Hotel> hotels;
	
	public int getAmenitiesid() {
		return amenitiesid;
	}
	public void setAmenitiesid(int amenitiesid) {
		this.amenitiesid = amenitiesid;
	}
	public String getAmenitiesname() {
		return amenitiesname;
	}
	public void setAmenitiesname(String amenitiesname) {
		this.amenitiesname = amenitiesname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	@Override
	public String toString() {
		return "Amenities [amenitiesid=" + amenitiesid + ", amenitiesname=" + amenitiesname + ", cost=" + cost
				+ ", hotels=" + hotels + "]";
	}

	
	
}
