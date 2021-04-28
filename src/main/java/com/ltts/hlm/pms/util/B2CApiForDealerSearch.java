package com.ltts.hlm.pms.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ltts.hlm.pms.entity.PreferredDealer;

public class B2CApiForDealerSearch {
	private static final Logger LOG = LoggerFactory.getLogger(B2CApiForDealerSearch.class);

	public PreferredDealer getPreferredDealer(String POIId) {
		PreferredDealer prefDealer = new PreferredDealer();
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> call = restTemplate.getForEntity(
					"http://location.services.honda.com/poi/private?AppId=bodyshops.honda.com&POIId=" + POIId
							+ "&State=&POIType=A&SearchRadius=20&NumberOfPOIs=20&ShowAllAttributes=False&ShowAllProperties=False&ShowAllDepartments=False&Output=Json",
					String.class);
			JSONParser parser = new JSONParser();
			JSONObject jsonDealerResponse = (JSONObject) parser.parse(call.getBody());
			JSONObject poiResponse = (JSONObject) jsonDealerResponse.get("POIResponse");
			JSONObject pois = (JSONObject) poiResponse.get("POIs");
			JSONArray poi = (JSONArray) pois.get("POI");
			JSONObject dealer = (JSONObject) poi.get(0);
			prefDealer.setAddress(dealer.get("Address").toString());
			prefDealer.setCity(dealer.get("City").toString());
			prefDealer.setCountry(dealer.get("Country").toString());
			prefDealer.setDistance(dealer.get("Distance").toString());
			prefDealer.setEmail(dealer.get("Email").toString());
			prefDealer.setInternetAddress(dealer.get("InternetAddress").toString());
			prefDealer.setLatitude(dealer.get("Latitude").toString());
			prefDealer.setLongitude(dealer.get("Longitude").toString());
			prefDealer.setPhone(dealer.get("Phone").toString());
			prefDealer.setPOIId(dealer.get("POIId").toString());
			prefDealer.setPOIName(dealer.get("POIName").toString());
			prefDealer.setState(dealer.get("State").toString());
			prefDealer.setZipCode(dealer.get("ZipCode").toString());
		} catch (Exception e) {
			LOG.error("Exception in B2CApiForDealerSearch getPreferredDealer : " + e);
		}
		return prefDealer;
	}
}
