package com.flm.rest.service;

import com.flm.rest.dto.BookingsDto;

public interface BookingsService {
	
	public BookingsDto getUserDetails( String mailid);
	
	public void saveBookingDetils(BookingsDto bookingdto);
	
	public void updateBookings(BookingsDto bookingsdto);

}
