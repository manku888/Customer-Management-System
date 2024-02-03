package com.m.cms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "First_Name", nullable = false)
private String firstName;

@Column(name = "last_Name")
private String lastName;

@Column(name = "Street")
private String street;

@Column(name = "Address")
private String address;

@Column(name = "City")
private String city;

@Column(name = "Email")
private String email;

@Column(name = "Phone")
private String phone;



//>>>>>>>>>>>>>>>>>>>>>>>> super-constructor <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
public Customer() {
	super();
}


//>>>>>>>>>>>>>>>>>>>>>>>> parameeterrized - constructor <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

public Customer(String firstName, String lastName, String street, String address, String city, String email,
		String phone) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.street = street;
	this.address = address;
	this.city = city;
	this.email = email;
	this.phone = phone;
}

// >>>>>>>>>>>>>>>>>>>>>>>> getters and Setters <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
public long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}



}
