package com.ltts.hlm.pms.entity;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class PreferenceTest {
	@Test
	public void testpreference() {
		
		
		Preference data = new Preference();
        data.setCust_id("custid");
        data.setDealer_id("dealerid");
        data.setLanguage_id(12);
        data.setMeasurement_id(13);
        data.setPreference_id(14);
        data.setTime_id(15);
        data.setLanguage_id(13);
        Date date = new Date(2012-02-22);
        data.setCreated_timestamp(date);;
        data.setUpdate_timestamp(date);
        data.setVehicle_id("vehId");
        
        
        assertNotNull(data.getCreated_timestamp());
        assertNotNull(data.getCust_id());
        assertNotNull(data.getDate_id());
        assertNotNull(data.getDealer_id());
        assertNotNull(data.getLanguage_id());
        assertNotNull(data.getMeasurement_id());
        assertNotNull(data.getPreference_id());
        assertNotNull(data.getTime_id());
        assertNotNull(data.getUpdate_timestamp());
        assertNotNull(data.getVehicle_id());
        
        
        
	}

}

