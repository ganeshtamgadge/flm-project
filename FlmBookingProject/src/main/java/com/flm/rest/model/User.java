package com.flm.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	private String firstname;
	private String lastname;
	private String mobileNumber;
	private String gender;
	@Id
	private String emailid;
	private String password;
	private int failedCount;
	private String accountStatus;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public User(String firstname, String lastname, String mobileNumber, String gender, String emailid, String password,
			int failedCount, String accountStatus) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.emailid = emailid;
		this.password = password;
		this.failedCount = failedCount;
		this.accountStatus = accountStatus;
	}

	public User() {

	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + ", emailid=" + emailid + ", password=" + password + ", failedCount="
				+ failedCount + ", accountStatus=" + accountStatus + "]";
	}

}
