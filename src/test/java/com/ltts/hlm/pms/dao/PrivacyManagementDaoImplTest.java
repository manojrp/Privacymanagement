package com.ltts.hlm.pms.dao;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.amazonaws.util.json.JSONObject;
import com.ltts.hlm.pms.entity.DefaultPreferencesDto;
import com.ltts.hlm.pms.entity.NotificationJSONObject;
//import com.ltts.hlm.vhm.dao.VehicleHealthManagementDao;
//import com.ltts.hlm.vhm.entity.RunReportDto;
import com.ltts.hlm.pms.entity.PreferenceDto;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class PrivacyManagementDaoImplTest {

	private static final Logger LOG = LoggerFactory.getLogger(PrivacyManagementDao.class);

	@Autowired
	private PrivacyManagementDao privacyManagementDao;

	@Autowired
	private PrivacyManagementDaoImpl privacyManagementDaoImpl;

	@Test
	public void getNotificationPreferenceTest() {
		String customer_id = "123c";
		NotificationJSONObject notificationpreference = privacyManagementDao.getNotificationPreference(customer_id);
		assertEquals(notificationpreference.getDEFAULTDATA().get(0).getEmail(),true);
	}

	
	@Test
	public void getTermsandConditionTest() {
		
		String preferencedata = privacyManagementDao.getTermsAndConditions();
		assertNotNull(preferencedata);
	}

	/*@Test public void getPreferencedata() { String customer_id= "123c";
	  org.json.JSONObject notificationpreference = privacyManagementDao.getPreferencedata(customer_id);
	  System.out.println(notificationpreference.getJSONObject(customer_id).getJSONArray(customer_id).getJSONObject(0).getJSONArray(customer_id));
	  //assertEquals(notificationpreference.getJSONObject(customer_id).getJSONArray(customer_id).getJSONObject(0).getJSONArray(customer_id), "asfdsdf"); }
*/	

}
