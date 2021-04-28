package com.ltts.hlm.pms.entity;

import java.io.Serializable;

public class NotificationPreferenceDTO implements Serializable {

	private Long id;

	private Boolean sms;

	private Boolean pushNotification;

	private Boolean email;

	private String customer_id;

	public Long getID() {
		return id;
	}

	public void setID(Long id) {
		this.id = id;
	}

	public Boolean getSMS() {
		return sms;
	}

	public void setSMS(Boolean sms) {
		this.sms = sms;
	}

	public Boolean getPUSHNOTIFICATION() {
		return pushNotification;
	}

	public void setPUSHNOTIFICATION(Boolean pushNotification) {
		this.pushNotification = pushNotification;
	}

	public Boolean getEMAIL() {
		return email;
	}

	public void setEMAIL(Boolean email) {
		this.email = email;
	}

	public String getCUSTOMER_ID() {
		return customer_id;
	}

	public void setCUSTOMER_ID(String customer_id) {
		this.customer_id = customer_id;
	}

}
