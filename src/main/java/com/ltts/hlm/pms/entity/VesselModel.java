package com.ltts.hlm.pms.entity;

import java.io.Serializable;

public class VesselModel implements Serializable {

	private String fluid_level;
	private String wind_data;
	public String getFLUID_LEVEL() {
		return fluid_level;
	}
	public void setFLUID_LEVEL(String fluid_level) {
		this.fluid_level = fluid_level;
	}
	public String getWIND_DATA() {
		return wind_data;
	}
	public void setWIND_DATA(String wind_data) {
		this.wind_data = wind_data;
	}

}
