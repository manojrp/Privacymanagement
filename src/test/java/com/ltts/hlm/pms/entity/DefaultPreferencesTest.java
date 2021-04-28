package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertEquals;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class DefaultPreferencesTest {

@Test
	public void testDefaultPreferences() {
		DefaultPreferences data = new DefaultPreferences();
		data.set_id(1);
		data.setDate_id(2);
		data.setLanguage_id(3);
		data.setMeasurement_id(4);
		data.setTime_id(5);

		assertEquals(1, data.get_id());
		assertEquals(2, data.getDate_id());
		assertEquals(3, data.getLanguage_id());
		assertEquals(4, data.getMeasurement_id());
		assertEquals(5, data.getTime_id());
	}
}



