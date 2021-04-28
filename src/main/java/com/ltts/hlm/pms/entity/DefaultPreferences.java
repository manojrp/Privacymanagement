package com.ltts.hlm.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "defaultpreferences_tbl")
public class DefaultPreferences {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int _id;
	
	@Column(name = "language_id")
	private int language_id;

	@Column(name = "measurement_id")
	private int measurement_id;
	
	@Column(name = "date_id")
	private int date_id;
	
	@Column(name = "time_id")
	private int time_id;
	

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
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

	public int getDate_id() {
		return date_id;
	}

	public void setDate_id(int date_id) {
		this.date_id = date_id;
	}

	public int getTime_id() {
		return time_id;
	}

	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}

	
}