package com.ltts.hlm.pms.entity;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class NotificationPreferenceTest {
	@Test
	public void testNotificationPreference() {
		
		NotificationPreference data = new NotificationPreference();
		data.setCustomer_id("customId");
	    data.setEmail(true);
	    data.setId(1L);
	    data.setPushNotification(true);
	    data.setSms(true);
	    
	    
	    assertNotNull(data.getCustomer_id());
	    assertNotNull(data.getEmail());
	    assertNotNull(data.getId());
	    assertNotNull(data.getPushNotification());
	    assertNotNull(data.getSms());
	    
	}

}


	

	
	
	