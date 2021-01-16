package com.example.demo.Model;

import javax.persistence.*;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private int bookingid;
	private String checkindate;
	private String checkoutdate;
	private int amount; 
	private String paymentmode;
	private String tempcheckindate;
	private String tempcheckoutdate;
	private String bookingdate;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
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
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
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
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", checkindate=" + checkindate + ", checkoutdate=" + checkoutdate
				+ ", amount=" + amount + ", paymentmode=" + paymentmode + ", tempcheckindate=" + tempcheckindate
				+ ", tempcheckoutdate=" + tempcheckoutdate + ", bookingdate=" + bookingdate + ", customer=" + customer
				+ "]";
	}

}
