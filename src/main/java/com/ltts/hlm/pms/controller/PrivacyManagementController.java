package com.ltts.hlm.pms.controller;

import java.io.File;
import java.io.FileInputStream;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.hlm.pms.entity.NotificationJSONObject;
import com.ltts.hlm.pms.entity.NotificationPreferenceDTO;
import com.ltts.hlm.pms.entity.UpdatePreference;
import com.ltts.hlm.pms.service.PrivacyManagementService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("hlmc/v1")
public class PrivacyManagementController {

	@Autowired
	private PrivacyManagementService pmsService;

	private static final Logger LOG = LoggerFactory.getLogger(PrivacyManagementController.class);

	/**
	 * 
	 * @param messageId
	 * @param Authorization
	 * @param systemId
	 * @param country_code
	 * @param language_code
	 * @return this api is used to fetch the preferences settings
	 */

	@ApiOperation(tags = "Preferences", value = "Fetches the preference data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "bad request"),
			@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
			@ApiResponse(code = 204, message = "Empty Response Content"),
			@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
			@ApiResponse(code = 415, message = "Invalid File Name in header"),
			@ApiResponse(code = 504, message = "Failed to establish Backside connection"),
			@ApiResponse(code = 503, message = "Service Unavailable") })
	@GetMapping(value = "/preferences/preferenceData")
	public ResponseEntity<?> getpreferenceData(
			@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader String messageId,
			@ApiParam(value = "Authorization", required = true) @RequestHeader String Authorization,
			@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader String systemId,
			@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader String country_code,
			@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader String language_code,
			@RequestParam("customer_id") String cust_id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000");
		responseHeaders.set("Authorization", "Bearer<4654d6asda54s6-er85475-8877654> ");
		responseHeaders.set("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios");
		responseHeaders.set("hondaHeaderType.country_code", "US");
		responseHeaders.set("hondaHeaderType.language_code", "EN");
		try {

			JSONObject preferencedata = pmsService.getPreferencedata(cust_id);
			return new ResponseEntity<>(preferencedata.toString(), responseHeaders, HttpStatus.OK);

		} catch (Exception e) {
			LOG.error("Exception in preferences data controller ::: " + e);
			return new ResponseEntity<>(responseHeaders, HttpStatus.EXPECTATION_FAILED);
		}
	}

	/**
	 * 
	 * @param messageId
	 * @param Authorization
	 * @param systemId
	 * @param country_code
	 * @param language_code
	 * @param updatepreference
	 * @param cust_id
	 * @return this api is used to update the preference data
	 */

	@ApiOperation(tags = "Preferences", value = "Update the preference data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "bad request"),
			@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
			@ApiResponse(code = 204, message = "Empty Response Content"),
			@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
			@ApiResponse(code = 415, message = "Invalid File Name in header"),
			@ApiResponse(code = 504, message = "Failed to establish Backside connection"),
			@ApiResponse(code = 503, message = "Service Unavailable") })
	@PutMapping(value = "/preferences/preferenceData")
	public ResponseEntity<?> updatepreferenceData(
			@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader String messageId,
			@ApiParam(value = "Authorization", required = true) @RequestHeader String Authorization,
			@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader String systemId,
			@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader String country_code,
			@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader String language_code,
			@RequestBody UpdatePreference updatepreference, @RequestParam("customer_id") String cust_id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000");
		responseHeaders.set("Authorization", "Bearer<4654d6asda54s6-er85475-8877654> ");
		responseHeaders.set("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios");
		responseHeaders.set("hondaHeaderType.country_code", "US");
		responseHeaders.set("hondaHeaderType.language_code", "EN");
		try {
			pmsService.updatePreferencedata(updatepreference, cust_id);
			return new ResponseEntity<>("Preference updated successfully", responseHeaders, HttpStatus.CREATED);

		} catch (Exception e) {
			LOG.error("Exception in update preferences data ::: " + e);
			return new ResponseEntity<>("Mandatory attributes missing", responseHeaders, HttpStatus.EXPECTATION_FAILED);
		}
	}

	/**
	 * 
	 * @param messageId
	 * @param Authorization
	 * @param systemId
	 * @param country_code
	 * @param language_code
	 * @param customer_id
	 * @return this api is used to fetch the notification preference for users
	 */
	@ApiOperation(tags = "Preferences", value = "Fetches the notification preference")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "bad request"),
			@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
			@ApiResponse(code = 204, message = "Empty Response Content"),
			@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
			@ApiResponse(code = 415, message = "Invalid File Name in header"),
			@ApiResponse(code = 504, message = "Failed to establish Backside connection"),
			@ApiResponse(code = 503, message = "Service Unavailable") })
	@GetMapping(value = "/preference/notification")
	public ResponseEntity<?> getNotificationPreference(
			@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader String messageId,
			@ApiParam(value = "Authorization", required = true) @RequestHeader String Authorization,
			@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader String systemId,
			@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader String country_code,
			@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader String language_code,
			@RequestParam("customer_id") String customer_id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000");
		responseHeaders.set("Authorization", "Bearer<4654d6asda54s6-er85475-8877654> ");
		responseHeaders.set("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios");
		responseHeaders.set("hondaHeaderType.country_code", "US");
		responseHeaders.set("hondaHeaderType.language_code", "EN");

		try {
			NotificationJSONObject notificationPreferenceList = pmsService.getNotificationPreference(customer_id);
			return new ResponseEntity<>(notificationPreferenceList, responseHeaders, HttpStatus.OK);

		} catch (Exception e) {
			LOG.error("Exception in VehicleHealthManagementController getNotificationPreference ::: " + e);
			return new ResponseEntity<String>(responseHeaders, HttpStatus.EXPECTATION_FAILED);
		}

	}

	/**
	 * 
	 * @param messageId
	 * @param Authorization
	 * @param systemId
	 * @param country_code
	 * @param language_code
	 * @param notificationPreference
	 * @return this API is used to update the notification preference
	 */
	@ApiOperation(tags = "Preferences", value = "Updates the notification preference")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "bad request"),
			@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
			@ApiResponse(code = 204, message = "Empty Response Content"),
			@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
			@ApiResponse(code = 415, message = "Invalid File Name in header"),
			@ApiResponse(code = 504, message = "Failed to establish Backside connection"),
			@ApiResponse(code = 503, message = "Service Unavailable") })
	@PutMapping(value = "/preference/notification")
	public ResponseEntity<?> updateNotificationPreference(
			@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader String messageId,
			@ApiParam(value = "Authorization", required = true) @RequestHeader String Authorization,
			@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader String systemId,
			@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader String country_code,
			@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader String language_code,
			@RequestBody NotificationPreferenceDTO notificationPreference) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000");
		responseHeaders.set("Authorization", "Bearer<4654d6asda54s6-er85475-8877654> ");
		responseHeaders.set("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios");
		responseHeaders.set("hondaHeaderType.country_code", "US");
		responseHeaders.set("hondaHeaderType.language_code", "EN");

		try {
			pmsService.updateNotificationPreference(notificationPreference);
			return new ResponseEntity<>("Notification preference updated", responseHeaders, HttpStatus.CREATED);

		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementController updateNotificationPreference ::: " + e);
			return new ResponseEntity<String>(responseHeaders, HttpStatus.EXPECTATION_FAILED);
		}

	}

	/**
	 * 
	 * @param messageId
	 * @param Authorization
	 * @param systemId
	 * @param country_code
	 * @param language_code
	 * @return this api is used to fetch the TnC data
	 */
	@ApiOperation(tags = "Preferences", value = "Fetches the TermsAndConditions data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "bad request"),
			@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
			@ApiResponse(code = 204, message = "Empty Response Content"),
			@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
			@ApiResponse(code = 415, message = "Invalid File Name in header"),
			@ApiResponse(code = 504, message = "Failed to establish Backside connection"),
			@ApiResponse(code = 503, message = "Service Unavailable") })
	@GetMapping(value = "/preference/tnc")
	public ResponseEntity<?> getTermsAndConditions(
			@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader String messageId,
			@ApiParam(value = "Authorization", required = true) @RequestHeader String Authorization,
			@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader String systemId,
			@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader String country_code,
			@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader String language_code) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000");
		responseHeaders.set("Authorization", "Bearer<4654d6asda54s6-er85475-8877654> ");
		responseHeaders.set("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios");
		responseHeaders.set("hondaHeaderType.country_code", "US");
		responseHeaders.set("hondaHeaderType.language_code", "EN");

		ResponseEntity<Object> responseEntity;
		try {
			String fileName = pmsService.getTermsAndConditions();
			LOG.info("File path : " + fileName);
			File file = new File(fileName);

			InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
			responseHeaders.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
			responseHeaders.add("Cache-Control", "no-cache, no-store, must-revalidate");
			responseHeaders.add("Pragma", "no-cache");
			responseHeaders.add("Expires", "0");

			responseEntity = ResponseEntity.ok().headers(responseHeaders).contentLength(file.length())
					.contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);

			return responseEntity;
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("Exception in  PrivacyManagementController getTermsAndConditions :: " + e);
			return new ResponseEntity<>("Error", responseHeaders, HttpStatus.BAD_REQUEST);

		}

	}

	/**
	 * 
	 * @param messageId
	 * @param Authorization
	 * @param systemId
	 * @param country_code
	 * @param language_code
	 * @param customer_id
	 * @return this API is used to update TnC
	 */
	@ApiOperation(tags = "Preferences", value = "Updates the TermsAndConditions data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "bad request"),
			@ApiResponse(code = 500, message = "Internal Server Error (System Issues)"),
			@ApiResponse(code = 204, message = "Empty Response Content"),
			@ApiResponse(code = 412, message = "HondaHeaderType is missing in the HTTP Header"),
			@ApiResponse(code = 415, message = "Invalid File Name in header"),
			@ApiResponse(code = 504, message = "Failed to establish Backside connection"),
			@ApiResponse(code = 503, message = "Service Unavailable") })
	@PutMapping(value = "/preference/tnc")
	public ResponseEntity<?> updateTermsAndConditions(
			@ApiParam(value = "hondaHeaderType.messageId", required = true) @RequestHeader String messageId,
			@ApiParam(value = "Authorization", required = true) @RequestHeader String Authorization,
			@ApiParam(value = "hondaHeaderType.systemId", required = true) @RequestHeader String systemId,
			@ApiParam(value = "hondaHeaderType.country_code", required = true) @RequestHeader String country_code,
			@ApiParam(value = "hondaHeaderType.language_code", required = true) @RequestHeader String language_code,
			@RequestParam("customer_id") String customer_id) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("hondaHeaderType.messageId", "550e8400-e29b-41d4-a716-446655440000");
		responseHeaders.set("Authorization", "Bearer<4654d6asda54s6-er85475-8877654> ");
		responseHeaders.set("hondaHeaderType.systemId", "com.honda.hondalink.ig_ios");
		responseHeaders.set("hondaHeaderType.country_code", "US");
		responseHeaders.set("hondaHeaderType.language_code", "EN");

		try {
			pmsService.updateTermsAndConditions(customer_id);
			return new ResponseEntity<>("TermsAndConditions accepted", responseHeaders, HttpStatus.CREATED);

		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementController updateTermsAndConditions ::: " + e);
			return new ResponseEntity<String>(responseHeaders, HttpStatus.EXPECTATION_FAILED);
		}

	}

}