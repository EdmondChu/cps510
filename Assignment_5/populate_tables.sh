#!/bin/sh
#export LD_LIBRARY_PATH=/usr/lib/oracle/12.1/client64/lib
sqlplus64 "p6chu/06084595@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))"<<EOF
INSERT INTO Department 
            VALUES ('Admin1','Ashwin','Administration',10);

            INSERT INTO Department 
            VALUES ('Admin2','Edmond','Help Desk',30);

            INSERT INTO Department 
            VALUES ('Admin3','Brian','Human Resources',15);
            
            INSERT INTO JB_User 
            VALUES ('User1','Ashwin123');

            INSERT INTO JB_User
            VALUES ('User2','Edmond123');

            INSERT INTO JB_User 
            VALUES ('User3','Brian123');
            
            INSERT INTO Qualifications 
            VALUES ('Serial1','Undergraduate','User1',6,'CoverTitle','G');

            INSERT INTO Qualifications 
            VALUES ('Serial2','Masters','User2',14,'CoverTitle2','Smart Serve');

            INSERT INTO Qualifications 
            VALUES ('Serial3','Bachelors','User3',2,'CoverTitle3','Pilot License');
            
            INSERT INTO Accounts
            VALUES ('ID#1','Premium',16,'7 Eglinton',6478720202,'User1');
            
            INSERT INTO Accounts
            VALUES ('ID#2','Free',45,'18 Houseview',6478724302,'User2');
            
            INSERT INTO Accounts
            VALUES ('ID#3','Student',20,'6 FreeMarket',6474520201,'User3');
            
            INSERT INTO Jobs
            VALUES ('Job1', 5 , 'Samsung' , 500 , 'Software Developer' , 'Cupertino' ,'Remote');
            
            INSERT INTO Jobs
            VALUES ('Job2',18,'Apple',1800,'Janitor','San Jose','In-person');         
            
            INSERT INTO Jobs
            VALUES ('Job3',2,'Facebook',900,'Tech Support','Toronto','Temporary');
            
            INSERT INTO Employee
            VALUES ('Employee1','May 21', 'Sam', 'Apprentice');
            
            INSERT INTO Employee
            VALUES ('Employee2','July 19', 'Kevin', 'Full-time');
            
            INSERT INTO Employee
            VALUES ('Employee3','September 1', 'Steve', 'Full-time');
            
            INSERT INTO HR
            VALUES ('HR#1','User1','Rejected','Complete');
            
            INSERT INTO HR
            VALUES ('HR#2','User2','Ongoing','Incomplete');
            
            INSERT INTO HR
            VALUES ('HR#3','User3','Hired','Complete');