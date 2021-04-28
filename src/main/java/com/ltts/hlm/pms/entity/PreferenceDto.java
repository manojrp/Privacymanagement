package com.ltts.hlm.pms.entity;

public class PreferenceDto {
	
	private Integer language_id;
	private String language;
	private Integer measurement_id;
	private String measurement_type;
	private Integer date_id;
	private String dateformat;
	private Integer time_id;
	private String timeformat;
	public Integer getLANGUAGE_ID() {
		return language_id;
	}
	public void setLANGUAGE_ID(Integer language_id) {
		this.language_id = language_id;
	}
	
	public String getLANGUAGE() {
		return language;
	}
	public void setLANGUAGE(String language) {
		this.language = language;
	}
	public Integer getMEASUREMENT_ID() {
		return measurement_id;
	}
	public void setMEASUREMENT_ID(Integer measurement_id) {
		this.measurement_id = measurement_id;
	}
	public String getMEASUREMENT_TYPE() {
		return measurement_type;
	}
	public void setMEASUREMENT_TYPE(String measurement_type) {
		this.measurement_type = measurement_type;
	}
	public Integer getDATE_ID() {
		return date_id;
	}
	public void setDATE_ID(Integer date_id) {
		this.date_id = date_id;
	}
	public String getDATEFORMAT() {
		return dateformat;
	}
	public void setDATEFORMAT(String dateformat) {
		this.dateformat = dateformat;
	}
	public Integer getTIME_ID() {
		return time_id;
	}
	public void setTIME_ID(Integer time_id) {
		this.time_id = time_id;
	}
	public String getTIMEFORMAT() {
		return timeformat;
	}
	public void setTIMEFORMAT(String timeformat) {
		this.timeformat = timeformat;
	}
}
