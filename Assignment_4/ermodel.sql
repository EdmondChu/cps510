--------------------------------------------------------
--  File created - Tuesday-October-20-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ACCOUNTS
--------------------------------------------------------

  CREATE TABLE "P6CHU"."ACCOUNTS" 
   (	"SUBSCRIPTION" VARCHAR2(25 BYTE), 
	"AGE" NUMBER, 
	"ADDRESS" VARCHAR2(25 BYTE), 
	"PHONE" NUMBER, 
	"ANAME" VARCHAR2(25 BYTE), 
	"ACCOUNTUSERID" VARCHAR2(25 BYTE), 
	"ACCUSERID" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Index SYS_C00459095
--------------------------------------------------------

  CREATE UNIQUE INDEX "P6CHU"."SYS_C00459095" ON "P6CHU"."ACCOUNTS" ("ACCOUNTUSERID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  Constraints for Table ACCOUNTS
--------------------------------------------------------

  ALTER TABLE "P6CHU"."ACCOUNTS" ADD PRIMARY KEY ("ACCOUNTUSERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ACCOUNTS
--------------------------------------------------------

  ALTER TABLE "P6CHU"."ACCOUNTS" ADD FOREIGN KEY ("ACCUSERID")
	  REFERENCES "P6CHU"."JB_USER" ("USERID") ENABLE;
