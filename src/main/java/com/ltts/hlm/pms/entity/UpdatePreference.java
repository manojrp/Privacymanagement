package com.ltts.hlm.pms.entity;

import java.util.List;

public class UpdatePreference {

	public List<LanguageupdateDto> Language;
	public List<MeasurementupdateDto> Measurement;
	public List<DateFormatupdateDto> DateFormat;
	public List<TimeFormatupdateDto> TimeFormat;
	public List<VehicleupdateDto> PreferredBoat;
	public List<DealerupdateDto> PreferredDealer;
	
	public List<LanguageupdateDto> getLANGUAGE() {
		return Language;
	}
	public void setLANGUAGE(List<LanguageupdateDto> language) {
		Language = language;
	}
	public List<MeasurementupdateDto> getMEASUREMENT() {
		return Measurement;
	}
	public void setMEASUREMENT(List<MeasurementupdateDto> measurement) {
		Measurement = measurement;
	}
	public List<DateFormatupdateDto> getDATEFORMAT() {
		return DateFormat;
	}
	public void setDATEFORMAT(List<DateFormatupdateDto> dateFormat) {
		DateFormat = dateFormat;
	}
	public List<TimeFormatupdateDto> getTIMERFORMAT() {
		return TimeFormat;
	}
	public void setTIMEFORMAT(List<TimeFormatupdateDto> timeFormat) {
		TimeFormat = timeFormat;
	}
	
	public List<VehicleupdateDto> getPREFERREDBOAT() {
		return PreferredBoat;
	}
	public void setPREFERREDBOAT(List<VehicleupdateDto> preferredBoat) {
		PreferredBoat = preferredBoat;
	}
	public List<DealerupdateDto> getPREFERREDDEALER() {
		return PreferredDealer;
	}
	public void setPREFERREDDEALER(List<DealerupdateDto> preferredDealer) {
		PreferredDealer = preferredDealer;
	}
}
