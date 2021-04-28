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
public class DealerTest {
	@Test
	public void testDealer() {
		Dealer data = new Dealer();
		data.setId(12L);
		data.setName("name");
		data.setWebsite("website");
		data.setAddress("address");
		data.setCity("city");
		data.setState("state");
		data.setZipcode("asdf");
		data.setPhone("999999");
		data.setLatitude(20.00099);
		data.setLongitude(20.34534);
		data.setDistance("345");
		
		
		assertNotNull(data.getId());
		assertNotNull(data.getName());
		assertNotNull(data.getLatitude());
		assertNotNull(data.getLongitude());
		assertNotNull(data.getWebsite());
		assertNotNull(data.getAddress());
		assertNotNull(data.getCity());
		assertNotNull(data.getState());
		assertNotNull(data.getZipcode());
		assertNotNull(data.getPhone());
		assertNotNull(data.getDistance());
		


	}

}




















