CREATE TABLE Jobs(
            job_id VARCHAR2 (25 CHAR),
            work_period VARCHAR2 (25 CHAR),
            company VARCHAR2(25 CHAR),
            salary VARCHAR2 (25 CHAR),
            job_title VARCHAR2(40 CHAR),
            job_location VARCHAR2(25 CHAR),
            job_type VARCHAR2(25 CHAR),
            job_deadline VARCHAR2 (25 CHAR),
            CONSTRAINT jobs_pk PRIMARY KEY (job_id)
);   

CREATE TABLE Qualifications(
            qualification_id VARCHAR2(25 CHAR),
            user_degree VARCHAR2(50 CHAR) DEFAULT 'Undergraduate',
            resumes VARCHAR2(100 CHAR) NOT NULL,
            years_experience INTEGER,
            cover_letter VARCHAR2(1000 CHAR) UNIQUE,
            license VARCHAR2(25 CHAR),
            CONSTRAINT qualifications_pk PRIMARY KEY (qualification_id),
            CONSTRAINT Qualifications_Jobs_fk FOREIGN KEY (qualification_id) REFERENCES Jobs(job_id)

);
          
CREATE TABLE Applicant(
            application_id VARCHAR2(25 CHAR),
            application_job_status VARCHAR2 (25 CHAR),
            applicant_loyalty VARCHAR2 (50 CHAR),
            CONSTRAINT Applicant_pk PRIMARY KEY(application_id),--Same as PRIMARY KEY
            CONSTRAINT Applicant_Qualification_fk FOREIGN KEY (application_id) REFERENCES Qualifications(qualification_id)
);

CREATE TABLE Subscription(
            subscription_id VARCHAR2(25 CHAR),
            subscription_rate INTEGER,
            subscription_type VARCHAR2 (25 CHAR) DEFAULT 'FREE',
            CONSTRAINT Subscription_pk PRIMARY KEY(subscription_id),
            CONSTRAINT Subscription_Applicant_fk FOREIGN KEY (subscription_id) REFERENCES Applicant(application_id)
);

CREATE TABLE Accounts(
            account_id VARCHAR2 (25 CHAR),
            account_name VARCHAR2 (25 CHAR) NOT NULL,
            account_password VARCHAR2 (25 CHAR) UNIQUE,
            user_email VARCHAR2 (100 CHAR),
            user_birthdate VARCHAR2 (40 CHAR),
            user_address VARCHAR2(150 CHAR),
            user_phone VARCHAR2 (25 CHAR) UNIQUE,
            CONSTRAINT accounts_pk PRIMARY KEY (account_id),
            CONSTRAINT Accounts_Applicant_fk FOREIGN KEY (account_id) REFERENCES Applicant(application_id)
);
    
            
CREATE TABLE Department(
            depart_id VARCHAR2(25 CHAR),
            depart_manager VARCHAR2(50 CHAR) NOT NULL,
            depart_name VARCHAR2(50 CHAR),
            num_employees INTEGER DEFAULT 0,
            CONSTRAINT depart_pk PRIMARY KEY(depart_id),
            CONSTRAINT Department_Jobs_fk FOREIGN KEY (depart_id) REFERENCES Jobs(job_id)
);
    

CREATE TABLE Employees(
            employee_id VARCHAR2 (25 CHAR),            
            start_date VARCHAR2(25 CHAR),
            employee_title VARCHAR2(50 CHAR),
            CONSTRAINT Employees_pk PRIMARY KEY (employee_id),
            CONSTRAINT Employees_Department_fk FOREIGN KEY (employee_id) REFERENCES Department(depart_id)
);

         
            


