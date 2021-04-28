package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertEquals;
import java.util.Date;

import javax.persistence.Column;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class TimeFormatTest {

	@Test
	public void testTimeFormat() {
		Date date = new Date();
		TimeFormat data = new TimeFormat();
		data.set_id(1);
		data.setCreated_timestamp(date);
		data.setTime_id(1);
		data.setTimeformat("12hr");
		data.setUpdate_timestamp(date);
		
		assertEquals(1,data.get_id());
		assertEquals(date,data.getCreated_timestamp());
		assertEquals(1,data.getTime_id());
		assertEquals("12hr",data.getTimeformat());
		assertEquals(date, data.getUpdate_timestamp());
	}
}





