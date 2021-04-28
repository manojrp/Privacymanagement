drop table if exists date_tbl;
drop table if exists dealer_tbl;
drop table if exists default_notification_preference_tbl;
drop table if exists defaultpreferences_tbl;
drop table if exists engine_tbl;
drop table if exists electrical_tbl;
drop table if exists langauage_tbl;
drop table if exists location_tbl;
drop table if exists measurement_tbl;
drop table if exists network_monitoring_tbl;
drop table if exists notification_preference_tbl;
drop table if exists preference_tbl;
drop table if exists preferred_dealer_tbl;
drop table if exists tnc_tbl;
drop table if exists time_tbl;
drop table if exists vehicle_tbl;
drop table if exists vessel_tbl;



create table  date_tbl (date_id bigint, dateformat varchar(50), create_timestamp timestamp , update_timestamp timestamp );
create table  dealer_tbl (id bigint , name varchar(50), website varchar(50), address varchar(50), city varchar(50), state varchar(50), zipcode varchar(50), phone varchar(50), latitude double, longitude double, distance varchar(50));
create table  default_notification_preference_tbl (id bigint, sms boolean,push_notification boolean, email boolean );
create table  engine_tbl (id bigint, engine_id varchar(50),vehicle_id varchar(50), model_id varchar(50), engine_speed varchar(50),engine_boost_pressure varchar(50), engine_tilt_trim varchar(50), engine_temp varchar(50), alternator_potential varchar(50), fuel_rate varchar(50), total_engine_hours varchar(50),transmission_gear varchar(50), rated_engine_speed varchar(50),check_engine varchar(50), oil_temperature varchar(50),low_oil_pressure varchar(50), water_in_fuel varchar(50), charge_indicator varchar(50), rev_limit_exceeded varchar(50), emergency_stop_mode varchar(50));
create table  electrical_tbl ( id bigint, engine_id varchar(50),vehicle_id varchar(50), model_id varchar(50),battery_status_1 varchar(50), battery_status_2 varchar(50));
create table  langauage_tbl (language_id bigint,language varchar(50), create_timestamp timestamp,  update_timestamp timestamp );
create table  location_tbl (id bigint, engine_id varchar(50),vehicle_id varchar(50), model_id varchar(50), altitude varchar(50), water_depth varchar(50), gnss_position varchar(50), direction varchar(50) );
create table  measurement_tbl (measurement_id bigint,  measurement_type varchar(50),create_timestamp timestamp,update_timestamp timestamp);
create table  network_monitoring_tbl (id bigint,engine_id varchar(50),vehicle_id varchar(50),  model_id varchar(50), product_info varchar(50));
create table  notification_preference_tbl (id bigint,sms boolean, push_notification boolean, email boolean, customer_id varchar(50), created_timestamp timestamp, updated_timestamp timestamp );
create table  preference_tbl (preference_id bigint, cust_id varchar(50), dealer_id varchar(50), time_id bigint, date_id bigint, language_id bigint, measurement_id bigint, vehicle_id varchar(50), create_timestamp timestamp, update_timestamp timestamp );
create table  preferred_dealer_tbl (id bigint, POIId varchar(50), InternetAddress varchar(50), Email varchar(50), Address varchar(50), Latitude varchar(50), Phone varchar(50), POIName varchar(50), Distance varchar(50), ZipCode varchar(50), City varchar(50), Longitude varchar(50),  State varchar(50), Country varchar(50));
create table  tnc_tbl (id bigint, filename varchar(50),  filepath varchar(50), created_timestamp timestamp, updated_timestamp timestamp, customer_id varchar(50), accept boolean );
create table  time_tbl (time_id bigint, timeformat varchar(50), create_timestamp timestamp, update_timestamp timestamp);
create table  vehicle_tbl (id bigint, vehicle_id varchar(50), cust_id varchar(50), country_id varchar(50), vehicle_name varchar(50), vehicle_model_id varchar(50), manufacture_date timestamp, vehicle_vin_no varchar(50), vehicle_hull_no varchar(50), create_timestamp timestamp, update_timestamp timestamp );
create table vessel_tbl (id bigint,engine_id varchar(50), vehicle_id varchar(50), model_id varchar(50), fluid_level varchar(50),  wind_data varchar(50));
create table defaultpreferences_tbl (_id bigint, language_id bigint, measurement_id bigint, date_id bigint,  time_id bigint );


insert into date_tbl values(54690435660465356,'dd-mm-yy' , '2021-03-28 11:39:19.372', '2021-05-28 11:39:19.372');
insert into dealer_tbl values(54690435660465356,'honda','honda.com','mysore, karnataka', 'mysore','karnataka','570016','9999',23.35677,34.56567,'9999');
insert into default_notification_preference_tbl values (54690435660465356 , true, false, true );
insert into engine_tbl values (54690435660465356, '123e', '123v', '123m', '60','boost', '20', '100', 'potential', '40', '24', '4', '300', 'checked', '40', 'maintained', 'controlled','on', 'controlled', 'off');	
insert into electrical_tbl values (54690435660465356,'123e','123v', '123m', 'good', 'average');
insert into langauage_tbl values (54690435660465356 , 'English','2021-05-28 11:39:19.372','2021-05-28 11:39:19.372' );
insert into location_tbl values (54690435660465356,'123e', '123v', '123m','20.099993', '200f','right bottom','north east');
insert into  measurement_tbl values (54690435660465356, 'linear', '2021-05-28 11:39:19.372','2021-05-28 11:39:19.372' );
insert into  network_monitoring_tbl values 	(54690435660465356, '123e', '123v', '123m', 'hondaproduct');
insert into notification_preference_tbl values (54690435660465356, true , false , true , '123c', '2021-05-28 11:39:19.372' ,'2021-05-28 11:39:19.372');
insert into preference_tbl values (54690435660465356, '123c', '123D',54690435660465356, 54690435660465356, 54690435660465356, 54690435660465356,  '123v', '2021-05-28 11:39:19.372', '2021-05-28 11:39:19.372');
insert into  preferred_dealer_tbl values (54690435660465356, '123POI', '123Int', 'honda.com', 'mysore karnataka', '20.999499', '999999', 'Poiname','100', '588012' ,'mysore', '20.39393', 'karnataka', 'US');
insert into tnc_tbl values (54690435660465356, 'filename', 'filepath','2021-05-28 11:39:19.372', '2021-05-28 11:39:19.372','123c', true );
insert into time_tbl values(54690435660465356,'dd-mm-yy','2021-05-28 11:39:19.372','2021-05-28 11:39:19.372');
insert into vehicle_tbl values(54690435660465356, '123v', '123c', 'US', 'hondavehicle', '123m', '2021-05-28 11:39:19.372', '123vin','123hull' ,'2021-05-28 11:39:19.372','2021-05-28 11:39:19.372');
insert into vessel_tbl values(54690435660465356, '123e', '123v','123m', 'high', 'cool');
insert into defaultpreferences_tbl values(54690435660465356, 54690435660465356, 54690435660465356, 54690435660465356 ,54690435660465356);


