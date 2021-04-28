package com.ltts.hlm.pms.entity;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
public class ElectricalTest {
	@Test
	public void testDateFormat() {
		
		Electrical data = new Electrical();
		data.setId(1L);
		data.setEngine_id("engineid");
		data.setVehicle_id("asdf");
		data.setModel_id("asdf");
		data.setBattery_status_1("asdf");
		data.setBattery_status_2("asdfdf");

		

		assertNotNull(data.getId());
		assertNotNull(data.getEngine_id());
		assertNotNull(data.getVehicle_id());
		assertNotNull(data.getModel_id());
		assertNotNull(data.getBattery_status_1());
		assertNotNull(data.getBattery_status_2());
		
		
		
		
		
		
		
		
		
		
	}

}


