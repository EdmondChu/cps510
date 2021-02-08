#!/bin/sh
#export LD_LIBRARY_PATH=/usr/lib/oracle/12.1/client64/lib
sqlplus64 "p6chu/06084595@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))"<<EOF
CREATE TABLE Department(
            depart_id VARCHAR2(10 CHAR),
            depart_manager VARCHAR2(25 CHAR) NOT NULL,
            depart_name VARCHAR2(25 CHAR),
            num_employees NUMBER DEFAULT 0,
            CONSTRAINT depart_pk PRIMARY KEY(depart_id)
);            
CREATE TABLE JB_User(
            user_id VARCHAR2(25 CHAR),
            user_pass VARCHAR2(25 CHAR) NOT NULL,
            CONSTRAINT users_pk PRIMARY KEY(user_id)--Same as PRIMARY KEY
);
CREATE TABLE Qualifications(
            qualification_id VARCHAR2(10 CHAR),
            user_degree VARCHAR2(50 CHAR) DEFAULT 'Undergraduate',
            resumes VARCHAR2(25 CHAR) NOT NULL,
            years_experience NUMBER CHECK (years_experience BETWEEN 0 AND 30),
            coverLetter VARCHAR2(1000 CHAR) UNIQUE,
            license VARCHAR2(25 CHAR),
            CONSTRAINT qualification_pk PRIMARY KEY (qualification_id),--Primary ID
            CONSTRAINT Qualifications_JBUser_fk FOREIGN KEY (resumes) REFERENCES JB_User(user_id) --Foreign ID
            ON DELETE CASCADE
);
CREATE TABLE Accounts(
            account_userID VARCHAR2 (25 CHAR),
            subscription VARCHAR2(25 CHAR) DEFAULT 'Free',
            age NUMBER,
            address VARCHAR2(25 CHAR),
            phone NUMBER UNIQUE,
            account_name VARCHAR2(25 CHAR),
            CONSTRAINT useraccountID_pk PRIMARY KEY (account_userID), --Primary Key
            CONSTRAINT account_JBUser_fk FOREIGN KEY (account_name) REFERENCES JB_User(user_id) -- Foreign Key
);
CREATE TABLE Jobs(
            job_id VARCHAR2 (20 CHAR),
            work_period NUMBER,
            company VARCHAR2(25 CHAR),
            salary NUMBER,
            job_title VARCHAR2(25 CHAR),
            job_location VARCHAR2(25 CHAR),
            job_type VARCHAR2(25 CHAR),
            CONSTRAINT jobs_pk PRIMARY KEY (job_id)--primary key
);
CREATE TABLE Employee(
            employee_id VARCHAR2 (25 CHAR),
            start_date VARCHAR2(25 CHAR),
            employee_name VARCHAR2(25 CHAR),
            employee_title VARCHAR2(25 CHAR),
            CONSTRAINT employee_pk PRIMARY KEY (employee_id)
);
CREATE TABLE HR(            
            HR_id VARCHAR (10 CHAR),
            company_id VARCHAR2(10 CHAR),
            results VARCHAR2(50 CHAR),
            interview VARCHAR2(100 CHAR),
            CONSTRAINT HR_pk PRIMARY KEY (HR_id), --Primary Key
            CONSTRAINT HR_JBUser_fk FOREIGN KEY (company_id) REFERENCES JB_User(user_id) --Foreign Key
);
EOF