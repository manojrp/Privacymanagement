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
public class VehicleTest {
	@Test
	public void testVehicle() {
		Vehicle data = new Vehicle();
		data.setCountry_id("us");
		data.setCust_id("custid");
		data.setId(12);
		
		
		Date date = new Date();
		data.setManufacture_date(date);
        data.setCreate_timestamp(date);
        data.setUpdate_timestamp(date);
        data.setVehicle_hull_no("hullno");
        data.setVehicle_id("vehid");
        data.setVehicle_model_id("modelid");
        data.setVehicle_name("name");
        data.setVehicle_vin_no("vin");
        
        
        assertNotNull(data.getCountry_id());
        assertNotNull(data.getCust_id());
        assertNotNull(data.getId());
        assertNotNull(data.getManufacture_date());
        assertNotNull(data.getCreate_timestamp());
        assertNotNull(data.getUpdate_timestamp());
        assertNotNull(data.getVehicle_hull_no());
        assertNotNull(data.getVehicle_id());
        assertNotNull(data.getVehicle_model_id());
        assertNotNull(data.getVehicle_name());
        assertNotNull(data.getVehicle_vin_no());
	}

}

