DROP VIEW potential_cand;
            CREATE VIEW potential_cand (cand_UserId, cand_UserName, cand_UserExp) AS
                SELECT user_id, account_name, years_experience
                FROM Qualifications, Accounts, JBUser
                WHERE (user_degree = 'Undergraduate' AND years_experience >= 2);
            
            DROP VIEW potential_prom;
            
            CREATE VIEW potential_prom (prom_EmpId, prom_EmpStart)AS
                (SELECT employee_id, start_date
                FROM Employees
                WHERE employee_title = 'Manager')
                WITH READ ONLY;
            
            DROP VIEW potential_job;
            CREATE VIEW potential_job (job_ptitle, job_pid)AS
                (SELECT job_title, job_id
                FROM Jobs
                WHERE job_location = 'Canada');
            
            UPDATE Jobs
            SET salary = 10000;
            
                        SELECT 'Average_user_birthdate_is', AVG(user_birthdate)
            FROM Accounts;
            
            SELECT 'MIN_user_birthdate_is', MIN(user_birthdate)
            FROM Accounts;
            
            SELECT 'MAX_user_birthdate_is', MAX(user_birthdate)
            FROM Accounts;
            
            SELECT 'STDDEV_age_is', STDDEV(user_birthdate)
            FROM Accounts;