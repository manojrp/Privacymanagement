package com.ltts.hlm.pms.entity;

public class PreferenceCustDto {

	private String dateformat;
	private int date_id;
	private String timeformat;
	private int time_id;
	private String measurement_type;
	private int measurement_id;
	private String language;
	private int language_id;
	private String vehicle_name;
	private String vehicle_id;
	
	public String getDATEFORMAT() {
		return dateformat;
	}
	public void setDATEFORMAT(String dateformat) {
		this.dateformat = dateformat;
	}
	public int getDATE_ID() {
		return date_id;
	}
	public void setDATE_ID(int date_id) {
		this.date_id = date_id;
	}
	public String getTIMEFORMAT() {
		return timeformat;
	}
	public void setTIMEFORMAT(String timeformat) {
		this.timeformat = timeformat;
	}
	public int getTIME_ID() {
		return time_id;
	}
	public void setTIME_ID(int time_id) {
		this.time_id = time_id;
	}
	public String getMEASUREMENT_TYPE() {
		return measurement_type;
	}
	public void setMEASUREMENT_TYPE(String measurement_type) {
		this.measurement_type = measurement_type;
	}
	public int getMEASUREMENT_ID() {
		return measurement_id;
	}
	public void setMEASUREMENT_ID(int measurement_id) {
		this.measurement_id = measurement_id;
	}
	public String getLANGUAGE() {
		return language;
	}
	public void setLANGUAGE(String language) {
		this.language = language;
	}
	public int getLANGUAGE_ID() {
		return language_id;
	}
	public void setLANGUAGE_ID(int language_id) {
		this.language_id = language_id;
	}
	public String getVEHICLE_NAME() {
		return vehicle_name;
	}
	public void setVEHICLE_NAME(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getVEHICLE_ID() {
		return vehicle_id;
	}
	public void setVEHICLE_ID(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	
}
