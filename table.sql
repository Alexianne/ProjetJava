CREATE DATABASE TPjava character set 'utf8';

CREATE USER 'test'@'localhost' IDENTIFIED BY 'pass';
GRANT ALL PRIVILEGES ON * . * TO 'test'@'localhost';

CREATE TABLE Constructeurs(
Name VARCHAR(32) NOT NULL, 
IDCard VARCHAR(16), 
PRIMARY KEY (Name));

CREATE TABLE Devices(
Name VARCHAR(32) NOT NULL, 
Type VARCHAR(32), 
OS VARCHAR(16), 
NetworkCard VARCHAR(32), 
NbRoom INT(11), 
PRIMARY KEY (Name));

CREATE TABLE IntercoDev(
Name VARCHAR(32) NOT NULL, 
OS VARCHAR(32), 
FW VARCHAR(32),  
NbRoom INT(11), 
PRIMARY KEY (Name));

CREATE TABLE NetworkCard(
DevName VARCHAR(32) NOT NULL, 
IDcard VARCHAR(32), 
Constr VARCHAR(32), 
PRIMARY KEY (DevName));

CREATE TABLE Room(
Site VARCHAR(32) NOT NULL, 
Type VARCHAR(32), 
NbRoom INT(11),
NbDevices INT(11),
NbIntercoDev INT(11), 
PRIMARY KEY (Site,NbRoom));

CREATE TABLE Site(
Name VARCHAR(32) NOT NULL, 
Adress VARCHAR(32), 
NbRoom INT(11), 
PRIMARY KEY (Name));

CREATE TABLE Users(
Login VARCHAR(32) NOT NULL, 
Pass VARCHAR(32), 
PRIMARY KEY (Login));










