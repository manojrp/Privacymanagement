package com.ltts.hlm.pms.service;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.hlm.pms.dao.PrivacyManagementDao;
import com.ltts.hlm.pms.entity.NotificationJSONObject;
import com.ltts.hlm.pms.entity.NotificationPreferenceDTO;
import com.ltts.hlm.pms.entity.UpdatePreference;

@Service
public class PrivacyManagementServiceImpl implements PrivacyManagementService {

	@Autowired
	private PrivacyManagementDao pmsDao;

	private static final Logger LOG = LoggerFactory.getLogger(PrivacyManagementServiceImpl.class);

	@Override
	public JSONObject getPreferencedata(String cust_id) {
		return pmsDao.getPreferencedata(cust_id);
	}

	@Override
	public void updatePreferencedata(UpdatePreference updatepreference, String cust_id) {
		pmsDao.updatePreferencedata(updatepreference,cust_id);
	}

	@Override
	public NotificationJSONObject getNotificationPreference(String customer_id) {
		return pmsDao.getNotificationPreference(customer_id);
	}

	@Override
	public void updateNotificationPreference(NotificationPreferenceDTO notificationPreference) {
		pmsDao.updateNotificationPreference(notificationPreference);

	}

	@Override
	public String getTermsAndConditions() {
		return pmsDao.getTermsAndConditions();
	}

	@Override
	public void updateTermsAndConditions(String customer_id) {
		pmsDao.updateTermsAndConditions(customer_id);
		
	}

}
