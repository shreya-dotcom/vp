package com.target.Volunteeringplatform.RequestResponse;

import java.util.Date;

import javax.validation.constraints.NotBlank;



public class ProfileRequest {
	
	@NotBlank
	private String email;

	@NotBlank
	private String firstname;

	@NotBlank
	private String lastname;

	@NotBlank
	private String mobilenumber;

	@NotBlank
	private Date dob;

	@NotBlank
	private String about;

	@NotBlank
	private String gender;

	@NotBlank
	private String location;

	@NotBlank
	private String address;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public ProfileRequest() {
		
	}

	public ProfileRequest(@NotBlank String mobilenumber, @NotBlank Date dob, @NotBlank String about,
			@NotBlank String gender, @NotBlank String location, @NotBlank String address) {
		super();
		this.mobilenumber = mobilenumber;
		this.dob = dob;
		this.about = about;
		this.gender = gender;
		this.location = location;
		this.address = address;
	}
	
	
	
}
