INSERT INTO persona VALUES('36711916E','Alex','Sanchez Muertazo','Calle 69',07017,687321567,DATE'2001-09-11');
INSERT INTO persona VALUES('46021986M','Hugo','Correoso Picado','Calle 67',07017,612337269,DATE'2003-10-24');

INSERT INTO vehicle VALUES('7533LHM','Citroen','SUV C3 Aircross','36711916E');
INSERT INTO vehicle VALUES('2384PAD','Fiat','Cronos','36711916E');
INSERT INTO vehicle VALUES('8234MWK','Fiat','Multipla','46021986M');

INSERT INTO multa (data_i_hora,lloc,import_multa,matricula_vehicle) VALUES (TO_DATE('18/08/2026 09:14','DD/MM/YYYY HH:MI'),'Son Rapinya',200.00,'8234MWK');

INSERT INTO accident(lloc,data_i_hora) VALUES('Son Rapinya',TO_DATE('24/11/2026 11:14','DD/MM/YYYY HH:MI'));

INSERT INTO accident_vehicle VALUES('7533LHM',5,'Choque trasero recibido');
INSERT INTO accident_vehicle VALUES('8234MWK',5,'Choque trasero');

ALTER TABLE multa ADD data_pagament DATE;