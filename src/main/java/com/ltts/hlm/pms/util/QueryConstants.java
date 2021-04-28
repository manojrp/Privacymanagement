package com.ltts.hlm.pms.util;

public final class QueryConstants {
	public static final String GETDEALER = "FROM PreferredDealer as pd where pd.POIId in (";
	public static final String GETDEALERYBYID = "FROM PreferredDealer as pd where pd.POIId=";
	public static final String GETPREFERENCE = "FROM Preference as pr where pr.cust_id=";
	public static final String GETPREFERENCEBYID = "SELECT d.dateformat,d.date_id,t.timeformat,t.time_id,m.measurement_type,m.measurement_id,l.language,l.language_id,veh.vehicle_name,veh.vehicle_id FROM preference_tbl p INNER JOIN date_tbl d on p.date_id=d.date_id INNER JOIN time_tbl t on p.time_id=t.time_id INNER JOIN measurement_tbl m on p.measurement_id=m.measurement_id INNER JOIN language_tbl l on p.language_id=l.language_id INNER JOIN vehicle_tbl as veh on p.vehicle_id = veh.vehicle_id WHERE p.cust_id= ";
	public static final String GETDEFAULTPREFERENCE = "SELECT d.dateformat,d.date_id,t.timeformat,t.time_id,m.measurement_type,m.measurement_id,l.language,l.language_id FROM defaultpreferences_tbl as def INNER JOIN date_tbl as d on def.date_id = d.date_id INNER JOIN language_tbl as l on def.language_id = l.language_id INNER JOIN measurement_tbl as m on def.measurement_id = m.measurement_id INNER JOIN time_tbl as t on def.time_id = t.time_id";
	public static final String GETPREFERENCEDATA = " SELECT l.language_id,l.language,m.measurement_id,m.measurement_type,d.date_id,d.dateformat,t.time_id,t.timeformat FROM language_tbl as l FULL OUTER JOIN measurement_tbl as m ON l.language_id = m.measurement_id FULL OUTER JOIN date_tbl as d ON m.measurement_id = d.date_id FULL OUTER JOIN time_tbl as t ON d.date_id = t.time_id";
	public static final String UPDATEPREFERENCEDATA = "UPDATE preference_tbl set language_id=?,measurement_id=?,date_id=?,time_id=?,vehicle_id=?,update_timestamp=? where cust_id=";
	public static final String UPDATEPREFERENCEDATADEALER = "UPDATE preference_tbl set dealer_id=?,update_timestamp=? where cust_id=";
	public static final String SAVEPREFERENCEDATA = "INSERT INTO preference_tbl (create_timestamp,cust_id,date_id,language_id,measurement_id,time_id,update_timestamp) values (?,?,?,?,?,?,?)";
	public static final String SAVEPREFERENCEDATADEALER = "INSERT INTO preference_tbl (create_timestamp,cust_id,update_timestamp,dealer_id) values (?,?,?,?)";
	public static final String GETDEFAULTNOTIFICATIONPREFERENCE = "FROM DefaultNotificationPreference as dn";
	public static final String GETNOTIFICATIONPREFERENCE = "FROM NotificationPreference as np where np.customer_id=";
	public static final String UPDATENOTIFICATIONPREFERENCE = "UPDATE notification_preference_tbl set email=?,push_notification=?,sms=?,updated_timestamp=? where customer_id=";
	public static final String SAVENOTIFICATIONPREFERENCE = "insert into notification_preference_tbl(created_timestamp,customer_id,email,push_notification,sms,updated_timestamp) values (?,?,?,?,?,?)";
	public static final String GETTNCFILEPATH = "SELECT filepath FROM TermsAndConditions as tnc";
	public static final String ACCEPTTNC = "UPDATE tnc_tbl set updated_timestamp=?,accept=?,customer_id=?";
	public static final String SAVEDEALERDATA = "INSERT INTO preferred_dealer_tbl (poiid,internet_address,email,address,latitude,phone,poiname,distance,zip_code,city,longitude,state,country) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String GETBOATDATA = "select veh.vehicle_name,veh.vehicle_id from vehicle_tbl as veh where veh.cust_id=";

}