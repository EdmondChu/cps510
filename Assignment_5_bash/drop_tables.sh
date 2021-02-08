#!/bin/sh
#export LD_LIBRARY_PATH=/usr/lib/oracle/12.1/client64/lib
sqlplus64 "p6chu/06084595@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))"<<EOF
DROP TABLE Department CASCADE CONSTRAINTS; 
DROP TABLE JB_User CASCADE CONSTRAINTS;
DROP TABLE Qualifications;
DROP TABLE Accounts;
DROP TABLE Jobs;
DROP TABLE Employee;
DROP TABLE HR;
EOF