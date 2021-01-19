package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private int bookingid;
	private String checkindate;
	private String checkoutdate;
	private String validthru; 
	private long creditcardno ;
	private String tempcheckindate;
	private String tempcheckoutdate;
	private String bookingdate;
	private int customerid;
	private int hotelid;
	
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	
	public String getCheckindate() {
		return checkindate;
	}
	public void setCheckindate(String checkindate) {
		this.checkindate = checkindate;
	}
	
	public String getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(String checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	
	public String getValidthru() {
		return validthru;
	}
	public void setValidthru(String validthru) {
		this.validthru = validthru;
	}
	public long getCreditcardno() {
		return creditcardno;
	}
	public void setCreditcardno(long creditcardno) {
		this.creditcardno = creditcardno;
	}
	public String getTempcheckindate() {
		return tempcheckindate;
	}
	public void setTempcheckindate(String tempcheckindate) {
		this.tempcheckindate = tempcheckindate;
	}
	
	public String getTempcheckoutdate() {
		return tempcheckoutdate;
	}
	public void setTempcheckoutdate(String tempcheckoutdate) {
		this.tempcheckoutdate = tempcheckoutdate;
	}
	
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", checkindate=" + checkindate + ", checkoutdate=" + checkoutdate
				+ ", validthru=" + validthru + ", creditcardno=" + creditcardno + ", tempcheckindate=" + tempcheckindate
				+ ", tempcheckoutdate=" + tempcheckoutdate + ", bookingdate=" + bookingdate + ", customerid="
				+ customerid + ", hotelid=" + hotelid + "]";
	}
	
}
