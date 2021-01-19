package com.example.demo.Model;

import javax.persistence.*;
@Entity
public class Amenities {

	@Id
	@GeneratedValue
	private int amenitiesid;
	private String amenitiesname;
	private int cost;
	
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
	@Override
	public String toString() {
		return "Amenities [amenitiesid=" + amenitiesid + ", amenitiesname=" + amenitiesname + ", cost=" + cost + "]";
	}

	
}
