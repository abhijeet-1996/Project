package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.HotelAmenities;
import com.example.demo.Repository.HotelAmenitiesRepo;

@Service
public class HotelAmenitiesServices {

	@Autowired
	private HotelAmenitiesRepo repo;
	
	public List<HotelAmenities> getHotelAmenities() {
		return repo.findAll();
	}
	
	public HotelAmenities addHotelAmenities(HotelAmenities cont) {
		return repo.save(cont);
	}
}
