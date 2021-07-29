package com.target.Volunteeringplatform.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name ="profile")
public class Profile {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="profile_id")
	private int pid;

	@Column(name ="email")
	private String email;

	@Column(name ="first_name")
	private String firstname;

	@Column(name ="last_name")
	private String lastname;

	@Size(min = 10 ,max =10)
	@Column(name ="mobile_number")
	private String mobilenumber;

	@DateTimeFormat(pattern ="dd-MM-yyyy")
	@NotNull(message = "Please provide a date.")
	@Column(name ="DOB")
	private Date dob;

	@Column(name ="about")
	private String about;

	@Column(name ="gender")
	private String gender;

	@Column(name ="location")
	private String location;

	@Column(name ="address")
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

	

	public Profile(String email, String firstname, String lastname, @Size(min = 10, max = 10) String mobilenumber,
			@NotNull(message = "Please provide a date.") Date dob, String about, String gender, String location,
			String address) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.dob = dob;
		this.about = about;
		this.gender = gender;
		this.location = location;
		this.address = address;
	}




	public Profile( @Size(min = 10, max = 10) String mobilenumber,
			@NotNull(message = "Please provide a date.") Date dob, String about, String gender, String location,
			String address) {
		super();
		this.mobilenumber = mobilenumber;
		this.dob = dob;
		this.about = about;
		this.gender = gender;
		this.location = location;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Profile [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber="
				+ mobilenumber + ", dob=" + dob + ", about=" + about + ", gender=" + gender + ", location="
				+ location + ", address=" + address + "]";
	}




}
