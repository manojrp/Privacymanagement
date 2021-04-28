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
public class NetworkMonitoringTest {
	@Test
	public void testNetworkMonitoring() {
		
		NetworkMonitoring data = new NetworkMonitoring();
		data.setEngine_id("engid");
		data.setId(1L);
		data.setModel_id("modelid");
		data.setProduct_info("proId");
		data.setVehicle_id("vehId");

		assertNotNull(data.getEngine_id());
		assertNotNull(data.getId());
		assertNotNull(data.getModel_id());
		assertNotNull(data.getProduct_info());
		assertNotNull(data.getVehicle_id());
		
	}

}

