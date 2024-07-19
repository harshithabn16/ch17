CREATE DATABASE assignment2;
USE assignment2;
CREATE TABLE hospital_info(id int,hosp_name varchar(20), hosp_add varchar(20),hosp_code bigint,patient_name varchar(20),patient_add varchar(20),patient_id int ,patient_accNo bigint,patient_adharNo bigint); 
CREATE TABLE tourist_places(id int, touristPlace_name varchar(30),tourist_name varchar(20),tourist_id int,torist_adharNo bigint,tourist_code int);

INSERT INTO hospital_info VALUES(1,'gangothri','turuvekere',123,'Harshitha','Turuvekere',567,1234567,806519393488);
INSERT INTO hospital_info VALUES(2,'Chowdri','turuvekere',345,'Megha','Turuvekere',547,1224567,806523493488);
INSERT INTO hospital_info VALUES(3,'Sidhartha','Tumkur',223,'Sapna','Benglore',527,1232567,123519393488);
INSERT INTO hospital_info VALUES(4,'Sidaganga','Tumkur',673,'Sangitha','Turuvekere',587,1289567,123419393488);
INSERT INTO hospital_info VALUES(5,'Malesia','turuvekere',133,'Harshitha B N','Turuvekere',569,1234899,806519393872);
INSERT INTO hospital_info VALUES(6,'Pretham clinic','Tiptur',183,'Prerana','bengluru',569,1234345,806512343488);
INSERT INTO hospital_info VALUES(7,'Mysore clinic','CN halli',223,'Madhura','Nvk',564,1234563,126519393488);
INSERT INTO hospital_info VALUES(8,'Apollo','Bengluru',123,'Harshitha','Turuvekere',567,1234567,806519393488);
INSERT INTO hospital_info VALUES(9,'Manipal','Bengluru',423,'Hamsa','Hubli',566,1236567,906519393488);
INSERT INTO hospital_info VALUES(10,'Jindhal','Bengluru',723,'spoorti','Turuvekere',557,1434567,256519393488);
INSERT INTO hospital_info VALUES(11,'gangothri','turuvekere',123,'Harshitha','Turuvekere',567,1234567,806519393488);
INSERT INTO hospital_info VALUES(12,'Chowdri','turuvekere',345,'Megha','Turuvekere',547,1224567,806523493488);
INSERT INTO hospital_info VALUES(13,'Sidhartha','Tumkur',223,'Sapna','Benglore',527,1232567,123519393488);
INSERT INTO hospital_info VALUES(14,'Sidaganga','Tumkur',673,'Sangitha','Turuvekere',587,1289567,123419393488);
INSERT INTO hospital_info VALUES(15,'Malesia','turuvekere',133,'Harshitha B N','Turuvekere',569,1234899,806519393872);
INSERT INTO hospital_info VALUES(16,'Pretham clinic','Tiptur',183,'Prerana','bengluru',569,1234345,806512343488);
INSERT INTO hospital_info VALUES(17,'Mysore clinic','CN halli',223,'Madhura','Nvk',564,1234563,126519393488);
INSERT INTO hospital_info VALUES(18,'Apollo','Bengluru',123,'Harshitha','Turuvekere',567,1234567,806519393488);
INSERT INTO hospital_info VALUES(19,'Manipal','Bengluru',423,'Hamsa','Hubli',566,1236567,906519393488);
INSERT INTO hospital_info VALUES(20,'Jindhal','Bengluru',723,'spoorti','Turuvekere',557,1434567,256519393488);

desc hospital_info;
select * from hospital_info;

INSERT INTO tourist_places VALUES(1,'chikamangaluru','Harshitha',123,806519393488,349);
INSERT INTO tourist_places VALUES(2,'chikamangaluru','Megha',789,996519393488,149);
INSERT INTO tourist_places VALUES(3,'Beluru','Priyanka',323,906519393488,749);
INSERT INTO tourist_places VALUES(4,'Swizarland','Mira',888,706519393488,389);
INSERT INTO tourist_places VALUES(5,'Hampi','Hamasa',223,807819393488,149);
INSERT INTO tourist_places VALUES(6,'Bengaluru','Swapna',133,906519393488,449);
INSERT INTO tourist_places VALUES(7,'Mangaluru','Madhura',323,812519393488,849);
INSERT INTO tourist_places VALUES(8,'Halebidu','Harshu ',223,823519393488,249);
INSERT INTO tourist_places VALUES(9,'Patadakallu','Kavya',983,806789393488,379);
INSERT INTO tourist_places VALUES(10,'Golgumbaz','Kanasu',666,986519393488,649);
INSERT INTO tourist_places VALUES(11,'chikamangaluru','Harshitha',123,806519393488,349);
INSERT INTO tourist_places VALUES(12,'chikamangaluru','Megha',789,996519393488,149);
INSERT INTO tourist_places VALUES(13,'Beluru','Priyanka',323,906519393488,749);
INSERT INTO tourist_places VALUES(14,'Swizarland','Mira',888,706519393488,389);
INSERT INTO tourist_places VALUES(15,'Hampi','Hamasa',223,807819393488,149);
INSERT INTO tourist_places VALUES(16,'Bengaluru','Swapna',133,906519393488,449);
INSERT INTO tourist_places VALUES(17,'Mangaluru','Madhura',323,812519393488,849);
INSERT INTO tourist_places VALUES(18,'Halebidu','Harshu ',223,823519393488,249);
INSERT INTO tourist_places VALUES(19,'Patadakallu','Kavya',983,806789393488,379);
INSERT INTO tourist_places VALUES(20,'Golgumbaz','Kanasu',666,986519393488,649);


desc tourist_places;
SELECT * FROM tourist_places;
