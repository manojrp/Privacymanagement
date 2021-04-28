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
public class VesselTest {
	@Test
	public void testVessel() {
		
		Vessel data = new Vessel();
		data.setEngine_id("engid");
		data.setFluid_level("full");
		data.setId(1L);
		data.setModel_id("modelid");
		data.setVehicle_id("vehid");
		data.setWind_data("windata");
		
		
		assertNotNull(data.getEngine_id());
		assertNotNull(data.getFluid_level());
		assertNotNull(data.getId());
		assertNotNull(data.getModel_id());
		assertNotNull(data.getVehicle_id());
		assertNotNull(data.getWind_data());
		
	}

}