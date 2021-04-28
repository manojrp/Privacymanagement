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
public class TermsAndConditionsTest {
	@Test
	public void testTermsandconditions() {
		TermsAndConditions data = new TermsAndConditions(); 
		data.setAccept(true);
		
        Date date = new Date();
		data.setCreated_timestamp(date);
		data.setCustomer_id("custid");
		data.setFilename("filename");
		data.setFilepath("filepath");
		data.setId(12L);
		data.setUpdated_timestamp(date);
		
		
		assertNotNull(data.getAccept());
		assertNotNull(data.getCreated_timestamp());
		assertNotNull(data.getCustomer_id());
		assertNotNull(data.getFilename());
		assertNotNull(data.getFilepath());
		assertNotNull(data.getId());
		assertNotNull(data.getUpdated_timestamp());
	}

}

