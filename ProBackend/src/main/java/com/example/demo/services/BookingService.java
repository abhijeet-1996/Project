package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Booking;
import com.example.demo.Repository.BookingRepo;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepo service;
   
		  public List<Booking> getBookings()
		  {
			return service.findAll();
		  }
   
		public Optional<Booking> getBooking(int id)
		{
			return service.findById(id);
		}

		public Booking addBooking(Booking booking)
		{
			service.save(booking);
			return booking;
		}

		public void deleteBooking(int id)
		{
			Booking b = service.getOne(id);
			service.delete(b);
		}

		public Booking updateBooking(Booking booking)
		{
			service.save(booking);
			return booking;
		}

}
