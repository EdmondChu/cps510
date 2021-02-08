SELECT job_location, COUNT(job_id) AS INTEGER_located
FROM Jobs
GROUP BY job_location;
            
SELECT account_id, account_name, years_experience,user_degree
FROM Qualifications, Accounts 
WHERE ((user_degree = 'University of Miskolc' OR user_degree = 'China Medical College')
AND years_experience BETWEEN 2 AND 10);
    
SELECT subscription_rate, account_name, user_degree, job_title
FROM Jobs j, Qualifications q, Accounts a, Subscription s
WHERE (s.subscription_rate >= 4 AND q.user_degree = 'China Medical College');
            
SELECT Employees.employee_id, Employees.start_date, Applicant.application_job_status, Applicant.applicant_loyalty
FROM Employees 
INNER JOIN Applicant
ON Employees.employee_id = Applicant.application_id;
            
--            SELECT user_id, account_name, user_birthdate, license
--            FROM JB_User u, Qualifications q, Accounts a
--            WHERE (a.user_birthdate <= 18 AND q.license >= 'G');
--
--            SELECT account_name, user_degree, job_type, address
--            FROM JB_User u, Jobs j, Qualifications q, Accounts a
--            WHERE (j.job_type =  'Intern' AND q.user_degree = 'Undergraduate');
