SELECT * FROM Jobs WHERE job_location = 'China'; 

SELECT * FROM Qualifications WHERE years_experience >= 5; 

SELECT * FROM Applicant WHERE applicant_loyalty = 'Premium' AND application_job_status = 'Accepted';

SELECT * FROM Subscription ORDER BY subscription_rate DESC;

SELECT account_name, 'This users password is :', account_password FROM Accounts;

SELECT * FROM Department ORDER BY num_employees DESC, depart_name ASC;

SELECT employee_title AS Worker_Type 
FROM Employees ORDER BY employee_title;

