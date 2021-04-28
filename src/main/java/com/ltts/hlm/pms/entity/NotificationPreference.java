package com.ltts.hlm.pms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notification_preference_tbl")

public class NotificationPreference implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "sms")
	private Boolean sms;

	@Column(name = "pushNotification")
	private Boolean pushNotification;

	@Column(name = "email")
	private Boolean email;

	@Column(name = "customer_id")
	private String customer_id;
	
	@Column(name = "created_timestamp")
	private Date created_timestamp;
	
	@Column(name = "updated_timestamp")
	private Date updated_timestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getSms() {
		return sms;
	}

	public void setSms(Boolean sms) {
		this.sms = sms;
	}

	public Boolean getPushNotification() {
		return pushNotification;
	}

	public void setPushNotification(Boolean pushNotification) {
		this.pushNotification = pushNotification;
	}

	public Boolean getEmail() {
		return email;
	}

	public void setEmail(Boolean email) {
		this.email = email;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
