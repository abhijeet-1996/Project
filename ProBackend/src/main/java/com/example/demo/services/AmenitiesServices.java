package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Amenities;
import com.example.demo.Repository.AmenitiesRepo;

@Service
public class AmenitiesServices {

	@Autowired
	AmenitiesRepo repo;
	public List<Amenities> getAmenities() {
		return repo.findAll();
	}
}
