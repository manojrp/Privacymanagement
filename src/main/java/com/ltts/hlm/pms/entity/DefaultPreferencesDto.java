package com.ltts.hlm.pms.entity;

public class DefaultPreferencesDto {

	private String dateformat;
	private int date_id;
	private String timeformat;
	private int time_id;
	private String measurement_type;
	private int measurement_id;
	private String language;
	private int language_id;

	public int getLANGUAGE_ID() {
		return language_id;
	}

	public void setLANGUAGE_ID(int language_id) {
		this.language_id = language_id;
	}

	public int getMEASUREMENT_ID() {
		return measurement_id;
	}

	public void setMEASUREMENT_ID(int measurement_id) {
		this.measurement_id = measurement_id;
	}

	public int getDATE_ID() {
		return date_id;
	}

	public void setDATE_ID(int date_id) {
		this.date_id = date_id;
	}

	public int getTIME_ID() {
		return time_id;
	}

	public void setTIME_ID(int time_id) {
		this.time_id = time_id;
	}

	public String getLANGUAGE() {
		return language;
	}

	public void setLANGUAGE(String language) {
		this.language = language;
	}

	public String getMEASUREMENT_TYPE() {
		return measurement_type;
	}

	public void setMEASUREMENT_TYPE(String measurement_type) {
		this.measurement_type = measurement_type;
	}

	public String getDATEFORMAT() {
		return dateformat;
	}

	public void setDATEFORMAT(String dateformat) {
		this.dateformat = dateformat;
	}

	public String getTIMEFORMAT() {
		return timeformat;
	}

	public void setTIMEFORMAT(String timeformat) {
		this.timeformat = timeformat;
	}
}