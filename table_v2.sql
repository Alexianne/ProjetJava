CREATE DATABASE TPjava2 character set 'utf8';
USE TPjava2;

CREATE TABLE Constructeurs(
ConstrName VARCHAR(32) NOT NULL, 
IDCard VARCHAR(16) NOT NULL, 
PRIMARY KEY (ConstrName));

CREATE TABLE Devices(
DevName VARCHAR(32) NOT NULL, 
TypeDev VARCHAR(32), 
OS VARCHAR(16), 
SiteName VARCHAR(32),
NumRoom INT(11), 
PRIMARY KEY (DevName));

CREATE TABLE IntercoDev(
InterCoDevName VARCHAR(32) NOT NULL, 
<<<<<<< HEAD
TypeIntercoDev VARCHAR(32),
=======
TypeIntercoDev VARCHAR(32), 
>>>>>>> origin/master
SiteName VARCHAR(32),
NumRoom INT(11), 
PRIMARY KEY (IntercoDevName));

CREATE TABLE Interfaces(
IntName VARCHAR(32),
InterCoDevName VARCHAR(32),
IpAddr VARCHAR(32), 
PRIMARY KEY (IntName,IntercoDevName));

CREATE TABLE NetworkCards(
DevName VARCHAR(32) NOT NULL, 
IntName VARCHAR(32),
IntercoDevName VARCHAR(32),
MacAddr VARCHAR(32), 
IpAddr VARCHAR(32), 
PRIMARY KEY (MacAddr));

CREATE TABLE Rooms(
SiteName VARCHAR(32) NOT NULL, 
NumRoom INT(11) NOT NULL,
TypeRoom VARCHAR(32) NOT NULL,
PRIMARY KEY (SiteName,NumRoom));

CREATE TABLE Sites(
SiteName VARCHAR(32) NOT NULL, 
Address VARCHAR(32) NOT NULL, 
PRIMARY KEY (SiteName));

CREATE TABLE Users(
Login VARCHAR(32) NOT NULL, 
Pass VARCHAR(32) NOT NULL, 
PRIMARY KEY (Login));


ALTER TABLE Rooms ADD CONSTRAINT fk_room_site FOREIGN KEY (SiteName) REFERENCES Sites (SiteName);

ALTER TABLE Devices ADD CONSTRAINT fk_dev_room FOREIGN KEY (SiteName,NumRoom) REFERENCES Rooms (SiteName,NumRoom);

ALTER TABLE IntercoDev ADD CONSTRAINT fk_intercodev_room FOREIGN KEY (SiteName,NumRoom) REFERENCES Rooms (SiteName,NumRoom);

ALTER TABLE Interfaces ADD CONSTRAINT fk_int_intercodev FOREIGN KEY (IntercoDevName) REFERENCES IntercoDev (IntercoDevName);

ALTER TABLE NetworkCards ADD CONSTRAINT fk_card_intercodev FOREIGN KEY (IntName,IntercoDevName) REFERENCES Interfaces (IntName,IntercoDevName);

ALTER TABLE NetworkCards ADD CONSTRAINT fk_card_dev FOREIGN KEY (DevName) REFERENCES Devices (DevName);



INSERT INTO `Constructeurs` (`ConstrName`, `IDCard`) VALUES
('3com', '00608C'),
('American Research Corp', '405243'),
('Apple', '080007'),
('AT&T', '08006A'),
('Cisco', '00000C'),
('Fujitsu', '00000E'),
('Fujitsu-Xerox', '080037'),
('Hewlett-Packard', '080009'),
('IBM', '08005A'),
('Intel', '00AA00'),
('Kinetics AppleTalk', '080089'),
('Mitsubishi', '080070'),
('Motorola', '08003E'),
('Qualcomm Atheros', '00248C'),
('Samsung', '0000F0'),
('Sony', '080046'),
('Synoptics', '000081'),
('XIOS', '080080');



