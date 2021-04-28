package com.ltts.hlm.pms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preferred_dealer_tbl")
public class PreferredDealer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "POIId")
	private String POIId;
	
	@Column(name = "InternetAddress")
	private String InternetAddress;

	@Column(name = "Email")
	private String Email;

	@Column(name = "Address")
	private String Address;

	@Column(name = "Latitude")
	private String Latitude;

	@Column(name = "Phone")
	private String Phone;

	@Column(name = "POIName")
	private String POIName;

	@Column(name = "Distance")
	private String Distance;

	@Column(name = "ZipCode")
	private String ZipCode;

	@Column(name = "City")
	private String City;

	@Column(name = "Longitude")
	private String Longitude;

	@Column(name = "State")
	private String State;

	@Column(name = "Country")
	private String Country;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPOIId() {
		return POIId;
	}

	public void setPOIId(String pOIId) {
		POIId = pOIId;
	}

	public String getInternetAddress() {
		return InternetAddress;
	}

	public void setInternetAddress(String internetAddress) {
		InternetAddress = internetAddress;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getPOIName() {
		return POIName;
	}

	public void setPOIName(String pOIName) {
		POIName = pOIName;
	}

	public String getDistance() {
		return Distance;
	}

	public void setDistance(String distance) {
		Distance = distance;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
