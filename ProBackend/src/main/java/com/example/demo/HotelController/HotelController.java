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
	private AmenitiesServices serv;
	
	@GetMapping("/amenities")   
	public List<Amenities> getAmenities() {
		return serv.getAmenities();
	}
/****************************BOOKING********************************/
	
	@Autowired
	private BookingService bservice;

		@GetMapping("/booking")   
		  public List<Booking> getbookings()
		  {
			return bservice.getBookings();
		  }
		
		@GetMapping("/booking/{id}")   
		public Optional<Booking> getBooking(@PathVariable("id") int id)
		{
			return bservice.getBooking(id);
		}
		
		@PostMapping(path="/booking",consumes= {"application/json"})
		public Booking addBooking(@RequestBody Booking booking)
		{
			bservice.addBooking(booking);
			return booking;
		}
		
		@DeleteMapping("/booking/{id}")
		public void deleteBooking(@PathVariable("id") int id)
		{
			bservice.deleteBooking(id);
		}
		
		@PutMapping(path="/booking/{id}",consumes = {"application/json"})
		public Booking updatebooking(@RequestBody Booking booking)
		{
			bservice.updateBooking(booking);
			return booking;
		}
	
/*****************************CUSTOMER*******************************/
		
		@Autowired
		private CustomerService cservice;

			@GetMapping("/Customer")   
			  public List<Customer> getCustomers()
			  {
				return cservice.getCustomers();
			  }
			
			@GetMapping("/Customer/{id}")   
			public Optional<Customer> getCustomer(@PathVariable("id") int id)
			{
				return cservice.getCustomer(id);
			}
			
			@PostMapping(path="/Customer")
			public Customer addCustomer(@RequestBody Customer customer)
			{
				cservice.addCustomer(customer);
				return customer;
			}
			
			@DeleteMapping("/Customer/{id}")
			public void deleteCustomer(@PathVariable("id") int id)
			{
				cservice.deleteCustomer(id);
			}
			
			@PutMapping(path="/Customer/{id}",consumes = {"application/json"})
			public Customer updateCustomer(@RequestBody Customer customer)
			{
				cservice.updateCustomer(customer);
				return customer;
			}
		
/*****************************HOTEL AMENITIES*******************************/
			
			@Autowired
			private HotelAmenitiesServices haservice;
			
			@GetMapping("/hotelamenties")
			public List<HotelAmenities> getHotelAmenities() {
				return haservice.getHotelAmenities();
			}
			
			@PostMapping(path="/hotelamenties",consumes= {"application/json"})
			public HotelAmenities addHotelAmenities(@RequestBody HotelAmenities cont) {
				return haservice.addHotelAmenities(cont);
			}
			
/*****************************HOTEL*******************************/
				
	@Autowired
	private HotelService service;

		@GetMapping("/hotels")   
		  public List<Hotel> getHotels()
		  {
			
			//System.out.println(service.getHotelByState("maharastra"));
			return service.getHotels();
			
		  }
		
		@GetMapping("/hotels/state")
		public List<Hotel> getHotelByState(
				@RequestParam("state") String state)
		{
			return service.getHotelByState(state);
		}

		/**************************************************
		 * http://localhost:8080/hotels/state?state=maharashtra
		 **************************************************/
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
		
/****************************STAFF********************************/
		
		@Autowired
		private StaffService sservice;

			@GetMapping("/staff")   
			  public List<Staff> getstaffs()
			  {
				return sservice.getStaffs();
			  }
			
			@GetMapping("/staff/{id}")   
			public Optional<Staff> getStaff(@PathVariable("id") int id)
			{
				return sservice.getStaff(id);
			}
			
			@PostMapping(path="/staff",consumes= {"application/json"})
			public Staff addStaff(@RequestBody Staff staff)
			{
				sservice.addStaff(staff);
				return staff;
			}
			
			@DeleteMapping("/staff/{id}")
			public void deleteStaff(@PathVariable("id") int id)
			{
				sservice.deleteStaff(id);
			}
			
			@PutMapping(path="/staff/{id}",consumes = {"application/json"})
			public Staff updateStaff(@RequestBody Staff staff)
			{
				sservice.updateStaff(staff);
				return staff;
			}
}
