CREATE TABLE SunLabCardData
(
	names varchar(50) NOT NULL,
	occupation varchar(50) NOT NULL,
	PennID int,
	dateAccessed date,
	timeAccessed time PRIMARY KEY,


)


INSERT INTO SunLabCardData VALUES 
('Bob', 'Student', 983947588,'2008-1-11', '13:30'),
('Bob', 'Student', 983947588,'2008-1-11', '13:33'),
('Tristan', 'Student',990628424,'2008-5-15', '14:30'),
('John', 'Student', 912466108,'2008-6-1', '3:15'),
('Garnt', 'Teacher', 989164563,'2008-9-15', '1:00'),
('Joey', 'Janitor', 935179553,'2008-12-31', '9:12');


Select * from SunLabCardData;