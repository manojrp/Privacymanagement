package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertEquals;
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
public class DateFormatTest {

	@Test
	public void testDateFormat() {
		Date date = new Date();
		DateFormat data = new DateFormat();
		data.setCreated_timestamp(date);
		data.setDate_id(1);
		data.setDateformat("DD/MM/YYYY");

		data.setUpdate_timestamp(date);

		assertEquals(1, data.getDate_id());
		assertEquals(date, data.getCreated_timestamp());
		assertEquals("DD/MM/YYYY", data.getDateformat());
		assertEquals(date, data.getUpdate_timestamp());
	}
}









