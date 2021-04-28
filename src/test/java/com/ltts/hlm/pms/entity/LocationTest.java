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
public class LocationTest {
	@Test
	public void testLocation() {
		
		Location data = new Location();
		data.setAltitude("altitude");
		data.setDirection("east");
		data.setEngine_id("engid");
		data.setGnss_position("gnss");
		data.setId(1L);
		data.setModel_id("modelid");
		data.setVehicle_id("vehid");
		data.setWater_depth("deep");
		

		assertNotNull(data.getAltitude());
		assertNotNull(data.getDirection());
		assertNotNull(data.getEngine_id());
		assertNotNull(data.getGnss_position());
		assertNotNull(data.getId());
		assertNotNull(data.getModel_id());
		assertNotNull(data.getVehicle_id());
		assertNotNull(data.getWater_depth());
	}

}

