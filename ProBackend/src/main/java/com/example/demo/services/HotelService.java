package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import com.example.demo.Model.Hotel;

public interface HotelService {
	
	List<Hotel> getHotels();
	Optional<Hotel> getHotel(int id);
	Hotel addHotel(Hotel prod);
	void deleteHotel(int id);
	Hotel updateHotel(Hotel prod); 
	List<Hotel>  getHotelByState(String state);
	
}
