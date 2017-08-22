INSERT INTO `tbl_variable_type` (`name`, `baseUnit`,`symbol`, `internationalStandard`) VALUES ('Temperatura', 'Centigrados', 'C', true);
INSERT INTO `tbl_variable_type` (`name`, `baseUnit`,`symbol`, `internationalStandard`) VALUES ('Humedad', 'Porcentaje', '%', true);
INSERT INTO `tbl_variable_type` (`name`, `baseUnit`,`symbol`, `internationalStandard`) VALUES ('Precion atmosferica', 'mg/h', 'mg/h', true);

INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Popayan', '2.441304', '-76.605721', NOW(), 'temperature', '23');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Popayan', '2.441304', '-76.605721', NOW(), 'humidity', '30');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Cali', '3.444335', '-76.532135', NOW(), 'temperature', '29');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Cali', '3.444335', '-76.532135', NOW(), 'humidity', '25');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Bogota', '4.652806', '-74.097977', NOW(), 'temperature', '18');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Bogota', '4.652806', '-74.097977', NOW(), 'humidity', '40');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Pasto', '1.208715', '-77.27809', NOW(), 'temperature', '14');
INSERT INTO `tbl_simple_mesure` (`location`, `latitud`,`longitud`, `timestamp`, `type`, `value`) VALUES ('Pasto', '1.208715', '-77.27809', NOW(), 'humidity', '40');