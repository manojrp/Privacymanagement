package com.ltts.hlm.pms.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time_tbl")
public class TimeFormat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int time_id;

	@Column(name = "timeformat")
	private String timeformat;

	@Column(name = "create_timestamp")
	private Date created_timestamp;

	@Column(name = "update_timestamp")
	private Date update_timestamp;

	public int get_id() {
		return time_id;
	}

	public void set_id(int _id) {
		this.time_id = _id;
	}
	public int getTime_id() {
		return time_id;
	}

	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}

	public String getTimeformat() {
		return timeformat;
	}

	public void setTimeformat(String timeformat) {
		this.timeformat = timeformat;
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
