package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertEquals;
import java.util.Date;

import javax.persistence.Column;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class MeasurementTest {

	@Test
	public void testMeasurement() {
		Date date = new Date();
		Measurement measurementdata = new Measurement();
		measurementdata.setCreated_timestamp(date);
		measurementdata.setMeasurment_id(1);
		measurementdata.setMeasurement_type("imparial");
		measurementdata.setUpdate_timestamp(date);

		assertEquals(1, measurementdata.getMeasurement_id());
		assertEquals(date, measurementdata.getCreated_timestamp());
		assertEquals("imparial", measurementdata.getMeasurement_type());
		assertEquals(date, measurementdata.getUpdate_timestamp());
	}
}






