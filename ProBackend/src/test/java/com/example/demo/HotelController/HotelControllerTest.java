package com.example.demo.HotelController;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.GetMapping;

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

@ExtendWith(MockitoExtension.class)
public class HotelControllerTest {

	@InjectMocks
	private HotelController hotelController;
	
	
	  @Mock private AmenitiesServices amenitiesServices;
	  
	  @Test public void getAmenities() { 
		  List<Amenities> amenities = new ArrayList<Amenities>(); 
		  Amenities a1 = new Amenities(); 
		  Amenities a2 = new Amenities(); 
		  a1.setAmenitiesid(1); 
		  a1.setAmenitiesname("Swimming Pool");
		  a2.setAmenitiesid(2); a2.setAmenitiesname("AC"); amenities.add(a1);
		  amenities.add(a2);
	  
		  when(amenitiesServices.getAmenities()).thenReturn(amenities);
		  System.out.println("hello"); 
		  List<Amenities> amenities2 = hotelController.getAmenities(); 
		  assertEquals(2,amenities2.size());
		  verify(amenitiesServices,times(1)).getAmenities(); }
	  
	  @Mock
		private BookingService bookingService;
		
		@Test
		public void getbookings() 
		{
			
			List<Booking>  booking = new ArrayList<Booking>();
			Booking b1 = new Booking();
			b1.setBookingid(1);
			b1.setBookingdate("7/10/2020");
			b1.setCheckindate("12/2/2020");
			b1.setCheckoutdate("12/2/2020");
			b1.setCreditcardno(1275673673);
			b1.setCustomerid(2);
			b1.setHotelid(12);
			b1.setTempcheckindate("12/2/2020");
			b1.setTempcheckoutdate("12/2/2020");
			b1.setValidthru("12/2022");
			
			when(bookingService.getBookings()).thenReturn(booking);
			List<Booking> booking2 = hotelController.getbookings();
			assertEquals(0,booking2.size());
			verify(bookingService,times(1)).getBookings();
		}
		
		@Mock
		CustomerService customerService;
		
		@Test
		public void getCustomers() {
			List<Customer> customer = new ArrayList<Customer>();
			Customer c1 = new Customer();
			c1.setAddress("vasagade");
			c1.setCustomerid(1);
			c1.setDob("7/10/1996");
			c1.setEmail("abhijeet@gmail.com");
			c1.setFirstname("abhijeet");
			c1.setLastname("Chougule");
			c1.setGender("male");
			c1.setGovernmentidnumber("2763267");
			c1.setGovernmentidproof("adhar card");
			c1.setPassword("manu");
			c1.setPhone1(2121211212);
			c1.setPhone2(2121212121);
			c1.setPin(416416);
			c1.setState("Maharashtra");
			c1.setTown("sangli");
			customer.add(c1);
			
			when(hotelController.getCustomers()).thenReturn(customer);
			List<Customer> customer2 = hotelController.getCustomers(); 
			assertEquals(1,customer2.size());
			verify(customerService,times(1)).getCustomers();
		}
		
		@Mock 
		private HotelAmenitiesServices hotelAmenitiesServices;
		
		@Test
		public void getHotelAmenities() {
			List<HotelAmenities> hotelAmenities = new ArrayList<HotelAmenities>();
			HotelAmenities h1 = new HotelAmenities();
			h1.setId(1);
			h1.setAmenitiesid(1);
			h1.setHotelid(1);
			hotelAmenities.add(h1);
			when(hotelController.getHotelAmenities()).thenReturn(hotelAmenities);
			List<HotelAmenities> hotelAmenities2 = hotelController.getHotelAmenities(); 
			assertEquals(1,hotelAmenities2.size());
		}
		
		@Mock
		private HotelService hotelService;
		
		@Test
		public void getHotels()
		  {
			
			List<Hotel> hotel = new ArrayList<Hotel>();
			Hotel h1 = new Hotel();
			h1.setAddress("sangli");
			h1.setCity("sangli");
			h1.setHoteldescription("lay bhari");
			h1.setHotelid(1);
			h1.setHotelname("Taj");
			h1.setPhone1(2121211221);
			h1.setPhone2(1323232323);
			h1.setPincode(416416);
			h1.setRating(3);
			h1.setRent(2000);
			h1.setRoomsavailable(12);
			h1.setState("Maharashtra");
			h1.setTotalrooms(20);
			hotel.add(h1);
			when(hotelController.getHotels()).thenReturn(hotel);
			List<Hotel> hotel2 = hotelController.getHotels(); 
			assertEquals(1,hotel2.size());
			
			
		  }
		
		@Mock
		private StaffService staffService;
		
		@Test
		 public void getstaffs()
		  {
			List<Staff> staff = new ArrayList<Staff>();
			Staff s1 = new Staff();
			s1.setAddress("tasgaon");
			s1.setDateofbirth("12/10/1996");
			s1.setDesignation("man");
			s1.setEmail("vaibhav@gmail.com");
			s1.setFirstname("Vaibhav");
			s1.setGender("male");
			s1.setGovernmentidnumber("12212121");
			s1.setGovernmentidproof("Adhar card");
			s1.setLastname("Kokate");
			s1.setPassword("vaibhav");
			s1.setPhone1(1212121212);
			s1.setPhone2(2121121212);
			s1.setStaffid(1);
			staff.add(s1);
			
			when(hotelController.getstaffs()).thenReturn(staff);
			List<Staff> staff2 = hotelController.getstaffs(); 
			assertEquals(1,staff2.size());
		  }
	
}
