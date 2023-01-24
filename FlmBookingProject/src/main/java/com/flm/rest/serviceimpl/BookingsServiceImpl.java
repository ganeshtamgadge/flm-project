package com.flm.rest.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.rest.dao.BookingsRepository;
import com.flm.rest.dto.BookingsDto;
import com.flm.rest.model.Bookings;
import com.flm.rest.service.BookingsService;

@Service
public class BookingsServiceImpl implements BookingsService {
	
	@Autowired
	BookingsRepository bookingrepository;

	@Override
	public BookingsDto getUserDetails(String mailid) {
		Bookings bookings = bookingrepository.findById(mailid).get();
		BookingsDto bookingsdto= new BookingsDto();
		BeanUtils.copyProperties(bookings, bookingsdto);
		return bookingsdto;
	}

	@Override
	public void saveBookingDetils(BookingsDto bookingdto) {
		Bookings booking= new Bookings();
		BeanUtils.copyProperties(bookingdto, booking);
		bookingrepository.save(booking);
		
	}

	@Override
	public void updateBookings(BookingsDto bookingsdto) {
		Bookings booking= new Bookings();
		BeanUtils.copyProperties(bookingsdto, booking);
		bookingrepository.save(booking);
		
	}


		
		
	}

