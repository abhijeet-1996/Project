package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepo repo;
	
	@Override
	public List<Hotel> getHotels() {
		return repo.findAll();
	}

	@Override
	public Optional<Hotel> getHotel(int id) {
		return repo.findById(id);
	}

	@Override
	public Hotel addHotel(Hotel prod) {
		return repo.save(prod);
	}

	@Override
	public void deleteHotel(int id) {
		Hotel p = repo.getOne(id);
		repo.delete(p);
	}

	@Override
	public Hotel updateHotel(Hotel prod) {
		repo.save(prod);
		return prod;
	}

}
