package com.flm.rest.dto;

public class UserDto {
	private String firstname;
	private String lastname;
	private String gender;
	private String emailid;
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

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public UserDto(String firstname, String lastname, String gender, String emailid, String accountStatus) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.emailid = emailid;
		this.accountStatus = accountStatus;
	}

	public UserDto() {

	}

	@Override
	public String toString() {
		return "UserDto [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", emailid="
				+ emailid + ", accountStatus=" + accountStatus + "]";
	}

}
