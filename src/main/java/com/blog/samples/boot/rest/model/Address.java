package com.blog.samples.boot.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="")
public class Address{

	public Address(){}
	
	public Address(String street, String town, String county, String postcode) {
		this.street = street;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
	}

	@Id
	@Getter
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@Setter
	@Getter
	private String street;
	
	@Setter
	@Getter
	private String town;
	
	@Setter
	@Getter
	private String county;

	@Setter
	@Getter
	private String postcode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
	
}