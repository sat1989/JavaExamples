package com.blog.samples.boot.rest.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer{

	public Customer(){}
	
	public Customer(String firstName, String lastName, LocalDate dateOfBirth, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}


	@Id
	@Getter
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@Setter
	@Getter
	private String firstName;
	
	@Setter
	@Getter
	private String lastName;
	
	@Setter	
	@Getter
	private LocalDate dateOfBirth;

	@Setter
	@Getter
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}