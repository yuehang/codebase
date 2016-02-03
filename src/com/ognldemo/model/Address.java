package com.ognldemo.model;

public class Address {
	//城市
	private String country;
	//城市
	private String city;
	//街道
	private String street;
	public Address(String country,String city,String street) {
		this.country = country;
		this.city = city;
		this.street = street;
	}
	public Address(){
		
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return country+" "+city+" "+street;
	}
	
}
