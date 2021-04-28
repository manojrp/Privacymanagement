package com.ltts.hlm.pms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.transform.Transformers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ltts.hlm.pms.entity.DefaultNotificationPreference;
import com.ltts.hlm.pms.entity.DefaultPreferencesDto;
import com.ltts.hlm.pms.entity.NotificationJSONObject;
import com.ltts.hlm.pms.entity.NotificationPreference;
import com.ltts.hlm.pms.entity.NotificationPreferenceDTO;
import com.ltts.hlm.pms.entity.Preference;
import com.ltts.hlm.pms.entity.PreferenceCustDto;
import com.ltts.hlm.pms.entity.PreferenceDto;
import com.ltts.hlm.pms.entity.PreferredDealer;
import com.ltts.hlm.pms.entity.UpdatePreference;
import com.ltts.hlm.pms.entity.Vehicle;
import com.ltts.hlm.pms.entity.VehicleDto;
import com.ltts.hlm.pms.util.B2CApiForDealerSearch;
import com.ltts.hlm.pms.util.QueryConstants;

@Transactional
@Repository
public class PrivacyManagementDaoImpl implements PrivacyManagementDao {

	@PersistenceContext
	private EntityManager entityManager;

	private static final Logger LOG = LoggerFactory.getLogger(PrivacyManagementDaoImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject getPreferencedata(String cust_id) {
		String hql = "";
		List<PreferenceDto> preferencesData = new ArrayList<>();
		JSONObject allData = new JSONObject();
		JSONObject resObj = new JSONObject();
		JSONArray resultArry = new JSONArray();

		try {
			hql = QueryConstants.GETPREFERENCEDATA;
			preferencesData = entityManager.createNativeQuery(hql).unwrap(org.hibernate.Query.class)
					.setResultTransformer(Transformers.aliasToBean(PreferenceDto.class)).list();
			JSONArray lanArr = new JSONArray();
			JSONArray measurArr = new JSONArray();
			JSONArray dateArry = new JSONArray();
			JSONArray timeArry = new JSONArray();
			JSONArray finalArry = new JSONArray();

			JSONObject lObj = new JSONObject();
			JSONObject mObj = new JSONObject();
			JSONObject dObj = new JSONObject();
			JSONObject tObj = new JSONObject();
			JSONObject vehObj = new JSONObject();
			JSONObject defaultObj = new JSONObject();
			JSONObject prevObj = new JSONObject();

			for (int i = 0; i < preferencesData.size(); i++) {

				JSONObject langObj = new JSONObject();
				langObj.put("language_id", preferencesData.get(i).getLANGUAGE_ID());
				langObj.put("language", preferencesData.get(i).getLANGUAGE_ID());
				lanArr.put(langObj);

				JSONObject measurementObj = new JSONObject();
				measurementObj.put("measurement_id", preferencesData.get(i).getMEASUREMENT_ID());
				measurementObj.put("measurement_type", preferencesData.get(i).getMEASUREMENT_ID());
				measurArr.put(measurementObj);

				JSONObject dateObj = new JSONObject();
				dateObj.put("date_id", preferencesData.get(i).getDATE_ID());
				dateObj.put("dateformat", preferencesData.get(i).getDATEFORMAT());
				dateArry.put(dateObj);

				JSONObject timeObj = new JSONObject();
				timeObj.put("time_id", preferencesData.get(i).getTIME_ID());
				timeObj.put("timeformat", preferencesData.get(i).getTIMEFORMAT());
				timeArry.put(timeObj);

			}

			List<VehicleDto> vehlist = new ArrayList<>();
			hql = QueryConstants.GETBOATDATA+"'"+cust_id+"'";
			vehlist = entityManager.createNativeQuery(hql).unwrap(org.hibernate.Query.class)
					.setResultTransformer(Transformers.aliasToBean(VehicleDto.class)).list();

			lObj.put("Language", lanArr);
			mObj.put("Measurement", measurArr);
			dObj.put("DateFormat", dateArry);
			tObj.put("TimeFormat", timeArry);
			vehObj.put("PreferredBoat", vehlist);

			lObj.put("Language", lanArr);
			mObj.put("Measurement", measurArr);
			dObj.put("DateFormat", dateArry);
			tObj.put("TimeFormat", timeArry);
			finalArry.put(lObj);
			finalArry.put(mObj);
			finalArry.put(dObj);
			finalArry.put(tObj);
			finalArry.put(vehObj);
			allData.put("alldata", finalArry);

			// Default data
			List<DefaultPreferencesDto> defaultpreferencelist = new ArrayList<>();
			hql = QueryConstants.GETDEFAULTPREFERENCE;
			defaultpreferencelist = entityManager.createNativeQuery(hql).unwrap(org.hibernate.Query.class)
					.setResultTransformer(Transformers.aliasToBean(DefaultPreferencesDto.class)).list();
			JSONArray date_defarr = new JSONArray();
			JSONArray time_defarr = new JSONArray();
			JSONArray mes_defarr = new JSONArray();
			JSONArray lan_defarr = new JSONArray();

			JSONObject dateObj_def = new JSONObject();
			dateObj_def.put("date_id", defaultpreferencelist.get(0).getDATE_ID());
			dateObj_def.put("dateformat", defaultpreferencelist.get(0).getDATEFORMAT());
			date_defarr.put(dateObj_def);

			JSONObject timeObj_def = new JSONObject();
			timeObj_def.put("time_id", defaultpreferencelist.get(0).getTIME_ID());
			timeObj_def.put("timeformat", defaultpreferencelist.get(0).getTIMEFORMAT());
			time_defarr.put(timeObj_def);

			JSONObject measurementObj_de = new JSONObject();
			measurementObj_de.put("measurement_id", defaultpreferencelist.get(0).getMEASUREMENT_ID());
			measurementObj_de.put("measurement_type", defaultpreferencelist.get(0).getMEASUREMENT_ID());
			mes_defarr.put(measurementObj_de);

			JSONObject langObj_def = new JSONObject();
			langObj_def.put("language_id", defaultpreferencelist.get(0).getLANGUAGE_ID());
			langObj_def.put("language", defaultpreferencelist.get(0).getLANGUAGE_ID());
			lan_defarr.put(langObj_def);

			JSONObject ldef = new JSONObject();
			JSONObject mdef = new JSONObject();
			JSONObject ddef = new JSONObject();
			JSONObject tdef = new JSONObject();
			JSONArray defArry = new JSONArray();

			ldef.put("Language", lan_defarr);
			mdef.put("Measurement", mes_defarr);
			ddef.put("DateFormat", date_defarr);
			tdef.put("TimeFormat", time_defarr);

			defArry.put(ldef);
			defArry.put(mdef);
			defArry.put(ddef);
			defArry.put(tdef);

			// previously selected
			List<PreferenceCustDto> preferencelist = new ArrayList<>();

			hql = QueryConstants.GETPREFERENCEBYID + "'" + cust_id + "'";
			// preferencelist = entityManager.createNativeQuery(hql).getResultList();
			preferencelist = entityManager.createNativeQuery(hql).unwrap(org.hibernate.Query.class)
					.setResultTransformer(Transformers.aliasToBean(PreferenceCustDto.class)).list();

			JSONArray date_prevarr = new JSONArray();
			JSONArray time_prevarr = new JSONArray();
			JSONArray mes_prevarr = new JSONArray();
			JSONArray lan_prevarr = new JSONArray();
			JSONArray veh_prevarr = new JSONArray();

			if (!preferencelist.isEmpty()) {
				JSONObject dateObj_prev = new JSONObject();
				dateObj_prev.put("date_id", preferencelist.get(0).getDATE_ID());
				dateObj_prev.put("dateformat", preferencelist.get(0).getDATEFORMAT());
				date_prevarr.put(dateObj_prev);

				JSONObject timeObj_prev = new JSONObject();
				timeObj_prev.put("time_id", preferencelist.get(0).getTIME_ID());
				timeObj_prev.put("timeformat", preferencelist.get(0).getTIMEFORMAT());
				time_prevarr.put(timeObj_prev);

				JSONObject measurementObj_prev = new JSONObject();
				measurementObj_prev.put("measurement_id", preferencelist.get(0).getMEASUREMENT_ID());
				measurementObj_prev.put("measurement_type", preferencelist.get(0).getMEASUREMENT_ID());
				mes_prevarr.put(measurementObj_prev);

				JSONObject langObj_prev = new JSONObject();
				langObj_prev.put("language_id", preferencelist.get(0).getLANGUAGE_ID());
				langObj_prev.put("language", preferencelist.get(0).getLANGUAGE_ID());
				lan_prevarr.put(langObj_prev);

				JSONObject vehObj_prev = new JSONObject();
				vehObj_prev.put("vehicle_id", preferencelist.get(0).getVEHICLE_ID());
				vehObj_prev.put("vehicle_name", preferencelist.get(0).getVEHICLE_NAME());
				veh_prevarr.put(vehObj_prev);

				JSONObject lprev = new JSONObject();
				JSONObject mprev = new JSONObject();
				JSONObject ddprev = new JSONObject();
				JSONObject tprev = new JSONObject();
				JSONObject vehprev = new JSONObject();
				JSONArray previousArry = new JSONArray();

				lprev.put("Language", lan_prevarr);
				mprev.put("Measurement", mes_prevarr);
				ddprev.put("DateFormat", date_prevarr);
				tprev.put("TimeFormat", time_prevarr);
				vehprev.put("PreferredBoat", veh_prevarr);

				previousArry.put(lprev);
				previousArry.put(mprev);
				previousArry.put(ddprev);
				previousArry.put(tprev);
				previousArry.put(vehprev);
				prevObj.put("previouslySelected", previousArry);
			} else {
				prevObj.put("previouslySelected", preferencelist);
			}

			defaultObj.put("defaultData", defArry);

			// get dealer ids
			List<Preference> prefDealerIds = null;
			List<PreferredDealer> preferredDealerList = null;

			try {
				hql = QueryConstants.GETPREFERENCE + "'" + cust_id + "'";
				prefDealerIds = entityManager.createQuery(hql).getResultList();
			} catch (Exception e) {
				LOG.error("Exception in PrivacyManagementDaoImpl getPreferencedata GETPREFERENCE: " + e);
			}
			if (!prefDealerIds.isEmpty()) {

				if (prefDealerIds.get(0).getDealer_id() != null) {
					String dealerId = prefDealerIds.get(0).getDealer_id();
					String dd1 = dealerId.replace("[", "");
					String dd2 = dd1.replaceAll("]", "");
					String[] arrSplit = dd2.split(",");
					String tempStr = "";
					String splitted = "";
					for (int i = 0; i <= arrSplit.length; i++) {
						System.out.println(i + " " + arrSplit.length);

						if (i == arrSplit.length) {
							splitted = "'" + arrSplit[i - 1] + "'";
							tempStr = tempStr + splitted;
						} else {
							splitted = "'" + arrSplit[i] + "'" + ",";
							tempStr = tempStr + splitted;
						}

					}

					try {
						hql = QueryConstants.GETDEALER + tempStr + ")";
						preferredDealerList = entityManager.createQuery(hql).getResultList();
					} catch (Exception e) {
						LOG.error("Exception in PrivacyManagementDaoImpl getPreferencedata  GETPREFERENCE : " + e);

					}

				}

			} else {
				preferredDealerList = null;

			}

			JSONObject preferredDealer = new JSONObject();
			preferredDealer.put("preferredDealer", preferredDealerList);
			resultArry.put(defaultObj);
			resultArry.put(allData);
			resultArry.put(prevObj);
			resultArry.put(preferredDealer);
			resObj.put("preferenceData", resultArry);

		} catch (Exception e) {
			LOG.error("Exception in preferences data : " + e);
		}
		return resObj;
	}

	@Override
	public void updatePreferencedata(UpdatePreference updatepreference, String cust_id) {
		String hql = "";
		// check if insert or update
		List<Preference> prefList = null;
		try {
			hql = QueryConstants.GETPREFERENCE + "'" + cust_id + "'";
			prefList = entityManager.createQuery(hql).getResultList();
		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementDaoImpl updatePreferencedata  GETPREFERENCE : " + e);

		}
		if (!prefList.isEmpty()) {
			if (updatepreference.getPREFERREDDEALER() == null) {
				try {
					hql = QueryConstants.UPDATEPREFERENCEDATA + "'" + cust_id + "'";
					Query query = entityManager.createNativeQuery(hql);
					query.setParameter(1, updatepreference.getLANGUAGE().get(0).getLANGUAGE_ID());
					query.setParameter(2, updatepreference.getMEASUREMENT().get(0).getMEASUREMENT_ID());
					query.setParameter(3, updatepreference.getDATEFORMAT().get(0).getDATE_ID());
					query.setParameter(4, updatepreference.getTIMERFORMAT().get(0).getTIME_ID());
					query.setParameter(5, updatepreference.getPREFERREDBOAT().get(0).getVEHICLE_ID());
					Date date = new Date();
					query.setParameter(6, date);
					query.executeUpdate();
					LOG.info("preferences updated successfully...");
				} catch (Exception e) {
					LOG.error("Exception in preferences updated  UPDATEPREFERENCEDATA: " + e);
				}
			} else {
				try {
					hql = QueryConstants.UPDATEPREFERENCEDATADEALER + "'" + cust_id + "'";
					Query query = entityManager.createNativeQuery(hql);
					query.setParameter(1, updatepreference.getPREFERREDDEALER().get(0).getDEALER_ID());
					Date date = new Date();
					query.setParameter(2, date);
					query.executeUpdate();
					LOG.info("preferences updated successfully...");
				} catch (Exception e) {
					LOG.error("Exception in preferences updated  UPDATEPREFERENCEDATADEALER: " + e);
				}
			}

		} else {
			if (updatepreference.getPREFERREDDEALER() == null) {
				try {
					hql = QueryConstants.SAVEPREFERENCEDATA;
					Query query = entityManager.createNativeQuery(hql);
					Date date = new Date();
					query.setParameter(1, date);
					query.setParameter(2, cust_id);
					query.setParameter(3, updatepreference.getDATEFORMAT().get(0).getDATE_ID());
					query.setParameter(4, updatepreference.getLANGUAGE().get(0).getLANGUAGE_ID());
					query.setParameter(5, updatepreference.getMEASUREMENT().get(0).getMEASUREMENT_ID());
					query.setParameter(6, updatepreference.getTIMERFORMAT().get(0).getTIME_ID());
					query.setParameter(7, date);
					query.executeUpdate();
					LOG.info("preferences updated successfully...");
				} catch (Exception e) {
					LOG.error("Exception in preferences updated  SAVEPREFERENCEDATA: " + e);
				}
			} else {
				try {
					hql = QueryConstants.SAVEPREFERENCEDATADEALER;
					Query query = entityManager.createNativeQuery(hql);
					Date date = new Date();
					query.setParameter(1, date);
					query.setParameter(2, cust_id);
					query.setParameter(3, date);
					query.setParameter(4, updatepreference.getPREFERREDDEALER().get(0).getDEALER_ID());
					query.executeUpdate();
					LOG.info("preferences updated successfully...");
				} catch (Exception e) {
					LOG.error("Exception in preferences updated  SAVEPREFERENCEDATADEALER: " + e);
				}
			}

		}

		// update preferred dealer table
		if (updatepreference.getPREFERREDDEALER() != null) {
			String dealerId = updatepreference.getPREFERREDDEALER().get(0).getDEALER_ID();
			String dd1 = dealerId.replace("[", "");
			String dd2 = dd1.replaceAll("]", "");
			String[] arrSplit = dd2.split(",");
			for (int i = 0; i < arrSplit.length; i++) {
				LOG.info("Dealer id - " + arrSplit[i]);
				B2CApiForDealerSearch preferredDealer = new B2CApiForDealerSearch();
				PreferredDealer dealer = preferredDealer.getPreferredDealer(arrSplit[i]);
				List<PreferredDealer> prefDealer = null;
				try {
					hql = QueryConstants.GETDEALERYBYID + "'" + arrSplit[i] + "'";
					prefDealer = entityManager.createQuery(hql).getResultList();
				} catch (Exception e) {
					LOG.error("Exception in preferences dealer data  : " + e);
				}
				if (prefDealer.isEmpty()) {
					try {

						hql = QueryConstants.SAVEDEALERDATA;
						Query query = entityManager.createNativeQuery(hql);
						query.setParameter(1, Integer.parseInt(dealer.getPOIId()));
						query.setParameter(2, dealer.getInternetAddress());
						query.setParameter(3, dealer.getEmail());
						query.setParameter(4, dealer.getAddress());
						query.setParameter(5, dealer.getLatitude());
						query.setParameter(6, dealer.getPhone());
						query.setParameter(7, dealer.getPOIName());
						query.setParameter(8, dealer.getDistance());
						query.setParameter(9, dealer.getZipCode());
						query.setParameter(10, dealer.getCity());
						query.setParameter(11, dealer.getLongitude());
						query.setParameter(12, dealer.getState());
						query.setParameter(13, dealer.getCountry());
						query.executeUpdate();
						LOG.info("dealer data updated successfully...");
					} catch (Exception e) {
						LOG.error("Exception in preferences dealer data SAVEDEALERDATA : " + e);
					}
				}

			}
		}

	}

	@Override
	public NotificationJSONObject getNotificationPreference(String customer_id) {
		String hql = "";
		List<DefaultNotificationPreference> defNotificationPreference = null;
		NotificationJSONObject finalJSON = new NotificationJSONObject();
		// get default notification data
		try {
			hql = QueryConstants.GETDEFAULTNOTIFICATIONPREFERENCE;
			defNotificationPreference = entityManager.createQuery(hql).getResultList();
			finalJSON.setDEFAULTDATA(defNotificationPreference);
		} catch (Exception e) {
			LOG.error(
					"Exception in PrivacyManagementController getNotificationPreference GETDEFAULTNOTIFICATIONPREFERENCE : "
							+ e);

		}
		// get previously selected notification data
		List<NotificationPreference> prevNotificationData = null;
		try {
			hql = QueryConstants.GETNOTIFICATIONPREFERENCE + "'" + customer_id + "'";
			prevNotificationData = entityManager.createQuery(hql).getResultList();
			finalJSON.setPREVIOUSLYSELECTED(prevNotificationData);
		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementDaoImpl getNotificationPreference  GETNOTIFICATIONPREFERENCE : "
					+ e);

		}
		return finalJSON;
	}

	
	
	
	
	
	@Override
	public void updateNotificationPreference(NotificationPreferenceDTO notificationPreference) {
		String hql = "";
		// check if insert or update
		List<NotificationPreference> prevNotificationData = null;
		try {
			hql = QueryConstants.GETNOTIFICATIONPREFERENCE + "'" + notificationPreference.getCUSTOMER_ID() + "'";
			prevNotificationData = entityManager.createQuery(hql).getResultList();
		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementDaoImpl updateNotificationPreference  GETNOTIFICATIONPREFERENCE : "
					+ e);

		}
		if (!prevNotificationData.isEmpty()) {
			try {
				hql = QueryConstants.UPDATENOTIFICATIONPREFERENCE + "'" + notificationPreference.getCUSTOMER_ID() + "'";
				Query query = entityManager.createNativeQuery(hql);
				query.setParameter(1, notificationPreference.getEMAIL());
				query.setParameter(2, notificationPreference.getPUSHNOTIFICATION());
				query.setParameter(3, notificationPreference.getSMS());
				Date date = new Date();
				query.setParameter(4, date);
				query.executeUpdate();
			} catch (Exception e) {
				LOG.error(
						"Exception in PrivacyManagementDaoImpl updateNotificationPreference UPDATENOTIFICATIONPREFERENCE : "
								+ e);
			}
		} else {
			try {
				hql = QueryConstants.SAVENOTIFICATIONPREFERENCE;
				Query query = entityManager.createNativeQuery(hql);
				Date date = new Date();
				query.setParameter(1, date);
				query.setParameter(2, notificationPreference.getCUSTOMER_ID());
				query.setParameter(3, notificationPreference.getEMAIL());
				query.setParameter(4, notificationPreference.getPUSHNOTIFICATION());
				query.setParameter(5, notificationPreference.getSMS());
				query.setParameter(6, date);
				query.executeUpdate();
			} catch (Exception e) {
				LOG.error(
						"Exception in PrivacyManagementDaoImpl updateNotificationPreference SAVENOTIFICATIONPREFERENCE : "
								+ e);
			}
		}

	}

	@Override
	public String getTermsAndConditions() {
		String hql = "";
		List<String> fileList = null;
		String filePath = "";
		try {
			hql = QueryConstants.GETTNCFILEPATH;
			fileList = entityManager.createQuery(hql).getResultList();
			filePath = fileList.get(0).toString();
		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementDaoImpl getTermsAndConditions  : " + e);
		}
		return filePath;
	}

	@Override
	public void updateTermsAndConditions(String customer_id) {
		String hql = "";
		try {
			hql = QueryConstants.ACCEPTTNC;
			Query query = entityManager.createNativeQuery(hql);
			Date date = new Date();
			query.setParameter(1, date);
			query.setParameter(2, true);
			query.setParameter(3, customer_id);
			query.executeUpdate();
		} catch (Exception e) {
			LOG.error("Exception in PrivacyManagementDaoImpl updateTermsAndConditions : " + e);
		}

	}
}
