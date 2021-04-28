package com.ltts.hlm.pms.dao;

import org.json.JSONObject;

import com.ltts.hlm.pms.entity.NotificationJSONObject;
import com.ltts.hlm.pms.entity.NotificationPreferenceDTO;
import com.ltts.hlm.pms.entity.UpdatePreference;

public interface PrivacyManagementDao {
	JSONObject getPreferencedata(String cust_id);

	public void updatePreferencedata(UpdatePreference updatepreference, String cust_id);

	NotificationJSONObject getNotificationPreference(String customer_id);

	void updateNotificationPreference(NotificationPreferenceDTO notificationPreference);

	String getTermsAndConditions();

	void updateTermsAndConditions(String customer_id);
}
