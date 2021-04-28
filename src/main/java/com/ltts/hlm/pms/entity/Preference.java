package com.ltts.hlm.pms.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preference_tbl")
public class Preference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int preference_id;

	@Column(name = "cust_id")
	private String cust_id;
	
	@Column(name = "dealer_id")
	private String dealer_id;
	
	@Column(name = "time_id")
	private int time_id;

	@Column(name = "date_id")
	private int date_id;
	
	@Column(name = "language_id")
	private int language_id;
	
	@Column(name = "measurement_id")
	private int measurement_id;


	@Column(name = "vehicle_id")
	private String vehicle_id;
	
	@Column(name = "create_timestamp")
	private Date created_timestamp;

	@Column(name = "update_timestamp")
	private Date update_timestamp;

	public int getPreference_id() {
		return preference_id;
	}

	public void setPreference_id(int preference_id) {
		this.preference_id = preference_id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}

	public int getTime_id() {
		return time_id;
	}

	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}

	public int getDate_id() {
		return date_id;
	}

	public void setDate_id(int date_id) {
		this.date_id = date_id;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public int getMeasurement_id() {
		return measurement_id;
	}

	public void setMeasurement_id(int measurement_id) {
		this.measurement_id = measurement_id;
	}
	

	public String getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public Date getCreated_timestamp() {
		return created_timestamp;
	}

	public void setCreated_timestamp(Date created_timestamp) {
		this.created_timestamp = created_timestamp;
	}

	public Date getUpdate_timestamp() {
		return update_timestamp;
	}

	public void setUpdate_timestamp(Date update_timestamp) {
		this.update_timestamp = update_timestamp;
	}

	
}
