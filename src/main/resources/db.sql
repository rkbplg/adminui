/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  631713
 * Created: 09/03/2018
 */

CREATE TABLE `XE_DEALS` (
   `ID` int(11) AUTO_INCREMENT primary key,
   `SRC` varchar(5) NOT NULL,
   `TO_CURR` varchar(5) NOT NULL,
   `RATE` decimal(28,7) NOT NULL,
   `AMOUNT` decimal(28,7) NOT NULL,
   `BUYER` varchar(45) NOT NULL) auto_increment=1;

CREATE TABLE `XE_RATES` (
  `ID` int(11) NOT NULL,
  `SRC` varchar(5) NOT NULL,
  `TO_CURR` varchar(5) NOT NULL,
  `RATE` decimal(28,7) NOT NULL,
  PRIMARY KEY (`ID`)
);

INSERT INTO XE_RATES VALUES (1, 'USD', 'AUD', 1.2);

INSERT INTO XE_RATES VALUES (2, 'USD', 'INR', 61.2);

INSERT INTO XE_RATES VALUES (3, 'USD', 'EUR', 0.8);

INSERT INTO XE_RATES VALUES (4, 'USD', 'GBP', 0.7);
