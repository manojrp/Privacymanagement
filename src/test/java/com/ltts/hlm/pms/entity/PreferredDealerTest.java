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
public class PreferredDealerTest {
	@Test
	public void testPreferredDealer() {
		
		PreferredDealer data = new PreferredDealer();
		data.setAddress("address");
		data.setCity("city");
		data.setCountry("country");
		data.setDistance("Distance");
		data.setEmail("email");
		data.setId(1L);
		data.setInternetAddress("IntAdd");
		data.setLatitude("latitude");
		data.setLongitude("longitude");
		data.setPhone("99999");
		data.setPOIId("Poid");
		data.setPOIName("Poiname");
		data.setState("state");
		data.setZipCode("zipcode");
		
		
		assertNotNull(data.getAddress());
		assertNotNull(data.getCity());
		assertNotNull(data.getCountry());
		assertNotNull(data.getDistance());
		assertNotNull(data.getEmail());
		assertNotNull(data.getId());
		assertNotNull(data.getInternetAddress());
		assertNotNull(data.getLatitude());
		assertNotNull(data.getLongitude());
		assertNotNull(data.getPhone());
		assertNotNull(data.getPOIId());
		assertNotNull(data.getPOIName());
		assertNotNull(data.getState());
		assertNotNull(data.getZipCode());
		
	}

}

