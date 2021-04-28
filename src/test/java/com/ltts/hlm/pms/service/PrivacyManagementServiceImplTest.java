package com.ltts.hlm.pms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ltts.hlm.pms.entity.NotificationJSONObject;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class PrivacyManagementServiceImplTest {
	
	@Autowired
	PrivacyManagementServiceImpl privacymanagementserviceimpl;
	
	
	@Test
	public void getNotificationPreferenceTest() {
		String customer_id = "123c";
		NotificationJSONObject notificationpreference = privacymanagementserviceimpl.getNotificationPreference(customer_id);
		assertEquals(notificationpreference.getDEFAULTDATA().get(0).getEmail(),true);
	}
	
	
	@Test
	public void getTermsandConditionTest() {
		
		String preferencedata = privacymanagementserviceimpl.getTermsAndConditions();
		assertNotNull(preferencedata);
	}
	
	
	
	
	
}