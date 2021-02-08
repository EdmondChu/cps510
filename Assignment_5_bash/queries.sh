#!/bin/sh
#export LD_LIBRARY_PATH=/usr/lib/oracle/12.1/client64/lib
sqlplus64 "p6chu/06084595@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))"<<EOF
SELECT * FROM Department;
SELECT user_id, 'This users password is :', user_pass FROM JB_User;
SELECT * FROM Qualifications WHERE years_experience >= 5;
SELECT * FROM Accounts WHERE age >= 1 ORDER BY age DESC;
SELECT company, job_location FROM Jobs ORDER BY company DESC, job_location ASC;
SELECT employee_title AS Worker_Type FROM Employee ORDER BY employee_title;
SELECT HR_id, interview FROM HR WHERE NOT (interview = 'Incomplete');