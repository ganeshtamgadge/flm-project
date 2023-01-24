package com.flm.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookings {
	private String source;
	private String destination;
	private String date;
	private int noOfPassengers;
	@Id
	private String mailid;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Bookings(String source, String destination, String date, int noOfPassengers, String mailid) {
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.noOfPassengers = noOfPassengers;
		this.mailid = mailid;
	}
	public Bookings() {
	
	}
	@Override
	public String toString() {
		return "Bookings [source=" + source + ", destination=" + destination + ", date=" + date + ", noOfPassengers="
				+ noOfPassengers + ", mailid=" + mailid + "]";
	}
	
	
	

}
