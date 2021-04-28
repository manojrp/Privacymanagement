package com.ltts.hlm.pms.entity;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class DefaultNotificationPreferenceTest {
	@Test
	public void testDefaultNotificationTest() {
		
		DefaultNotificationPreference data = new DefaultNotificationPreference();
		data.setEmail(true);
		data.setId(1L);
		data.setSms(true);
		data.setPushNotification(true);
		
		
		assertEquals(true ,data.getEmail());
		assertNotNull(data.getId());
		assertNotNull(data.getEmail());
		assertNotNull(data.getSms());
		assertNotNull(data.getPushNotification());

	}

}

