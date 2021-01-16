package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Hotel;


public class HotelController {

	
	@Autowired
	private HotelService service;

		@GetMapping("/hotels")   
		  public List<Hotel> getHotels()
		  {
			return service.getHotels();
		  }
		
		@GetMapping("/hotels/{id}")   
		public Optional<Hotel> getHotel(@PathVariable("id") int id)
		{
			return service.getHotel(id);
		}
		
		@PostMapping(path="/hotels",consumes= {"application/json"})
		public Hotel addHotel(@RequestBody Hotel prod)
		{
			service.addHotel(prod);
			return prod;
		}
		
		@DeleteMapping("/hotels/{id}")
		public void deleteHotel(@PathVariable("id") int id)
		{
			service.deleteHotel(id);
		}
		
		@PutMapping(path="/hotels/{id}",consumes = {"application/json"})
		public Hotel updateHotel(@RequestBody Hotel prod)
		{
			service.updateHotel(prod);
			return prod;
		}
}
