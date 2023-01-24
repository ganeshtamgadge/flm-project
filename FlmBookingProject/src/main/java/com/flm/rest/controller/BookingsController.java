package com.flm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flm.rest.dto.BookingsDto;
import com.flm.rest.dto.UserDto;
import com.flm.rest.service.BookingsService;

@RestController
public class BookingsController {

	@Autowired
	BookingsService bookingsservice;

	@GetMapping("/get-bookings/{mailid}")
	public BookingsDto getBookingDetails(@PathVariable String mailid) {
		BookingsDto userDetails = bookingsservice.getUserDetails(mailid);
		return userDetails;

	}

	@PostMapping("/create-bookings")
	public String saveBookingDetils(@RequestBody BookingsDto bookingdto) {
		bookingsservice.saveBookingDetils(bookingdto);
		return "booking conform";
	}

	@PutMapping("/update-booking")
	public String updateBookings(@RequestBody BookingsDto bookingsdto) {
		bookingsservice.saveBookingDetils(bookingsdto);
		return "booking updated";

	}

}
