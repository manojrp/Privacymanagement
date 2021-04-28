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
public class EngineTest {
	@Test
	public void testEngine() {
		
		Engine data = new Engine();
		data.setEngine_id("engid");
		data.setId(12L);
		data.setVehicle_id("asdfas");
		data.setModel_id("modeid");
		data.setEngine_speed("speed");
		data.setEngine_boost_pressure("bootp");
		data.setEngine_tilt_trim("tilttrim");
		data.setEngine_temp("asdf");
		data.setAlternator_potential("potential");
		data.setFuel_rate("fueleate");
		data.setCharge_indicator("chargeInd");
		data.setCheck_engine("checked");
		data.setEmergency_stop_mode("stoped");
		data.setLow_oil_pressure("mantainted");
        data.setRated_engine_speed("ratedEng");
        data.setOver_temperature("overtemp");
        data.setRev_limit_exceeded("rev");
        data.setTransmission_gear("4");
        data.setWater_in_fuel("enterd");
        data.setTotal_engine_hours("24");
        
		assertNotNull(data.getAlternator_potential());
		assertNotNull(data.getId());
		assertNotNull(data.getCheck_engine());
		assertNotNull(data.getCharge_indicator());
		assertNotNull(data.getEmergency_stop_mode());
		assertNotNull(data.getEngine_boost_pressure());
		assertNotNull(data.getEngine_id());
		assertNotNull(data.getEngine_speed());
		assertNotNull(data.getEngine_tilt_trim());
		assertNotNull(data.getFuel_rate());
		assertNotNull(data.getId());
		assertNotNull(data.getLow_oil_pressure());
		assertNotNull(data.getModel_id());
		assertNotNull(data.getOver_temperature());
		assertNotNull(data.getRated_engine_speed());
		assertNotNull(data.getRev_limit_exceeded());
		assertNotNull(data.getTotal_engine_hours());
		assertNotNull(data.getTransmission_gear());
		assertNotNull(data.getVehicle_id());
		assertNotNull(data.getWater_in_fuel());
		
	}

}

