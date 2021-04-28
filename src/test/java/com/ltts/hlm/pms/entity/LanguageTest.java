package com.ltts.hlm.pms.entity;

import static org.junit.Assert.assertEquals;
import java.util.Date;

import javax.persistence.Column;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class LanguageTest {

	@Test
	public void testLanguage() {
		Date date = new Date();
		Language languagedata = new Language();
		languagedata.setLanguage_id(1);
		languagedata.setCreated_timestamp(date);
		languagedata.setLanguage("English");
		languagedata.setUpdate_timestamp(date);

		assertEquals(1, languagedata.getLanguage_id());
		assertEquals(date, languagedata.getCreated_timestamp());
		assertEquals("English", languagedata.getLanguage());
		assertEquals(date, languagedata.getUpdate_timestamp());
	}
}

  











