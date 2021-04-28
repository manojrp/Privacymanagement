package com.ltts.hlm.pms.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "measurement_tbl")
public class Measurement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int measurement_id;

	@Column(name = "measurement_type")
	private String measurement_type;

	@Column(name = "create_timestamp")
	private Date created_timestamp;

	@Column(name = "update_timestamp")
	private Date update_timestamp;

	public int getMeasurement_id() {
		return measurement_id;
	}

	public void setMeasurment_id(int measurement_id) {
		this.measurement_id = measurement_id;
	}

	public String getMeasurement_type() {
		return measurement_type;
	}

	public void setMeasurement_type(String measurement_type) {
		this.measurement_type = measurement_type;
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
