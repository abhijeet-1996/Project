package com.example.demo.HotelController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Amenities;
import com.example.demo.Model.Booking;
import com.example.demo.Model.Customer;
import com.example.demo.Model.Hotel;
import com.example.demo.Model.HotelAmenities;
import com.example.demo.Model.Staff;
import com.example.demo.services.AmenitiesServices;
import com.example.demo.services.BookingService;
import com.example.demo.services.CustomerService;
import com.example.demo.services.HotelAmenitiesServices;
import com.example.demo.services.HotelService;
import com.example.demo.services.StaffService;

@CrossOrigin("http://localhost:4200")
@RestController
public class HotelController {

	@Autowired
	private AmenitiesServices amenitieServices;
	
	@GetMapping("/amenities")   
	public List<Amenities> getAmenities() {
		return amenitieServices.getAmenities();
	}
/****************************BOOKING********************************/
	
	@Autowired
	private BookingService bookingService;

		@GetMapping("/booking")   
		  public List<Booking> getbookings()
		  {
			return bookingService.getBookings();
		  }
		
		@GetMapping("/booking/{id}")   
		public Optional<Booking> getBooking(@PathVariable("id") int id)
		{
			return bookingService.getBooking(id);
		}
		
		@PostMapping(path="/booking",consumes= {"application/json"})
		public Booking addBooking(@RequestBody Booking booking)
		{
			bookingService.addBooking(booking);
			return booking;
		}
		
		@DeleteMapping("/booking/{id}")
		public void deleteBooking(@PathVariable("id") int id)
		{
			bookingService.deleteBooking(id);
		}
		
		@PutMapping(path="/booking/{id}",consumes = {"application/json"})
		public Booking updatebooking(@RequestBody Booking booking)
		{
			bookingService.updateBooking(booking);
			return booking;
		}
	
/*****************************CUSTOMER*******************************/
		
		@Autowired
		private CustomerService customerService;

			@GetMapping("/Customer")   
			  public List<Customer> getCustomers()
			  {
				return customerService.getCustomers();
			  }
			
			@GetMapping("/Customer/{id}")   
			public Optional<Customer> getCustomer(@PathVariable("id") int id)
			{
				return customerService.getCustomer(id);
			}
			
			@PostMapping(path="/Customer")
			public Customer addCustomer(@RequestBody Customer customer)
			{
				customerService.addCustomer(customer);
				return customer;
			}
			
			@DeleteMapping("/Customer/{id}")
			public void deleteCustomer(@PathVariable("id") int id)
			{
				customerService.deleteCustomer(id);
			}
			
			@PutMapping(path="/Customer/{id}",consumes = {"application/json"})
			public Customer updateCustomer(@RequestBody Customer customer)
			{
				customerService.updateCustomer(customer);
				return customer;
			}
		
/*****************************HOTEL AMENITIES*******************************/
			
			@Autowired
			private HotelAmenitiesServices hotelAmenitiesServices;
			
			@GetMapping("/hotelamenties")
			public List<HotelAmenities> getHotelAmenities() {
				return hotelAmenitiesServices.getHotelAmenities();
			}
			
			@PostMapping(path="/hotelamenties",consumes= {"application/json"})
			public HotelAmenities addHotelAmenities(@RequestBody HotelAmenities cont) {
				return hotelAmenitiesServices.addHotelAmenities(cont);
			}
			
/*****************************HOTEL*******************************/
				
	@Autowired
	private HotelService hotelService;

		@GetMapping("/hotels")   
		  public List<Hotel> getHotels()
		  {
			
			return hotelService.getHotels();
			
		  }
		
		@GetMapping("/hotels/state")
		public List<Hotel> getHotelByState(
				@RequestParam("state") String state)
		{
			return hotelService.getHotelByState(state);
		}

		/**************************************************
		 * http://localhost:8080/hotels/state?state=maharashtra
		 **************************************************/
		@GetMapping("/hotels/{id}")   
		public Optional<Hotel> getHotel(@PathVariable("id") int id)
		{
			return hotelService.getHotel(id);
		}
		
		@PostMapping(path="/hotels",consumes= {"application/json"})
		public Hotel addHotel(@RequestBody Hotel prod)
		{
			hotelService.addHotel(prod);
			return prod;
		}
		
		@DeleteMapping("/hotels/{id}")
		public void deleteHotel(@PathVariable("id") int id)
		{
			hotelService.deleteHotel(id);
		}
		
		@PutMapping(path="/hotels/{id}",consumes = {"application/json"})
		public Hotel updateHotel(@RequestBody Hotel prod)
		{
			hotelService.updateHotel(prod);
			return prod;
		}
		
/****************************STAFF********************************/
		
		@Autowired
		private StaffService staffServices;

			@GetMapping("/staff")   
			  public List<Staff> getstaffs()
			  {
				return staffServices.getStaffs();
			  }
			
			@GetMapping("/staff/{id}")   
			public Optional<Staff> getStaff(@PathVariable("id") int id)
			{
				return staffServices.getStaff(id);
			}
			
			@PostMapping(path="/staff",consumes= {"application/json"})
			public Staff addStaff(@RequestBody Staff staff)
			{
				staffServices.addStaff(staff);
				return staff;
			}
			
			@DeleteMapping("/staff/{id}")
			public void deleteStaff(@PathVariable("id") int id)
			{
				staffServices.deleteStaff(id);
			}
			
			@PutMapping(path="/staff/{id}",consumes = {"application/json"})
			public Staff updateStaff(@RequestBody Staff staff)
			{
				staffServices.updateStaff(staff);
				return staff;
			}
}
